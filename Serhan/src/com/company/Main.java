package com.company;

public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        Human znaika = new Human("Знайка");


        Bed bed = new Bed("кровать");
        bed.takeHuman(znaika);
        znaika.wakeUp();
        znaika.wallow(bed);
        znaika.setMood(Mood.HEADACHE);
        bed.getHuman();
        znaika.doExercises();
        znaika.washFace();
        znaika.setMood(Mood.NORMAL);


        Chair chair = new Chair("Стул");
        Furniture floor = new Floor("Пол");
        Cupboard cupBoard = new Cupboard("Шкаф");
        cupBoard.open();
        Furniture table = new Table("Стол");
        Furniture windowsill = new Windowsill("Подоконник");

        table.putThing(new Book("Война и мир"));

        windowsill.putThing(new Book("Анна Каренина"));
        windowsill.putThing(new Mineral("Filosovskiy rock"));



        cupBoard.addShelf(new Shelf());
        cupBoard.addShelf(new Shelf());
        cupBoard.addShelf(new Shelf());
        cupBoard.addShelf(new Shelf());

        Chandelier chandelier = new Chandelier("люстра");

        Thing bottle1 = new ChemicalBottle("H2O");
        Thing bottle2 = new ChemicalBottle("Ar4Br3");
        Thing insects1 = new Insects("Комары");
        Thing insects2 = new Insects("Жуки");

        znaika.clean(floor);
        znaika.clean(cupBoard);

        znaika.open(cupBoard);

        cupBoard.shelves[0].addThing(bottle1);
        cupBoard.shelves[0].addThing(bottle2);
        cupBoard.shelves[1].addThing(insects1);
        cupBoard.shelves[1].addThing(insects2);

        try {
            znaika.takeThing(windowsill);
            znaika.takeThing(windowsill);
         //   znaika.takeThing(windowsill);
        } catch (hasNotThingException exception) {
            System.out.println(exception.getMessage());
        }

        cupBoard.shelves[2].addThing(znaika.getThing());
        cupBoard.shelves[2].addThing(znaika.getThing());
        znaika.stoop();
        znaika.setMood(Mood.INVERTED);
        znaika.lookAround();
        znaika.setMood(Mood.NORMAL);
        znaika.close(cupBoard);
        znaika.straighten();
        room.toss(znaika);
        room.blowOff(znaika);
        znaika.takeFurniture(chair);
        room.hitTheWall(znaika);
        znaika.broke(chandelier);
        znaika.dropFurniture(chair);
        znaika.hit(cupBoard);









        ;

    }
}
