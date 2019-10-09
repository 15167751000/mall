package cn.dnaizn.mall.sell.controller;

import cn.dnaizn.mall.DTO.SellerFormDTO;
import cn.dnaizn.mall.DTO.SellerRegisterDTO;
import cn.dnaizn.mall.VO.SellerVO;
import cn.dnaizn.mall.util.ResultVOUtil;
import cn.dnaizn.mall.utils.PhoneFormatCheckUtils;
import cn.dnaizn.mall.VO.ResultVO;
import cn.dnaizn.mall.enums.EnumUtil;
import cn.dnaizn.mall.enums.ResultEnum;
import cn.dnaizn.mall.enums.SellerStatusEnum;
import cn.dnaizn.mall.pojo.Seller;
import cn.dnaizn.mall.pojo.SellerBrief;
import cn.dnaizn.mall.pojo.SellerCat;
import cn.dnaizn.mall.service.SellerBriefService;
import cn.dnaizn.mall.service.SellerCatService;
import cn.dnaizn.mall.service.SellerService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * controller
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/seller")
public class SellerController {

    @Reference
    SellerService sellerService;

    @Reference
    SellerCatService sellerCatService;

    @Reference
    SellerBriefService sellerBriefService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 修改
     *
     * @param seller
     * @return
     */
    @RequestMapping("/update")
    public ResultVO update(@RequestBody Seller seller) {
        try {
            sellerService.update(seller);
            return ResultVOUtil.success("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVOUtil.error(1, "修改失败");
        }
    }

    /**
     * 获取实体
     *
     * @param
     * @return
     */
    @RequestMapping("/findOne")
    public ResultVO findOne() {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        SellerVO sellerVO = new SellerVO();
        BeanUtils.copyProperties(sellerService.findOne(sellerId),sellerVO);
        SellerBrief sellerBrief =sellerBriefService.findOne(sellerId);
        sellerVO.setCategory1Id(sellerBrief.getCategory1Id());
        sellerVO.setCategory2Id(sellerBrief.getCategory2Id());
        sellerVO.setCategory3Id(sellerBrief.getCategory3Id());
        sellerVO.setAvatar(sellerBrief.getAvatar());
        sellerVO.setAlbum(sellerBrief.getAlbum());
        sellerVO.setMinprice(sellerBrief.getMinprice());
        sellerVO.setAutoStatus(sellerBrief.getAutoStatus());
        sellerVO.setDeliverFee(sellerBrief.getDeliverFee());
        sellerVO.setDeliverDiscount(sellerBrief.getDeliverDiscount());
        sellerVO.setBusinessHours(sellerBrief.getBusinessHours());
        sellerVO.setIsReserve(sellerBrief.getIsReserve());
        return ResultVOUtil.success(sellerVO);
    }

    @RequestMapping("/findAll")
    public List<Seller> findAll() {
        return sellerService.findAll();
    }

    /**
     * 根据上级Id查询列表
     *
     * @param parentId
     * @return
     */
    @RequestMapping("/findByParentId")
    public List<SellerCat> findByParentId(Long parentId) {
        return sellerCatService.findByParentId(parentId);
    }

    /**
     * 表单
     *
     * @param sellerFormDTO
     * @return
     */
    @RequestMapping("/sellerFormDTO")
    public ResultVO sellerFormDTO(@RequestBody SellerFormDTO sellerFormDTO) {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        sellerFormDTO.setSellerId(sellerId);
        try {
            sellerService.SellerRegister(sellerFormDTO);
            return ResultVOUtil.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVOUtil.error(ResultEnum.PARAM_ERROR.getCode(), e.getMessage());
        }
    }

    /**
     * 返回表单
     *
     * @return
     */
    @RequestMapping("/getSellerRegisterById")
    @RolesAllowed("VISITORS")
    public ResultVO getSellerRegisterById() {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        SellerFormDTO sellerFormDTO = sellerService.getSellerRegisterById(sellerId);
        if (sellerFormDTO != null) {
            return ResultVOUtil.success(sellerFormDTO);
        } else {
            return ResultVOUtil.error(1, "该用户未申请");
        }
    }

    /**
     * 更新状态
     *
     * @return
     */
    @RequestMapping("/updateStatus")
    public ResultVO updateStatus() {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        try {
            sellerService.updateStatus(sellerId, 0);
            return ResultVOUtil.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVOUtil.error(ResultEnum.PARAM_ERROR.getCode(), e.getMessage());
        }
    }

    /**
     * 获取当前状态
     *
     * @return
     */
    @RequestMapping("/getStatus")
    public ResultVO getStatus() {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        Integer status = sellerService.findOne(sellerId).getStatus();
        if (status == 0) {
            return ResultVOUtil.success();
        } else {
            SellerStatusEnum sellerStatusEnum = EnumUtil.getByCode(status, SellerStatusEnum.class);
            return ResultVOUtil.error(sellerStatusEnum.getCode(), sellerStatusEnum.getMessage());
        }
    }

    /**
     * 店铺分类
     *
     * @param parentId
     * @return
     */
    @RequestMapping("/sellerCat")
    public ResultVO sellerCat(Long parentId) {
        List<SellerCat> sellerCat = sellerCatService.findByParentId(parentId);
        return ResultVOUtil.success(sellerCat);
    }

    /**
     * 店铺基本信息
     *
     * @return
     */
    @RequestMapping("/selleInfo")
    @RolesAllowed({"SELLER", "VISITORS"})
    public Map selleInfo() {
        String sellerId = SecurityContextHolder.getContext().getAuthentication().getName();
        SellerBrief sellerBrief = sellerBriefService.findOne(sellerId);
        Map map = new HashMap();
        map.put("sellerId", sellerBrief.getSellerId());
        map.put("nickName", sellerBrief.getNickName());
        map.put("avatar", sellerBrief.getAvatar());
        map.put("status", sellerBrief.getStatus());
        return map;
    }

    /**
     * 发送短信验证码
     *
     * @param mobile
     * @return
     */
    @RequestMapping("/sendCode")
    public ResultVO sendCode(String mobile) {
        //判断手机号格式
        if (!PhoneFormatCheckUtils.isPhoneLegal(mobile)) {
            return ResultVOUtil.error(1, "手机号格式不正确");
        }
        //判断手机号是否注册
        Seller seller = sellerService.findMobile(mobile);
        if (seller != null) {
            return ResultVOUtil.error(1, "该手机号已被注册");
        }
        try {
            sellerService.createSmsCode(mobile);//生成验证码
            return ResultVOUtil.success("验证码发送成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVOUtil.error(1, "验证码发送失败");
        }
    }


    @RequestMapping("/register")
    public ResultVO register(@RequestBody SellerRegisterDTO sellerRegisterDTO) {
        boolean checkSmsCode = sellerService.checkSmsCode(sellerRegisterDTO.getMobile(), sellerRegisterDTO.getCode());
        if (!checkSmsCode) {
            return ResultVOUtil.error(1, "验证码错误！");
        }
        Seller seller = sellerService.findOne(sellerRegisterDTO.getSellerId());
        if (seller != null) {
            return ResultVOUtil.error(1, "该用户名已被注册！");
        }
        sellerRegisterDTO.setPassword(bCryptPasswordEncoder.encode(sellerRegisterDTO.getPassword()));
        try {
            sellerService.add(sellerRegisterDTO);
            return ResultVOUtil.success("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultVOUtil.error(1, "注册失败");
        }
    }


}