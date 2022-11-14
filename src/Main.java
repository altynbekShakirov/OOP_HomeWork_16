public class Main {
    public static void main(String[] args) {

        Animal[]animals={new Eagle(),new Turtle(),new Shark()};

        for (Animal animal:animals) {
            if (animal.getClass().equals(Eagle.class)){
                System.out.println("============================================================================");
                ((Eagle) animal).fly();

                Animal eagle =new Eagle();
                eagle.vois(" guic!!! quic!!!");
                System.out.println("==============================================================================");

            } else if (animal.getClass().isInstance(Shark.class)) {


                ((Shark) animal).attack();
               Animal  turtle =new Turtle();
                turtle.vois("khuuuuu!!! khuuuu!!!");

                System.out.println("============================================================================");

            } else if (animal.getClass().isInstance(Turtle.class)) {

                ((Turtle) animal).swim();

                Animal shark = new Shark();
                shark.vois(".___...__..__._._..___.....__.....");
                System.out.println("=================================================================================");

            }


        }

        System.out.println("InstanceOf ");
       






    }
}