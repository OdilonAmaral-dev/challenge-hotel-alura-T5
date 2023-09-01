package com.alura.hotel;

import com.alura.hotel.view.MenuPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;


//@EnableJpaRepositories
//public class HotelAluraApplication {
    //public static void main(String[] args) {
    //    SwingUtilities.invokeLater(() -> {
     //       MenuPrincipal menuPrincipal = new MenuPrincipal();
     //       menuPrincipal.setVisible(true);
     //   });
     //SpringApplication.run(HotelAluraApplication.class, args);
  //  }
//}
@SpringBootApplication
public class HotelAluraApplication {
      public static void main(String[] args) {

          SwingUtilities.invokeLater(() -> {
              MenuPrincipal ex;
              ex = new MenuPrincipal();
              ex.setVisible(true);
          });
          SpringApplication.run(HotelAluraApplication.class,args);
      }
  }
