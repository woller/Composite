package Composite;

public class Main
{
    public static void main(String[] args)
    {
        IComponent lastbil = new Composite(250);

        for (int i = 0; i < 10; i++)
        {
            IComponent palle = new Composite(50);
            lastbil.add(palle);
            for (int j = 0; j < 10; j++)
            {
                IComponent kasse = new Composite(25);
                palle.add(kasse);
                for (int k = 0; k < 100; k++)
                {
                    IComponent product = new Product(10);
                    kasse.add(product);
                }
            }
        }

        System.out.println(lastbil.calculateValue());
    }
}
