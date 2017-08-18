class Casa
{
    //variables de instancia
    
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    // constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        puerta = new Square();
        pared = new Square();
        
       
    }
    
   void dibujate()
   {
       ventana.makeVisible();
       techo.makeVisible();
       puerta.makeVisible();
       pared.makeVisible(); 
   }
   
   void acomodate()
   {
       //colocar losw objetos en la posicion que le corresponde.
      techo.changeColor("black");
      pared.changeColor("green");
      techo.moveRight();
      techo.moveHorizontal(5);
      techo.moveVertical(5);
      ventana.changeColor("blue");
      ventana.changeSize(10);
      ventana.moveRight();
      ventana.moveRight();
      ventana.moveUp();
      ventana.moveHorizontal(8);
      ventana.moveVertical(-8);
      puerta.changeSize(10);
      puerta.moveDown();
      puerta.moveHorizontal(5);
   }
   
   /*void otra()
   {
       Casa casanu = new Casa();
       casanu.dibujate();
       casanu.acomodate();
       casanu.moveDown();
       casanu.moveHorizontal(30);
       
       
       
       
       
    }*/

}
