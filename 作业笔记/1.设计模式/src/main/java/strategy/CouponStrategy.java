package strategy;

/**
 * Description:
 *
 * @author LiuLin
 * @date Created on 2022/4/25
 */
public class CouponStrategy implements IpromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("使用优惠券");
    }
}
