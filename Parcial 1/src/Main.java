import Legal.*;
import Person.*;
import Place.*;

public class Main {
    public static void main(String[] args) throws AthleteRepeatException{
        Athlete argentine1 = new Athlete(32032192, "Lionel Messi", 1.60, 38, 60);
        Athlete argentine2 = new Athlete(43829992, "Pablo Lima", 1.80, 22, 90);
        Athlete argentine3 = new Athlete(39435012, "Angel Di Maria", 1.70,36, 67);
        Athlete argentine4 = new Athlete(401230976, "Cristian Romero", 1.90, 24, 80);
        Athlete argentine5 = new Athlete(442328431, "Nahuel Molina", 1.75, 20, 74);

        NationalTeam argentine = new NationalTeam("Celeste y blanco", "Argentina");

        argentine.addAthlete(argentine1);
        argentine.addAthlete(argentine2);
        argentine.addAthlete(argentine3);
        argentine.addAthlete(argentine4);
        argentine.addAthlete(argentine5);
        //argentine.addAthlete(argentine5);

        Test mundial = new Test(100, "Copa mundial de Futbol");
        Test copaAmerica = new Test(101, "Copa America de Futbol");
        Test asiaCup = new Test(102, "Copa Asiatica de futbol");

        mundial.addParticipates(argentine1);
        mundial.addParticipates(argentine2);
        mundial.addParticipates(argentine3);
        mundial.addParticipates(argentine4);
        mundial.addParticipates(argentine5);
        //mundial.addParticipates(argentine5);

        copaAmerica.addParticipates(argentine1);
        copaAmerica.addParticipates(argentine2);
        copaAmerica.addParticipates(argentine3);
        copaAmerica.addParticipates(argentine4);
        copaAmerica.addParticipates(argentine5);

        Installation stadiumAsiaOne = new Installation("Qatar", "Asia","Lusiail","Campo de futbol");
        Installation stadiumAsiaTwo = new Installation("Qatar", "Asia","974","Campo de futbol");

        Installation stadiumAmericaOne = new Installation("Brazil", "America", "Maracana", "Campo de futbol");
        Installation stadiumAmericaTwo = new Installation("Brazil", "America", "Arena Fonte Nova", "Campo de futbol");

        mundial.where(stadiumAsiaOne,16,"12/12/2023","16:00");
        mundial.where(stadiumAsiaTwo,16,"10/12/2023", "20:30");
        mundial.where(stadiumAsiaOne, 8,"20/12/2023","12:15");

        copaAmerica.where(stadiumAmericaOne,1,"5/6/2024","21:00");
        copaAmerica.where(stadiumAmericaTwo,2,"28/5/2024","20:30");

        asiaCup.where(stadiumAsiaOne, 4, "5/4/2023", "12:00");

        //Desde un objeto Instalacion. El nombre del 3er atleta de la 2da prueba.
        System.out.println("Nombre del tercer atleta de la segunda prueba desde una instalacion: " + stadiumAsiaOne.getIsMade().get(1).getParticipates().get(2).getName());

        //Desde un objeto Instalacion. El código de la 2da prueba.
        System.out.println("Codigo de la segunda prueba desde una instalacion: " + stadiumAsiaOne.getIsMade().get(1).getCode());

        //Desde un objeto EquipoNacional.La altura de todos los atletas.
        System.out.println("Altura de todos los jugadores de un equipo: ");
        for (Athlete athlete : argentine.getBelongs()){
            System.out.println(athlete.getHeight());
        }

        //Desde un objeto EquipoNacional. El peso extra de cada atleta.
        System.out.println("Altura de todos los jugadores de un equipo: ");
        for (Athlete athlete : argentine.getBelongs()){
            System.out.println(athlete.extraWeight(athlete.calculatesIMC()));
        }
    }
}