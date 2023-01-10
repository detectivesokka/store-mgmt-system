package model.Order;

/**
 *
 * @author saidutt
 */
public class GoodsOrderQueue extends OrderQueue {
    
    
    private int goodsOrderCount = 1;
    
    @Override
    public GoodsOrder newOrder () {
        
        GoodsOrder go = new GoodsOrder(goodsOrderCount++);
        this.getOrderList().add(go);
        return go;        
    }            
}
