package Composite;

public interface IComponent
{
    public double calculateValue();
    public void add(IComponent child);
    public void remove(IComponent child);
    public IComponent getChild();
}
