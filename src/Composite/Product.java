package Composite;

public class Product implements IComponent
{
    private double value;

    public Product(double value)
    {
        this.value = value;
    }

    @Override
    public double calculateValue()
    {
        return value;
    }

    //What to do with the rest?
    @Override
    public void add(IComponent child)
    {

    }

    @Override
    public void remove(IComponent child)
    {

    }

    @Override
    public IComponent getChild()
    {
        return null;
    }
}
