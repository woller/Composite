package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent
{
    private double value;
    private List<IComponent> components;

    public Composite(double value)
    {
        this.value = value;
        components = new ArrayList<IComponent>();
    }

    @Override
    public double calculateValue()
    {
        double sum = value;
        for (IComponent component : components)
        {
            sum += component.calculateValue();
        }
        return sum;
    }

    @Override
    public IComponent getChild()
    {
        return null;
    }

    @Override
    public void remove(IComponent child)
    {
        components.remove(child);
    }

    @Override
    public void add(IComponent child)
    {
        components.add(child);
    }
}
