package buidler;

public interface Builder {
    void setChicken();
    void setCola();
    void setPizza();
    KFC getKFC();
}

class ConcreteBuilder1 implements Builder{
    private KFC kfc = new KFC("big_hamburger","big_chips");

    @Override
    public void setChicken() {
        kfc.setChickens("儿童鸡腿");
    }

    @Override
    public void setCola() {
        kfc.setCola("儿童可乐");
    }

    @Override
    public void setPizza() {
        kfc.setPizza("儿童pizza");
    }

    @Override
    public KFC getKFC() {
        return kfc;
    }
}

class ConcreteBuilder2 implements Builder{
    private KFC kfc;

    @Override
    public void setChicken() {
        kfc.setChickens("成人鸡腿");
    }

    @Override
    public void setCola() {
        kfc.setCola("成人可乐");
    }

    @Override
    public void setPizza() {
        kfc.setPizza("成人pizza");
    }

    @Override
    public KFC getKFC() {
        return kfc;
    }
}
