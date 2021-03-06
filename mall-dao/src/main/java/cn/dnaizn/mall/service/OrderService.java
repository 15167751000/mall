package cn.dnaizn.mall.service;

import cn.dnaizn.mall.DTO.OrderDTO;
import cn.dnaizn.mall.VO.OrderMainVO;
import cn.dnaizn.mall.VO.OrderVO;
import cn.dnaizn.mall.VO.ResultVO;
import cn.dnaizn.mall.pojo.OrderMain;
import cn.dnaizn.mall.pojo.Printer;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 服务层接口
 *
 * @author Administrator
 */
public interface OrderService {

    /**
     * 返回全部列表
     *
     * @return
     */
    PageResult findAll(OrderDTO orderDTO, int pageNum, int pageSize);

    /**
     * 返回待结算列表
     *
     * @return
     */
    PageResult findNoSettlementPage(String sellerId, int pageNum, int pageSize);

    /**
     * 返回分页列表
     *
     * @return
     */
    PageResult findPage(int pageNum, int pageSize);


    /**
     * 增加
     */
    void add(OrderMain order);


    /**
     * 修改
     */
    void update(OrderMain order);


    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    OrderVO findOne(String id);

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    OrderMain findOneOrderMain(String id);

    /**
     * 批量删除
     *
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 分页
     *
     * @param pageNum  当前页 码
     * @param pageSize 每页记录数
     * @return
     */
    PageResult findPage(OrderMain order, int pageNum, int pageSize);

    /**
     * 接受订单
     *
     * @param orderId
     */
	Object gen(String orderId);

    /**
     * 发送配送
     *
     * @param orderId
     */
    Object deliver(String orderId, String prepare);


    /**
     * 创建打印订单
     *
     * @param orderId
     * @param sellerId
     */
	void create(String orderId, String sellerId);

    /**
     * 打印订单
     *
     * @param orderId
     */
    Object printing(String orderId);

}
