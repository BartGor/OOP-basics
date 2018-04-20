package pl.sii.homework;

public abstract class Pizza {
    protected int size;

    public abstract void doCake();

    public abstract void addSauce();

    public abstract void addAdditionals();

    public abstract void bake();

    public void prepare() {
        doCake();
        addSauce();
        addAdditionals();
        bake();
    }
}
