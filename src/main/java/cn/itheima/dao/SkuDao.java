package cn.itheima.dao;

import cn.itheima.pojo.Sku;

import java.util.List;

/**
 *
 */
public interface SkuDao {


    /**
     * 查询所有的Sku数据
     * @return
     **/

    public List<Sku> querySkuList();
}
