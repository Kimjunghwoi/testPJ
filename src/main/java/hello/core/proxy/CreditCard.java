package hello.core.proxy;

public class CreditCard implements Payment {

    Payment cash = new Cash();

    @Override
    public void pay(int amount) {

        if(amount > 100){
            System.out.println(amount + " ์ ์ฉ์นด๋");
        }else{
            cash.pay(amount);
        }

    }

}
