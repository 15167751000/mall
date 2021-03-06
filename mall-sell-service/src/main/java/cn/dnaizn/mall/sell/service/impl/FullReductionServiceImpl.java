package cn.dnaizn.mall.sell.service.impl;

import cn.dnaizn.mall.exception.MallException;
import cn.dnaizn.mall.mapper.FullReductionMapper;
import cn.dnaizn.mall.pojo.FullReduction;
import cn.dnaizn.mall.pojo.FullReductionExample;
import cn.dnaizn.mall.service.FullReductionService;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 服务实现层
 *
 * @author Administrator
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FullReductionServiceImpl implements FullReductionService {

    @Autowired
    private FullReductionMapper fullReductionMapper;

    /**
     * 查询全部
     */
    @Override
    public List<FullReduction> findAll(String seller) {
        FullReductionExample example = new FullReductionExample();
        FullReductionExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(seller);
        return fullReductionMapper.selectByExample(example);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<FullReduction> page = (Page<FullReduction>) fullReductionMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(FullReduction fullReduction) {
        FullReductionExample example = new FullReductionExample();
        FullReductionExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(fullReduction.getSellerId());
        if (fullReductionMapper.countByExample(example) > 0) {
            throw new MallException(1, "该商家已经存在满减！！");
        }
        fullReductionMapper.insert(fullReduction);
    }

    @Override
    public void updateDelete(String sellerId) {
        FullReductionExample example = new FullReductionExample();
        FullReductionExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(sellerId);
        List<FullReduction> fullReductionList = fullReductionMapper.selectByExample(example);
        for (FullReduction item : fullReductionList) {
			item.setReduction(null);
			fullReductionMapper.updateByPrimaryKey(item);
        }
    }

    /**
     * 修改
     */
    @Override
    public void update(FullReduction fullReduction) {
        FullReductionExample example = new FullReductionExample();
        FullReductionExample.Criteria criteria = example.createCriteria();
        criteria.andSellerIdEqualTo(fullReduction.getSellerId());
        List<FullReduction> fullReductionList = fullReductionMapper.selectByExample(example);
        if (fullReductionList.size()==0){
            fullReductionMapper.insertSelective(fullReduction);
            return;
        }
        fullReduction.setId(fullReductionList.get(0).getId());
        fullReductionMapper.updateByPrimaryKeySelective(fullReduction);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public FullReduction findOne(Integer id) {
        return fullReductionMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Integer[] ids) {
        for (Integer id : ids) {
            fullReductionMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(FullReduction fullReduction, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        FullReductionExample example = new FullReductionExample();
        FullReductionExample.Criteria criteria = example.createCriteria();

        if (fullReduction != null) {
            if (fullReduction.getSellerId() != null && fullReduction.getSellerId().length() > 0) {
                criteria.andSellerIdLike("%" + fullReduction.getSellerId() + "%");
            }

        }

        Page<FullReduction> page = (Page<FullReduction>) fullReductionMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
