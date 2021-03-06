package cn.dnaizn.mall.service;

import cn.dnaizn.mall.pojo.FullReduction;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface FullReductionService {

	/**
	 * 返回全部列表
	 * @return
	 */
	List<FullReduction> findAll(String sellerId);
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	void add(FullReduction fullReduction);

	/**
	 * 更新删除
	 * @param sellerId
	 */
	void updateDelete(String sellerId);
	
	/**
	 * 修改
	 */
	void update(FullReduction fullReduction);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	FullReduction findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	void delete(Integer[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	PageResult findPage(FullReduction fullReduction, int pageNum, int pageSize);
	
}
