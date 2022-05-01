public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {

        int tempHit=(int)(Math.random()*this.damage);
        int tempDef=(int)(Math.random()*this.dodge);

        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + tempHit + " hit damage.");

        if (tempDef >= tempHit) {
            System.out.println(foe.name + " dodged the hit.");
            return foe.health;
        }

        if (foe.health - tempHit < 0)
            return 0;

        return (foe.health - tempHit);
    }


}
