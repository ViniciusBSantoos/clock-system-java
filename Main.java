public class Main {
    public static void main(String[] args) {

        RelogioBrasileiro br = new RelogioBrasileiro(15, 30, 10);
        System.out.println("Brasil: " + br.getHorario());

        RelogioAmericano us = new RelogioAmericano(10, 0, 0);
        System.out.println("EUA antes: " + us.getHorario());

        // Convertendo horário brasileiro para americano
        us.converterHorario(br);

        System.out.println("EUA depois: " + us.getHorario());
    }
}