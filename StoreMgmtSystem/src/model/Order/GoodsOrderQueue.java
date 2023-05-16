package model.Order;

import java.util.ArrayList;

/**
 *
 * @author saidutt
 */
public class GoodsOrderQueue implements OrderQueue {

    private int goodsOrderCount = 1;
    private final ArrayList<GoodsOrder> goodsOrders;
    
    {
        goodsOrders = new ArrayList<>();
    }
    
    @Override
    public GoodsOrder newOrder() {

        GoodsOrder go = new GoodsOrder(goodsOrderCount++);
        this.getOrderList().add(go);
        return go;
    }

    @Override
    public void deleteOrder(int pId) {

        GoodsOrder o = searchOrder(pId);
        this.goodsOrders.remove(o);
    }

    @Override
    public GoodsOrder searchOrder(int pId) {

        for (GoodsOrder o : this.goodsOrders) {

            if (o.getOrderID() == pId) {

                return o;
            }
        }

        return null;
    }

    public ArrayList<GoodsOrder> getOrderList() {
        
        return this.goodsOrders;
    }

}
