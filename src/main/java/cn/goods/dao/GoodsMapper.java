package cn.goods.dao;

import cn.goods.entity.GoodsDetail;
import cn.goods.entity.GoodsSort;

import java.util.List;

public interface GoodsMapper {

    /**
     * 查询所有的商品分类列表信息
     */
    List<GoodsSort> queryAllGoodsSort();

    /**
     * 按分类编号查询goods_detail表中的总记录数
     * @param sortId 分类编号
     * @return
     */
    Integer queryGoodsDetailCount(long sortId);

    List<GoodsDetail> queryGoodsDetailPageList(long sortId,Integer start);

}
