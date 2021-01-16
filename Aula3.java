class Main
{


    public static void main(String args[])
    {
       
      int idade = 16;
      boolean terminouEnsinoMedio = false;

      boolean idadeIgual17 = idade == 17;

      if (idade > 18) {
        System.out.println("Você pode ver esse conteúdo");
      } else {
        System.out.println("Você não pode ver esse conteúdo");
      }

      System.out.println(idadeIgual17);
      System.out.println(idade == 18);
      System.out.println(idade > 18);
      System.out.println(idade < 18);
      System.out.println(idade >= 17);
      System.out.println(idade <= 17);
      System.out.println(idade != 17);

      if (idade >= 16 && terminouEnsinoMedio) {
        System.out.println("Você está apto para prestar nosso vestibular.");
      } else if (idade < 16) {
        System.out.println("Aguarde pequeno gafanhoto, sua hora chegará.");
      } else if (!terminouEnsinoMedio) {
        System.out.println("Aí não da hein.");
      }

      boolean valorVerdadeiro = false;
      System.out.println(valorVerdadeiro);

      System.out.println(!!true);

      int dia = 12;
      switch (dia) {
        case 1:
          System.out.println("Segunda");
          break;
        case 2:
          System.out.println("Terça");
          break;
        case 3:
          System.out.println("Quarta");
          break;
        case 4:
          System.out.println("Quinta");
          break;
        case 5:
          System.out.println("Sexta");
          break;
        case 6:
          System.out.println("Sábado");
          break;
        case 7:
          System.out.println("Domingo");
          break;
        default:
          System.out.println("Dia não existente");
          break;
      }
      // Mostrará "Quinta" (dia 4)

      int idadeSwitch = 18;

      switch (idadeSwitch) {
        case 18:
          System.out.println("Você tem 18 anos");
          break;
        case 19:
          System.out.println("Você tem 19 anos");
          break;

      }

      final int turnoManha = 1;
      final int turnoTarde = 2;
      final int turnoNoite = 3;

      int turnoAtual = 1;

      switch(turnoAtual) {
        case turnoManha:
          System.out.println("Turno manhã");
          // Programar regras referentes ao turno da manhã.
          break;
        case turnoTarde:
          System.out.println("Turno tarde");
          break;
        case turnoNoite:
          System.out.println("Turno noite");
          break;
      }
        
    }
}