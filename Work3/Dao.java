package Work3;

import java.sql.Connection;

public interface Dao {
    public void shopList(Connection connection);
    public void orderList(Connection connection);
    public void addShop(Connection connection);
    public void updateShop(Connection connection);
    public void deleShop(Connection connection);
    public void rankShop(Connection connection);
    public void addOrder(Connection connection);
    public void updateOrder(Connection connection);
    public void deleOrder(Connection connection);
}
