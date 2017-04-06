package Modelo;
import Vista.GeneralView;
import Vista.PlatoView;
import Vista.ProductoView;
import Controlador.Controlador;
import Vista.MenuView;
import Vista.MeseroView;
import Vista.StockView;
public class Restaurant91 {

    public static void main(String[] args) {  
        Controlador controlador = new Controlador();        
        GeneralView generalView = new GeneralView();
        MeseroView  meseroView = new MeseroView();
        StockView stockView = new StockView();
        PlatoView platoView = new PlatoView();
        MenuView menuView = new MenuView();
        Archivo archivo = new Archivo();
        
        ProductoView productoView = new ProductoView();
        controlador.setViewsToStockView(stockView,productoView,platoView);
        controlador.setMenuViewToMeseroView(menuView,meseroView);
        controlador.setControladorToArchivo(archivo,controlador);
        controlador.setControladorToStockView(stockView,controlador);
        controlador.setControladorToGeneralView(generalView,controlador);
        controlador.setArchivo(archivo);
        controlador.setControladorToMeseroView(meseroView,controlador);
        controlador.setStockViewToGeneralView(generalView,stockView);
        controlador.setMeseroViewToGeneralView(generalView,meseroView);
        controlador.setMeseroViewToControlador(meseroView,controlador);
        generalView.setVisible(true);
    }
    
}
