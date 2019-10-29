public class TesteAgenda
{
  public static void main(String[] args) {
    Agenda a1 = new Agenda();
    a1.setDia(5);
    a1.setMes(10);
    a1.setAno(2001);
    System.out.println(a1.showData());
    
    Agenda a2 = new Agenda();
    a2.setDia(30);
    a2.setMes(9);
    a2.setAno(2019);
    System.out.println(a2.showData());
    
    Agenda a3 = new Agenda();
    a3.setDia(21);
    a3.setMes(12);
    a3.setAno(1999);
    System.out.println(a3.showData());
  }
  
  public static class Agenda{
    private Integer dia;
    private Integer mes;
    private Integer ano;
        
    public void setDia(Integer dia){
      if (dia >= 1 && dia <= 30){
        this.dia = dia;
      } else {
        this.dia = 0;
      }
    }
    public void setMes(Integer mes){
      if (mes >= 1 && mes <= 12){
        this.mes = mes;
      } else {
        this.mes = 0;
      }
    }
    public void setAno(Integer ano){
      if (ano >= 1900 && ano <= 2100){
        this.ano = ano;
      } else {
        this.ano = 0;
      }
    }
    
    public String showData(){
        return String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/" + this.ano.toString();
    }
  }
}