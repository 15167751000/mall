package cn.dnaizn.mall.service;

import cn.dnaizn.mall.pojo.Areas;
import entity.PageResult;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface AreasService {

	/**
	 * 返回全部列表
	 * @return
	 */
	List<Areas> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	void add(Areas areas);
	
	
	/**
	 * 修改
	 */
	void update(Areas areas);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	Areas findOne(Integer id);
	
	
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
	PageResult findPage(Areas areas, int pageNum, int pageSize);
	
}