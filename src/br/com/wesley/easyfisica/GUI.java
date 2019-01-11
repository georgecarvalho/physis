
package br.com.wesley.easyfisica;

import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.ControleEspacoFinalTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.ControleEspacoInicialTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.ControleTempoGastoTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.EspacoFinalTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.EspacoFinalExeptionTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.EspacoInicialTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.TempoGastoTelaMovimentoUniforme;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.ControleEspacoPercorridoTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.ControleTempoGastoTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.ControleVelocidadeMediaTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.EspacoPercorridoTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.TempoGastoTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.VelocidadeMediaTelaVelocidadeMedia;
import br.com.wesley.easyfisica.fisica1.mecanica.cinematica.velocidademedia.VelocidadeMediaExeptionTelaVelocidadeMedia;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Wesley Eduardo
 */

public final class GUI extends javax.swing.JFrame {
    
    

    public GUI() {     
        
        initComponents();
        setIcon();
        telaInicial.setVisible(true);
        escondePaineis();
        setLocationRelativeTo(null);
        controleVelocidadeMedia.mostrarInformacoesBotoesTelaVelocidadeMedia(btExplicacaoTelaMecanica, btCinematicaTelaMecanica, btDinamicaTelaMecanica,
        btEstaticaTelaMecanica, btHidrostaticaTelaMecanica, btGravUniversalTelaMecanica, btVoltarTelaMecanica, btExplicacaoTelaCinematica,
        btVoltarTelaAnteriorCinematica, btVoltarTelaInicioCinematica, btVelocidadeMediaTelaCinematica);      
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
                                 
    }
    
    public  GUI(boolean b){}
    
      int contador = 0;
    boolean estaCadastrado = false;
    boolean fezAvaliacao = false;
    boolean admEntrou = false;
    
    ControleVelocidadeMediaTelaVelocidadeMedia controleVelocidadeMedia = new ControleVelocidadeMediaTelaVelocidadeMedia();
    ControleEspacoPercorridoTelaVelocidadeMedia controleEspacoPercorrido = new ControleEspacoPercorridoTelaVelocidadeMedia();
    ControleTempoGastoTelaVelocidadeMedia controleTempoGasto = new ControleTempoGastoTelaVelocidadeMedia();
    ControleEspacoFinalTelaMovimentoUniforme controleEspacoFinal = new ControleEspacoFinalTelaMovimentoUniforme();
    ControleEspacoInicialTelaMovimentoUniforme controleEspacoInicial = new ControleEspacoInicialTelaMovimentoUniforme();
    br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.ControleVelocidadeMediaTelaMovimentoUniforme controleVelocidadeMediaTelaMovimentoUniforme = new br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.ControleVelocidadeMediaTelaMovimentoUniforme();
    ControleTempoGastoTelaMovimentoUniforme controleTempoGastoTelaMovimentoUniforme = new ControleTempoGastoTelaMovimentoUniforme();
 
    public void escondePaineis() {
        
        telaMecanica.setVisible(false);
        telaCinematica.setVisible(false);
        telaVelocidadeMedia.setVisible(false);           
        telaMovimentoUniforme.setVisible(false);
        telaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
        telaDemonstracaoCalculoMovimentoUniforme.setVisible(false);
        telaMRUV.setVisible(false);
        telaMRUVEquacaoDeTorricelli.setVisible(false);
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli.setVisible(false);
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
        telaLogin.setVisible(false);
        telaCadastro.setVisible(false);
        telaAvaliacao.setVisible(false);
        telaAdministrador.setVisible(false);
        telaComentariosSugestoesCriticas.setVisible(false);
        telaUsuarios.setVisible(false);
        
    }
    
    public void voltaATelaInicial(){
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        escondePaineis();
       telaInicial.setVisible(true);
       admEntrou = false;
    }
    
    public static void desativaBotoesDuranteAnimacao(){
        selecionarTipodeCalculoTelaVelocidadeMedia.setEnabled(false);
        a2.setEnabled(false);
        a3.setEnabled(false);
        a5.setEnabled(false);
        a6.setEnabled(false);
        a8.setEnabled(false);
         b2.setEnabled(false);
        b3.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b8.setEnabled(false);
         c2.setEnabled(false);
        c3.setEnabled(false);
        c5.setEnabled(false);
        c6.setEnabled(false);
        c8.setEnabled(false);
        a9.setEnabled(false);
        b9.setEnabled(false);
        c9.setEnabled(false);
        btVoltarTelaVelocidadeMedia.setEnabled(false);
        btInicioTelaVelocidadeMedia.setEnabled(false);
        btVisualizarCalculoTelaVelocidadeMedia.setEnabled(false);
    }
    public static void ativaBotoesDepoisDaAnimacao(){
       selecionarTipodeCalculoTelaVelocidadeMedia.setEnabled(true);
       a2.setEnabled(true);
        a3.setEnabled(true);
        a5.setEnabled(true);
        a6.setEnabled(true);
        a8.setEnabled(true);
         b2.setEnabled(true);
        b3.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b8.setEnabled(true);
         c2.setEnabled(true);
        c3.setEnabled(true);
        c5.setEnabled(true);
        c6.setEnabled(true);
        c8.setEnabled(true);
        a9.setEnabled(true);
        b9.setEnabled(true);
        c9.setEnabled(true);
        btVoltarTelaVelocidadeMedia.setEnabled(true);
        btInicioTelaVelocidadeMedia.setEnabled(true);
        btVisualizarCalculoTelaVelocidadeMedia.setEnabled(true);
    }
    
    public static void desativaBotaoPausaEContinua(){
        btContinuaTelaVelocidadeMedia.setEnabled(false);
        btPausaTelaVelocidadeMedia.setEnabled(false);
       
    }

    
    public static void ativaBotaoPausaEContinua(){
        btContinuaTelaVelocidadeMedia.setEnabled(true);
        btPausaTelaVelocidadeMedia.setEnabled(true);
      
    }
    
    
    
    public static String converteHorasEmMinutos(double tempo){
        
        
            int hora = 0;
            double min = 0;
        
            if(tempo<10.0){
                hora = (int)tempo/10;
                min = tempo%10;
            
            }else if(tempo>=10.0 && tempo < 100){
                hora = (int)tempo/100;
                min = tempo%100;
            }else if(tempo>=100.0 && tempo < 1000){
                hora = (int)tempo/1000;
                min = tempo%1000;
            }else if(tempo>=1000.0 && tempo < 10000){
                hora = (int)tempo/10000;
                min = tempo%10000;
            }else if(tempo>=10000.0 && tempo < 100000){
                hora = (int)tempo/100000;
                min = tempo%100000;
            }else if(tempo>=100000.0 && tempo < 1000000){
                hora = (int)tempo/1000000;
                min = tempo%1000000;
            }         
            
            double minutos = hora + (min*60);            
            
            int resultadoHora = (int)minutos/60;
            int resultadoMin = (int)minutos%60;
            
            
            String resultado = resultadoHora + "h " + resultadoMin + "min";
            
            
            return resultado;
    }

    private final ArrayList<String> caminhoImagensAleatorio = new ArrayList<String>(){
        {

        // add("/br/com/wesley/easyfisica/imagenscarrinhos/1.png");
        // add("/br/com/wesley/easyfisica/imagenscarrinhos/2.png");
        // add("/br/com/wesley/easyfisica/imagenscarrinhos/3.png");
        // add("/br/com/wesley/easyfisica/imagenscarrinhos/4.png");     
         //add("/br/com/wesley/easyfisica/imagenscarrinhos/7.png");              
         //add("/br/com/wesley/easyfisica/imagenscarrinhos/10.png");
        // add("/br/com/wesley/easyfisica/imagenscarrinhos/11.png");
         add("/br/com/wesley/easyfisica/imagenscarrinhos/civic.png");
         
         

        }
    };
  
   private  String getAleatorio(ArrayList<String> lista){
        Random random = new Random();
        return lista.get(random.nextInt(caminhoImagensAleatorio.size()));
    }

   public void gerenciadorVisualizacaoDeDadosParaCalculosTelaVelocidadeMedia(){
        if(selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Velocidade Média")){
                      
            
            a1.setVisible(true);
            a2.setVisible(true);
            a3.setVisible(true);
            a4.setVisible(true);
            a5.setVisible(true);
            a6.setVisible(true);
            a7.setVisible(true);
            a8.setVisible(true);
            a9.setVisible(true);           
            a10.setVisible(true);

            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
            b10.setVisible(false);

            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
            c9.setVisible(false);
            c10.setVisible(false);
            
            txtVelocidadeMediaTelaVelocidadeMedia.setVisible(true);
            txtFormulaEspacoPercorridoTelaVelocidadeMedia.setVisible(false);
            txtTempoGastoTelaVelocidadeMedia.setVisible(false);
        
        } else if(selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Espaço Percorrido")){
            
            txtVelocidadeMediaTelaVelocidadeMedia.setVisible(false);
            txtFormulaEspacoPercorridoTelaVelocidadeMedia.setVisible(true);
            txtTempoGastoTelaVelocidadeMedia.setVisible(false);

           
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            a4.setVisible(false);
            a5.setVisible(false);
            a6.setVisible(false);
            a7.setVisible(false);
            a8.setVisible(false);
            a9.setVisible(false);         
            a10.setVisible(false);            
            
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);        
            b10.setVisible(true);

            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
            c7.setVisible(false);
            c8.setVisible(false);
            c9.setVisible(false);
            c10.setVisible(false);            
        }else{
           
            txtVelocidadeMediaTelaVelocidadeMedia.setVisible(false);
            txtFormulaEspacoPercorridoTelaVelocidadeMedia.setVisible(false);
            txtTempoGastoTelaVelocidadeMedia.setVisible(true);

            
            a1.setVisible(false);
            a2.setVisible(false);
            a3.setVisible(false);
            a4.setVisible(false);
            a5.setVisible(false);
            a6.setVisible(false);
            a7.setVisible(false);
            a8.setVisible(false);
            a9.setVisible(false);          
            a10.setVisible(false);            
            
            b1.setVisible(false);
            b2.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);          
            b10.setVisible(false);  

            c1.setVisible(true);
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(true);
            c7.setVisible(true);
            c8.setVisible(true);
            c9.setVisible(true);        
            c10.setVisible(true);    
        }
        
        
        txtAux1.setText("0 km");
        txtAux2.setText("0 hr");
        txtAux3.setText("x hr");
        txtAux4.setText("x km");
        txtAux5.setText("x hr");
        txtAux6.setText("x km");
        txtAux7.setText("x hr");
        txtAux8.setText("x km");

        carrinhoTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource(getAleatorio(caminhoImagensAleatorio))));

        km1.setText("");
        t1.setText("");
        km2.setText("");
        t2.setText("");
        km3.setText("");
        t3.setText("");
        km4.setText("");
        t4.setText("");
        velocidadeTelaVelocidadeMedia.setText("");
        a2.setText("");
        a5.setText("");
        a10.setText("");
        a3.setSelectedItem("Km");
        a6.setSelectedItem("Hr");
        a8.setSelectedItem("Km/h");
        
        b2.setText("");
        b5.setText("");
        b10.setText("");
        b3.setSelectedItem("Km/h");
        b6.setSelectedItem("Hr");
        b8.setSelectedItem("Km");
        
        c2.setText("");
        c5.setText("");
        c10.setText("");
        c3.setSelectedItem("Km/h");
        c6.setSelectedItem("Km");
        c8.setSelectedItem("Hr");

        new Thread() {
            @Override
            public void run() {
                int posicaoInicial = carrinhoTelaVelocidadeMedia.getLocation().x;
                int x = carrinhoTelaVelocidadeMedia.getLocation().x;
                int y = carrinhoTelaVelocidadeMedia.getLocation().y;
                while (true) {
                    x--;
                    if (x <= 0) {
                        break;
                    }
                    carrinhoTelaVelocidadeMedia.setLocation(x, y);
                    try {
                        sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
    }
   
   public void gerenciadorVisualizacaoDeDadosParaCalculosTelaMovimentoUniforme(){
        if(selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Final")){
                    
           
            txtFormulaSTelaMovimentoUniforme.setVisible(true);
            txtFormulaSoTelaMovimentoUniforme.setVisible(false);
            txtFormulaVTelaMovimentoUniforme.setVisible(false);
            txtFormulaTTelaMovimentoUniforme.setVisible(false);
            
            a_1.setVisible(true);
            a_2.setVisible(true);
            a_3.setVisible(true);
            a_4.setVisible(true);
            a_5.setVisible(true);
            a_6.setVisible(true);
            a_7.setVisible(true);
            a_8.setVisible(true);
            a_9.setVisible(true);           
            a_10.setVisible(true);   
            a_11.setVisible(true);
            a_12.setVisible(true);
            a_13.setVisible(true);

            b_1.setVisible(false);
            b_2.setVisible(false);
            b_3.setVisible(false);
            b_4.setVisible(false);
            b_5.setVisible(false);
            b_6.setVisible(false);
            b_7.setVisible(false);
            b_8.setVisible(false);
            b_9.setVisible(false);
            b_10.setVisible(false);               
            b_11.setVisible(false);
            b_12.setVisible(false);
            b_13.setVisible(false);

            c_1.setVisible(false);
            c_2.setVisible(false);
            c_3.setVisible(false);
            c_4.setVisible(false);
            c_5.setVisible(false);
            c_6.setVisible(false);
            c_7.setVisible(false);
            c_8.setVisible(false);
            c_9.setVisible(false);
            c_10.setVisible(false);   
            c_11.setVisible(false);
            c_12.setVisible(false);
            c_13.setVisible(false);
        
            
            d_1.setVisible(false);
            d_2.setVisible(false);
            d_3.setVisible(false);
            d_4.setVisible(false);
            d_5.setVisible(false);
            d_6.setVisible(false);
            d_7.setVisible(false);
            d_8.setVisible(false);
            d_9.setVisible(false);
            d_10.setVisible(false);   
            d_11.setVisible(false);
            d_12.setVisible(false);
            d_13.setVisible(false);
            
        } else if(selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Inicial")){
        
           
            txtFormulaSTelaMovimentoUniforme.setVisible(false);
            txtFormulaSoTelaMovimentoUniforme.setVisible(true);
            txtFormulaVTelaMovimentoUniforme.setVisible(false);
            txtFormulaTTelaMovimentoUniforme.setVisible(false);            
            
            a_1.setVisible(false);
            a_2.setVisible(false);
            a_3.setVisible(false);
            a_4.setVisible(false);
            a_5.setVisible(false);
            a_6.setVisible(false);
            a_7.setVisible(false);
            a_8.setVisible(false);
            a_9.setVisible(false);           
            a_10.setVisible(false);   
            a_11.setVisible(false);
            a_12.setVisible(false);
            a_13.setVisible(false);

            b_1.setVisible(true);
            b_2.setVisible(true);
            b_3.setVisible(true);
            b_4.setVisible(true);
            b_5.setVisible(true);
            b_6.setVisible(true);
            b_7.setVisible(true);
            b_8.setVisible(true);
            b_9.setVisible(true);
            b_10.setVisible(true);
            b_11.setVisible(true);
            b_12.setVisible(true);
            b_13.setVisible(true);

            c_1.setVisible(false);
            c_2.setVisible(false);
            c_3.setVisible(false);
            c_4.setVisible(false);
            c_5.setVisible(false);
            c_6.setVisible(false);
            c_7.setVisible(false);
            c_8.setVisible(false);
            c_9.setVisible(false);
            c_10.setVisible(false);
            c_11.setVisible(false);
            c_12.setVisible(false);
            c_13.setVisible(false);
        
            
            d_1.setVisible(false);
            d_2.setVisible(false);
            d_3.setVisible(false);
            d_4.setVisible(false);
            d_5.setVisible(false);
            d_6.setVisible(false);
            d_7.setVisible(false);
            d_8.setVisible(false);
            d_9.setVisible(false);
            d_10.setVisible(false);
            d_11.setVisible(false);
            d_12.setVisible(false);
            d_13.setVisible(false);
            
        }else if((selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Velocidade Média"))){
           
            
            
            txtFormulaSTelaMovimentoUniforme.setVisible(false);
            txtFormulaSoTelaMovimentoUniforme.setVisible(false);
            txtFormulaVTelaMovimentoUniforme.setVisible(true);
            txtFormulaTTelaMovimentoUniforme.setVisible(false);
            
            a_1.setVisible(false);
            a_2.setVisible(false);
            a_3.setVisible(false);
            a_4.setVisible(false);
            a_5.setVisible(false);
            a_6.setVisible(false);
            a_7.setVisible(false);
            a_8.setVisible(false);
            a_9.setVisible(false);           
            a_10.setVisible(false);  
            a_11.setVisible(false);
            a_12.setVisible(false);
            a_13.setVisible(false);

            b_1.setVisible(false);
            b_2.setVisible(false);
            b_3.setVisible(false);
            b_4.setVisible(false);
            b_5.setVisible(false);
            b_6.setVisible(false);
            b_7.setVisible(false);
            b_8.setVisible(false);
            b_9.setVisible(false);
            b_10.setVisible(false);
            b_11.setVisible(false);            
            b_12.setVisible(false);
            b_13.setVisible(false);

            c_1.setVisible(true);
            c_2.setVisible(true);
            c_3.setVisible(true);
            c_4.setVisible(true);
            c_5.setVisible(true);
            c_6.setVisible(true);
            c_7.setVisible(true);
            c_8.setVisible(true);
            c_9.setVisible(true);
            c_10.setVisible(true);
            c_11.setVisible(true);
            c_12.setVisible(true);
            c_13.setVisible(true);
        
            
            d_1.setVisible(false);
            d_2.setVisible(false);
            d_3.setVisible(false);
            d_4.setVisible(false);
            d_5.setVisible(false);
            d_6.setVisible(false);
            d_7.setVisible(false);
            d_8.setVisible(false);
            d_9.setVisible(false);
            d_10.setVisible(false);
            d_11.setVisible(false);
            d_12.setVisible(false);
            d_13.setVisible(false);
        }else{
            
            
            
            txtFormulaSTelaMovimentoUniforme.setVisible(false);
            txtFormulaSoTelaMovimentoUniforme.setVisible(false);
            txtFormulaVTelaMovimentoUniforme.setVisible(false);
            txtFormulaTTelaMovimentoUniforme.setVisible(true);
            
            a_1.setVisible(false);
            a_2.setVisible(false);
            a_3.setVisible(false);
            a_4.setVisible(false);
            a_5.setVisible(false);
            a_6.setVisible(false);
            a_7.setVisible(false);
            a_8.setVisible(false);
            a_9.setVisible(false);           
            a_10.setVisible(false);           
            a_11.setVisible(false);
            a_12.setVisible(false);
            a_13.setVisible(false);

            b_1.setVisible(false);
            b_2.setVisible(false);
            b_3.setVisible(false);
            b_4.setVisible(false);
            b_5.setVisible(false);
            b_6.setVisible(false);
            b_7.setVisible(false);
            b_8.setVisible(false);
            b_9.setVisible(false);
            b_10.setVisible(false);
            b_11.setVisible(false);
            b_12.setVisible(false);
            b_13.setVisible(false);

            c_1.setVisible(false);
            c_2.setVisible(false);
            c_3.setVisible(false);
            c_4.setVisible(false);
            c_5.setVisible(false);
            c_6.setVisible(false);
            c_7.setVisible(false);
            c_8.setVisible(false);
            c_9.setVisible(false);
            c_10.setVisible(false);
            c_11.setVisible(false);
            c_12.setVisible(false);
            c_13.setVisible(false);
        
            
            d_1.setVisible(true);
            d_2.setVisible(true);
            d_3.setVisible(true);
            d_4.setVisible(true);
            d_5.setVisible(true);
            d_6.setVisible(true);
            d_7.setVisible(true);
            d_8.setVisible(true);
            d_9.setVisible(true);
            d_10.setVisible(true);
            d_11.setVisible(true);
            d_12.setVisible(true);
            d_13.setVisible(true);
        }
        
        
        txtkm1.setText("0 km");
        txtt1.setText("0 hr");
        txtt4.setText("x hr");
        txtkm4.setText("x km");
        txtt3.setText("x hr");
        txtkm3.setText("x km");
        txtt2.setText("x hr");
        txtkm2.setText("x km");

        carrinho_1.setIcon(new javax.swing.ImageIcon(getClass().getResource(getAleatorio(caminhoImagensAleatorio))));

        k1_1.setText("");
        t1_1.setText("");
        k2_2.setText("");
        t2_2.setText("");
        k2_2.setText("");
        t3_3.setText("");
        k3_3.setText("");
        t3_3.setText("");
        velocidade_1.setText("");
        
        a_2.setText("");
        a_5.setText("");
        a_8.setText("");
        a_13.setText("");
        a_3.setSelectedItem("Km");
        a_6.setSelectedItem("Km/h");
        a_9.setSelectedItem("Hr");
        a_11.setSelectedItem("Km");
        
       b_2.setText("");
        b_5.setText("");
        b_8.setText("");
        b_13.setText("");
        b_3.setSelectedItem("Km");
        b_6.setSelectedItem("Km/h");
        b_9.setSelectedItem("Hr");
        b_11.setSelectedItem("Km");
        
        c_2.setText("");
        c_5.setText("");
        c_8.setText("");
        c_13.setText("");
        c_3.setSelectedItem("Km");
        c_6.setSelectedItem("Km");
        c_9.setSelectedItem("Hr");
        c_11.setSelectedItem("Km/h");
        
           
        d_2.setText("");
        d_5.setText("");
        d_8.setText("");
        d_13.setText("");
        d_3.setSelectedItem("Km");
        d_6.setSelectedItem("Km");
        d_9.setSelectedItem("Km/h");
        d_11.setSelectedItem("Hr");

        new Thread() {
            @Override
            public void run() {
                int posicaoInicial = carrinho_1.getLocation().x;
                int x = carrinho_1.getLocation().x;
                int y = carrinho_1.getLocation().y;
                while (true) {
                    x--;
                    if (x <= 0) {
                        break;
                    }
                    carrinho_1.setLocation(x, y);
                    try {
                        sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
    }
   
   public void gerenciadorVisualizacaoDeDadosParaCalculosTelaMRUVTorricelli(){
       if(selecionarTipoDeCalculoTelaMRUVTorricelli.getSelectedItem().equals("Velocidade Final")){
                    
           
            txtFormulaVTelaMRUVTorricelli.setVisible(true);
            txtFormulaVoTelaMRUVTorricelli.setVisible(false);
            txtFormulaATelaMRUVTorricelli.setVisible(false);
            txtFormulaDeltaSTelaMRUVTorricelli.setVisible(false);
            
            a1_MRUVTorricelli.setVisible(true);
            a2_MRUVTorricelli.setVisible(true);
            a3_MRUVTorricelli.setVisible(true);
            a4_MRUVTorricelli.setVisible(true);
            a5_MRUVTorricelli.setVisible(true);
            a6_MRUVTorricelli.setVisible(true);
            a7_MRUVTorricelli.setVisible(true);
            a8_MRUVTorricelli.setVisible(true);
            a9_MRUVTorricelli.setVisible(true);           
            a10_MRUVTorricelli.setVisible(true);   
            a11_MRUVTorricelli.setVisible(true);
            a12_MRUVTorricelli.setVisible(true);
            a13_MRUVTorricelli.setVisible(true);

            b1_MRUVTorricelli.setVisible(false);
            b2_MRUVTorricelli.setVisible(false);
            b3_MRUVTorricelli.setVisible(false);
            b4_MRUVTorricelli.setVisible(false);
            b5_MRUVTorricelli.setVisible(false);
            b6_MRUVTorricelli.setVisible(false);
            b7_MRUVTorricelli.setVisible(false);
            b8_MRUVTorricelli.setVisible(false);
            b9_MRUVTorricelli.setVisible(false);           
            b10_MRUVTorricelli.setVisible(false);   
            b11_MRUVTorricelli.setVisible(false);
            b12_MRUVTorricelli.setVisible(false);
            b13_MRUVTorricelli.setVisible(false);

            c1_MRUVTorricelli.setVisible(false);
            c2_MRUVTorricelli.setVisible(false);
            c3_MRUVTorricelli.setVisible(false);
            c4_MRUVTorricelli.setVisible(false);
            c5_MRUVTorricelli.setVisible(false);
            c6_MRUVTorricelli.setVisible(false);
            c7_MRUVTorricelli.setVisible(false);
            c8_MRUVTorricelli.setVisible(false);
            c9_MRUVTorricelli.setVisible(false);           
            c10_MRUVTorricelli.setVisible(false);   
            c11_MRUVTorricelli.setVisible(false);
            c12_MRUVTorricelli.setVisible(false);
            c13_MRUVTorricelli.setVisible(false);
        
            
            d1_MRUVTorricelli.setVisible(false);
            d2_MRUVTorricelli.setVisible(false);
            d3_MRUVTorricelli.setVisible(false);
            d4_MRUVTorricelli.setVisible(false);
            d5_MRUVTorricelli.setVisible(false);
            d6_MRUVTorricelli.setVisible(false);
            d7_MRUVTorricelli.setVisible(false);
            d8_MRUVTorricelli.setVisible(false);
            d9_MRUVTorricelli.setVisible(false);           
            d10_MRUVTorricelli.setVisible(false);   
            d11_MRUVTorricelli.setVisible(false);
            d12_MRUVTorricelli.setVisible(false);
            d13_MRUVTorricelli.setVisible(false);
            
        } else if(selecionarTipoDeCalculoTelaMRUVTorricelli.getSelectedItem().equals("Velocidade Inicial")){
        
           
            txtFormulaVTelaMRUVTorricelli.setVisible(false);
            txtFormulaVoTelaMRUVTorricelli.setVisible(true);
            txtFormulaATelaMRUVTorricelli.setVisible(false);
            txtFormulaDeltaSTelaMRUVTorricelli.setVisible(false);            
            
            a1_MRUVTorricelli.setVisible(false);
            a2_MRUVTorricelli.setVisible(false);
            a3_MRUVTorricelli.setVisible(false);
            a4_MRUVTorricelli.setVisible(false);
            a5_MRUVTorricelli.setVisible(false);
            a6_MRUVTorricelli.setVisible(false);
            a7_MRUVTorricelli.setVisible(false);
            a8_MRUVTorricelli.setVisible(false);
            a9_MRUVTorricelli.setVisible(false);           
            a10_MRUVTorricelli.setVisible(false);   
            a11_MRUVTorricelli.setVisible(false);
            a12_MRUVTorricelli.setVisible(false);
            a13_MRUVTorricelli.setVisible(false);

            b1_MRUVTorricelli.setVisible(true);
            b2_MRUVTorricelli.setVisible(true);
            b3_MRUVTorricelli.setVisible(true);
            b4_MRUVTorricelli.setVisible(true);
            b5_MRUVTorricelli.setVisible(true);
            b6_MRUVTorricelli.setVisible(true);
            b7_MRUVTorricelli.setVisible(true);
            b8_MRUVTorricelli.setVisible(true);
            b9_MRUVTorricelli.setVisible(true);           
            b10_MRUVTorricelli.setVisible(true);   
            b11_MRUVTorricelli.setVisible(true);
            b12_MRUVTorricelli.setVisible(true);
            b13_MRUVTorricelli.setVisible(true);

            c1_MRUVTorricelli.setVisible(false);
            c2_MRUVTorricelli.setVisible(false);
            c3_MRUVTorricelli.setVisible(false);
            c4_MRUVTorricelli.setVisible(false);
            c5_MRUVTorricelli.setVisible(false);
            c6_MRUVTorricelli.setVisible(false);
            c7_MRUVTorricelli.setVisible(false);
            c8_MRUVTorricelli.setVisible(false);
            c9_MRUVTorricelli.setVisible(false);           
            c10_MRUVTorricelli.setVisible(false);   
            c11_MRUVTorricelli.setVisible(false);
            c12_MRUVTorricelli.setVisible(false);
            c13_MRUVTorricelli.setVisible(false);
        
            
            d1_MRUVTorricelli.setVisible(false);
            d2_MRUVTorricelli.setVisible(false);
            d3_MRUVTorricelli.setVisible(false);
            d4_MRUVTorricelli.setVisible(false);
            d5_MRUVTorricelli.setVisible(false);
            d6_MRUVTorricelli.setVisible(false);
            d7_MRUVTorricelli.setVisible(false);
            d8_MRUVTorricelli.setVisible(false);
            d9_MRUVTorricelli.setVisible(false);           
            d10_MRUVTorricelli.setVisible(false);   
            d11_MRUVTorricelli.setVisible(false);
            d12_MRUVTorricelli.setVisible(false);
            d13_MRUVTorricelli.setVisible(false);
            
        }else if((selecionarTipoDeCalculoTelaMRUVTorricelli.getSelectedItem().equals("Aceleração"))){
           
            
            
            txtFormulaVTelaMRUVTorricelli.setVisible(false);
            txtFormulaVoTelaMRUVTorricelli.setVisible(false);
            txtFormulaATelaMRUVTorricelli.setVisible(true);
            txtFormulaDeltaSTelaMRUVTorricelli.setVisible(false);
            
            a1_MRUVTorricelli.setVisible(false);
            a2_MRUVTorricelli.setVisible(false);
            a3_MRUVTorricelli.setVisible(false);
            a4_MRUVTorricelli.setVisible(false);
            a5_MRUVTorricelli.setVisible(false);
            a6_MRUVTorricelli.setVisible(false);
            a7_MRUVTorricelli.setVisible(false);
            a8_MRUVTorricelli.setVisible(false);
            a9_MRUVTorricelli.setVisible(false);           
            a10_MRUVTorricelli.setVisible(false);   
            a11_MRUVTorricelli.setVisible(false);
            a12_MRUVTorricelli.setVisible(false);
            a13_MRUVTorricelli.setVisible(false);

            b1_MRUVTorricelli.setVisible(false);
            b2_MRUVTorricelli.setVisible(false);
            b3_MRUVTorricelli.setVisible(false);
            b4_MRUVTorricelli.setVisible(false);
            b5_MRUVTorricelli.setVisible(false);
            b6_MRUVTorricelli.setVisible(false);
            b7_MRUVTorricelli.setVisible(false);
            b8_MRUVTorricelli.setVisible(false);
            b9_MRUVTorricelli.setVisible(false);           
            b10_MRUVTorricelli.setVisible(false);   
            b11_MRUVTorricelli.setVisible(false);
            b12_MRUVTorricelli.setVisible(false);
            b13_MRUVTorricelli.setVisible(false);

            c1_MRUVTorricelli.setVisible(true);
            c2_MRUVTorricelli.setVisible(true);
            c3_MRUVTorricelli.setVisible(true);
            c4_MRUVTorricelli.setVisible(true);
            c5_MRUVTorricelli.setVisible(true);
            c6_MRUVTorricelli.setVisible(true);
            c7_MRUVTorricelli.setVisible(true);
            c8_MRUVTorricelli.setVisible(true);
            c9_MRUVTorricelli.setVisible(true);           
            c10_MRUVTorricelli.setVisible(true);   
            c11_MRUVTorricelli.setVisible(true);
            c12_MRUVTorricelli.setVisible(true);
            c13_MRUVTorricelli.setVisible(true);
        
            
            d1_MRUVTorricelli.setVisible(false);
            d2_MRUVTorricelli.setVisible(false);
            d3_MRUVTorricelli.setVisible(false);
            d4_MRUVTorricelli.setVisible(false);
            d5_MRUVTorricelli.setVisible(false);
            d6_MRUVTorricelli.setVisible(false);
            d7_MRUVTorricelli.setVisible(false);
            d8_MRUVTorricelli.setVisible(false);
            d9_MRUVTorricelli.setVisible(false);           
            d10_MRUVTorricelli.setVisible(false);   
            d11_MRUVTorricelli.setVisible(false);
            d12_MRUVTorricelli.setVisible(false);
            d13_MRUVTorricelli.setVisible(false);
        }else{
            
            
            
            txtFormulaVTelaMRUVTorricelli.setVisible(false);
            txtFormulaVoTelaMRUVTorricelli.setVisible(false);
            txtFormulaATelaMRUVTorricelli.setVisible(false);
            txtFormulaDeltaSTelaMRUVTorricelli.setVisible(true);
            
            a1_MRUVTorricelli.setVisible(false);
            a2_MRUVTorricelli.setVisible(false);
            a3_MRUVTorricelli.setVisible(false);
            a4_MRUVTorricelli.setVisible(false);
            a5_MRUVTorricelli.setVisible(false);
            a6_MRUVTorricelli.setVisible(false);
            a7_MRUVTorricelli.setVisible(false);
            a8_MRUVTorricelli.setVisible(false);
            a9_MRUVTorricelli.setVisible(false);           
            a10_MRUVTorricelli.setVisible(false);   
            a11_MRUVTorricelli.setVisible(false);
            a12_MRUVTorricelli.setVisible(false);
            a13_MRUVTorricelli.setVisible(false);

            b1_MRUVTorricelli.setVisible(false);
            b2_MRUVTorricelli.setVisible(false);
            b3_MRUVTorricelli.setVisible(false);
            b4_MRUVTorricelli.setVisible(false);
            b5_MRUVTorricelli.setVisible(false);
            b6_MRUVTorricelli.setVisible(false);
            b7_MRUVTorricelli.setVisible(false);
            b8_MRUVTorricelli.setVisible(false);
            b9_MRUVTorricelli.setVisible(false);           
            b10_MRUVTorricelli.setVisible(false);   
            b11_MRUVTorricelli.setVisible(false);
            b12_MRUVTorricelli.setVisible(false);
            b13_MRUVTorricelli.setVisible(false);

            c1_MRUVTorricelli.setVisible(false);
            c2_MRUVTorricelli.setVisible(false);
            c3_MRUVTorricelli.setVisible(false);
            c4_MRUVTorricelli.setVisible(false);
            c5_MRUVTorricelli.setVisible(false);
            c6_MRUVTorricelli.setVisible(false);
            c7_MRUVTorricelli.setVisible(false);
            c8_MRUVTorricelli.setVisible(false);
            c9_MRUVTorricelli.setVisible(false);           
            c10_MRUVTorricelli.setVisible(false);   
            c11_MRUVTorricelli.setVisible(false);
            c12_MRUVTorricelli.setVisible(false);
            c13_MRUVTorricelli.setVisible(false);
        
            
            d1_MRUVTorricelli.setVisible(true);
            d2_MRUVTorricelli.setVisible(true);
            d3_MRUVTorricelli.setVisible(true);
            d4_MRUVTorricelli.setVisible(true);
            d5_MRUVTorricelli.setVisible(true);
            d6_MRUVTorricelli.setVisible(true);
            d7_MRUVTorricelli.setVisible(true);
            d8_MRUVTorricelli.setVisible(true);
            d9_MRUVTorricelli.setVisible(true);           
            d10_MRUVTorricelli.setVisible(true);   
            d11_MRUVTorricelli.setVisible(true);
            d12_MRUVTorricelli.setVisible(true);
            d13_MRUVTorricelli.setVisible(true);
        }
        
        
        txtkm1.setText("0 km");
        txtt1.setText("0 hr");
        txtt4.setText("x hr");
        txtkm4.setText("x km");
        txtt3.setText("x hr");
        txtkm3.setText("x km");
        txtt2.setText("x hr");
        txtkm2.setText("x km");

        carrinho_1.setIcon(new javax.swing.ImageIcon(getClass().getResource(getAleatorio(caminhoImagensAleatorio))));

        k1_1.setText("");
        t1_1.setText("");
        k2_2.setText("");
        t2_2.setText("");
        k2_2.setText("");
        t3_3.setText("");
        k3_3.setText("");
        t3_3.setText("");
        velocidade_1.setText("");
        
        a_2.setText("");
        a_5.setText("");
        a_8.setText("");
        a_13.setText("");
        a_3.setSelectedItem("Km");
        a_6.setSelectedItem("Km/h");
        a_9.setSelectedItem("Hr");
        a_11.setSelectedItem("Km");
        
       b_2.setText("");
        b_5.setText("");
        b_8.setText("");
        b_13.setText("");
        b_3.setSelectedItem("Km");
        b_6.setSelectedItem("Km/h");
        b_9.setSelectedItem("Hr");
        b_11.setSelectedItem("Km");
        
        c_2.setText("");
        c_5.setText("");
        c_8.setText("");
        c_13.setText("");
        c_3.setSelectedItem("Km");
        c_6.setSelectedItem("Km");
        c_9.setSelectedItem("Hr");
        c_11.setSelectedItem("Km/h");
        
           
        d_2.setText("");
        d_5.setText("");
        d_8.setText("");
        d_13.setText("");
        d_3.setSelectedItem("Km");
        d_6.setSelectedItem("Km");
        d_9.setSelectedItem("Km/h");
        d_11.setSelectedItem("Hr");

        new Thread() {
            @Override
            public void run() {
                int posicaoInicial = carrinho_1.getLocation().x;
                int x = carrinho_1.getLocation().x;
                int y = carrinho_1.getLocation().y;
                while (true) {
                    x--;
                    if (x <= 0) {
                        break;
                    }
                    carrinho_1.setLocation(x, y);
                    try {
                        sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoesTelaAvaliacao = new javax.swing.ButtonGroup();
        painelCamadas = new javax.swing.JLayeredPane();
        telaInicial = new javax.swing.JPanel();
        textoPhysisTelaInicial = new javax.swing.JLabel();
        animacaoTelaInicial = new javax.swing.JLabel();
        btFisica1TelaInicial = new javax.swing.JButton();
        btFisica2TelaInicial = new javax.swing.JButton();
        btFisica3TelaInicial = new javax.swing.JButton();
        telaLogin = new javax.swing.JPanel();
        txtLoginTelaLogin = new javax.swing.JLabel();
        txtUsuarioTelaLogin = new javax.swing.JLabel();
        campoTextoUsuarioTelaLogin = new javax.swing.JTextField();
        txtSenhaTelaLogin = new javax.swing.JLabel();
        campoTextoSenhaTelaLogin = new javax.swing.JPasswordField();
        btEntrarTelaLogin = new javax.swing.JButton();
        bordaTelaLogin = new javax.swing.JLabel();
        txtAindaNaoCadastradoTelaLogin = new javax.swing.JLabel();
        btCadastreseTelaLogin = new javax.swing.JButton();
        btTestarAplicativoTelaLogin = new javax.swing.JButton();
        telaMecanica = new javax.swing.JPanel();
        txtMecanicaTelaMecanica = new javax.swing.JLabel();
        btExplicacaoTelaMecanica = new javax.swing.JButton();
        btCinematicaTelaMecanica = new javax.swing.JButton();
        btDinamicaTelaMecanica = new javax.swing.JButton();
        btEstaticaTelaMecanica = new javax.swing.JButton();
        btHidrostaticaTelaMecanica = new javax.swing.JButton();
        btGravUniversalTelaMecanica = new javax.swing.JButton();
        btVoltarTelaMecanica = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telaCadastro = new javax.swing.JPanel();
        txtCadastroTelaCadastro = new javax.swing.JLabel();
        txtNometxtTelaCadastro = new javax.swing.JLabel();
        txtCampoNomeTelaCadastro = new javax.swing.JTextField();
        txtUsuarioTelaCadastro = new javax.swing.JLabel();
        txtCampoUsuarioTelaCadastro = new javax.swing.JTextField();
        txtSenhaTelaCadastro = new javax.swing.JLabel();
        txtCampoSenhaTelaCadastro = new javax.swing.JPasswordField();
        txtCursoTelaCadastro = new javax.swing.JLabel();
        txtCampoCursoTelaCadastro = new javax.swing.JTextField();
        txtTipoDeUsuarioTelaCadastro = new javax.swing.JLabel();
        tipoUsuarioTelaCadastro = new javax.swing.JComboBox<>();
        btCadastratTelaCadastro = new javax.swing.JButton();
        btVoltarTelaCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        telaCinematica = new javax.swing.JPanel();
        txtCinematicaTelaCinematica = new javax.swing.JLabel();
        btExplicacaoTelaCinematica = new javax.swing.JButton();
        btVelocidadeMediaTelaCinematica = new javax.swing.JButton();
        btMovimentoUniformeTelaCinematica = new javax.swing.JButton();
        btMovimentoUniformeVariadoTelaCinematica = new javax.swing.JButton();
        btMovimentoVerticalTelaCinematica = new javax.swing.JButton();
        btMovimentoObliquoTelaCinematica = new javax.swing.JButton();
        btMovimentoCircularTelaCinematica = new javax.swing.JButton();
        btVoltarTelaAnteriorCinematica = new javax.swing.JButton();
        btVoltarTelaInicioCinematica = new javax.swing.JButton();
        telaVelocidadeMedia = new javax.swing.JPanel();
        txtVelocidadeMediaTituloTelaVelocidadeMedia = new javax.swing.JLabel();
        txtTitpoDeCalculoTelaVelocidadeMedia = new javax.swing.JLabel();
        selecionarTipodeCalculoTelaVelocidadeMedia = new javax.swing.JComboBox<>();
        txtTempoGastoTelaVelocidadeMedia = new javax.swing.JLabel();
        txtVelocidadeMediaTelaVelocidadeMedia = new javax.swing.JLabel();
        txtFormulaEspacoPercorridoTelaVelocidadeMedia = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JComboBox<>();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JComboBox<>();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JComboBox<>();
        a9 = new javax.swing.JButton();
        a10 = new javax.swing.JTextField();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JComboBox<>();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JTextField();
        b6 = new javax.swing.JComboBox<>();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JComboBox<>();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JTextField();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JComboBox<>();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JComboBox<>();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JTextField();
        btVisualizarCalculoTelaVelocidadeMedia = new javax.swing.JButton();
        estradaTelaVelocidadeMedia = new javax.swing.JLabel();
        carrinhoTelaVelocidadeMedia = new javax.swing.JLabel();
        velocidadeTelaVelocidadeMedia = new javax.swing.JLabel();
        km1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        km2 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        km3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        km4 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        btContinuaTelaVelocidadeMedia = new javax.swing.JButton();
        btPausaTelaVelocidadeMedia = new javax.swing.JButton();
        txtAux1 = new javax.swing.JLabel();
        txtAux2 = new javax.swing.JLabel();
        txtAux3 = new javax.swing.JLabel();
        txtAux4 = new javax.swing.JLabel();
        txtAux5 = new javax.swing.JLabel();
        txtAux6 = new javax.swing.JLabel();
        txtAux7 = new javax.swing.JLabel();
        txtAux8 = new javax.swing.JLabel();
        btVoltarTelaVelocidadeMedia = new javax.swing.JButton();
        btLimparTelaVelocidadeMedia = new javax.swing.JButton();
        btInicioTelaVelocidadeMedia = new javax.swing.JButton();
        borda1TelaVelocidadeMedia = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        borda2TelaVelocidadeMedia = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        telaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JPanel();
        textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JLabel();
        textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JLabel();
        textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JLabel();
        textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JLabel();
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia = new javax.swing.JLabel();
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3 = new javax.swing.JButton();
        telaMovimentoUniforme = new javax.swing.JPanel();
        txtTopo = new javax.swing.JLabel();
        txtOQueVoceDesejaCalcularTelaMovimentoUniforme = new javax.swing.JLabel();
        selecionarTipoDeCalculoTelaMovimentoUniforme = new javax.swing.JComboBox<>();
        txtFormulaTTelaMovimentoUniforme = new javax.swing.JLabel();
        txtFormulaSTelaMovimentoUniforme = new javax.swing.JLabel();
        txtFormulaSoTelaMovimentoUniforme = new javax.swing.JLabel();
        txtFormulaVTelaMovimentoUniforme = new javax.swing.JLabel();
        a_1 = new javax.swing.JLabel();
        a_2 = new javax.swing.JTextField();
        a_3 = new javax.swing.JComboBox<>();
        a_4 = new javax.swing.JLabel();
        a_5 = new javax.swing.JTextField();
        a_6 = new javax.swing.JComboBox<>();
        a_7 = new javax.swing.JLabel();
        a_8 = new javax.swing.JTextField();
        a_9 = new javax.swing.JComboBox<>();
        a_10 = new javax.swing.JLabel();
        a_11 = new javax.swing.JComboBox<>();
        a_12 = new javax.swing.JButton();
        a_13 = new javax.swing.JTextField();
        b_1 = new javax.swing.JLabel();
        b_2 = new javax.swing.JTextField();
        b_3 = new javax.swing.JComboBox<>();
        b_4 = new javax.swing.JLabel();
        b_5 = new javax.swing.JTextField();
        b_6 = new javax.swing.JComboBox<>();
        b_7 = new javax.swing.JLabel();
        b_8 = new javax.swing.JTextField();
        b_9 = new javax.swing.JComboBox<>();
        b_10 = new javax.swing.JLabel();
        b_11 = new javax.swing.JComboBox<>();
        b_12 = new javax.swing.JButton();
        b_13 = new javax.swing.JTextField();
        c_1 = new javax.swing.JLabel();
        c_2 = new javax.swing.JTextField();
        c_3 = new javax.swing.JComboBox<>();
        c_4 = new javax.swing.JLabel();
        c_5 = new javax.swing.JTextField();
        c_6 = new javax.swing.JComboBox<>();
        c_7 = new javax.swing.JLabel();
        c_8 = new javax.swing.JTextField();
        c_9 = new javax.swing.JComboBox<>();
        c_10 = new javax.swing.JLabel();
        c_11 = new javax.swing.JComboBox<>();
        c_12 = new javax.swing.JButton();
        c_13 = new javax.swing.JTextField();
        d_1 = new javax.swing.JLabel();
        d_2 = new javax.swing.JTextField();
        d_3 = new javax.swing.JComboBox<>();
        d_4 = new javax.swing.JLabel();
        d_5 = new javax.swing.JTextField();
        d_6 = new javax.swing.JComboBox<>();
        d_7 = new javax.swing.JLabel();
        d_9 = new javax.swing.JComboBox<>();
        d_10 = new javax.swing.JLabel();
        d_8 = new javax.swing.JTextField();
        d_11 = new javax.swing.JComboBox<>();
        d_12 = new javax.swing.JButton();
        d_13 = new javax.swing.JTextField();
        visualizarCalculoTelaMovUniforme = new javax.swing.JButton();
        estrada = new javax.swing.JLabel();
        carrinho_1 = new javax.swing.JLabel();
        velocidade_1 = new javax.swing.JLabel();
        btContinua_1 = new javax.swing.JButton();
        btPausa_1 = new javax.swing.JButton();
        t1_1 = new javax.swing.JLabel();
        k1_1 = new javax.swing.JLabel();
        k2_2 = new javax.swing.JLabel();
        t2_2 = new javax.swing.JLabel();
        k3_3 = new javax.swing.JLabel();
        t3_3 = new javax.swing.JLabel();
        k4_4 = new javax.swing.JLabel();
        t4_4 = new javax.swing.JLabel();
        txtkm1 = new javax.swing.JLabel();
        txtt1 = new javax.swing.JLabel();
        txtkm2 = new javax.swing.JLabel();
        txtt2 = new javax.swing.JLabel();
        txtt4 = new javax.swing.JLabel();
        txtkm4 = new javax.swing.JLabel();
        txtt3 = new javax.swing.JLabel();
        txtkm3 = new javax.swing.JLabel();
        btVoltarTelaInicioMovUniforme = new javax.swing.JButton();
        btLimparTelaMovUniforme = new javax.swing.JButton();
        btVoltarTelaMovUniforme = new javax.swing.JButton();
        borda1TelaMovimentoUniforme = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        borda2TelaMovimentoUniforme = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        telaDemonstracaoCalculoMovimentoUniforme = new javax.swing.JPanel();
        btVoltarTelaExplicacaoFormulaMovimentoUniforme = new javax.swing.JButton();
        textoExplicacaoCalculoMovimentoUniforme1 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme0 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme2 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme3 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme4 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme5 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme6 = new javax.swing.JLabel();
        textoCalculosTelaMovimentoUniforme = new javax.swing.JLabel();
        telaMRUV = new javax.swing.JPanel();
        txtCinematicaTelaMRUV = new javax.swing.JLabel();
        btExplicacaoTelaMRUV = new javax.swing.JButton();
        btMRUVAceleracaoMedia = new javax.swing.JButton();
        btMRUVFuncaoHorariaDaPosicao = new javax.swing.JButton();
        btMRUVPosicaoEmFuncaoDoTempo = new javax.swing.JButton();
        btMRUVEquacaoDeTorricelli = new javax.swing.JButton();
        btVoltarTelaAnteriorMRUV = new javax.swing.JButton();
        btVoltarTelaInicioMRUV = new javax.swing.JButton();
        telaMRUVEquacaoDeTorricelli = new javax.swing.JPanel();
        txtTopoTorricelli = new javax.swing.JLabel();
        txtOQueVoceDesejaCalcularTelaMRUVTorricelli = new javax.swing.JLabel();
        selecionarTipoDeCalculoTelaMRUVTorricelli = new javax.swing.JComboBox<>();
        txtFormulaVTelaMRUVTorricelli = new javax.swing.JLabel();
        txtFormulaVoTelaMRUVTorricelli = new javax.swing.JLabel();
        txtFormulaATelaMRUVTorricelli = new javax.swing.JLabel();
        txtFormulaDeltaSTelaMRUVTorricelli = new javax.swing.JLabel();
        a1_MRUVTorricelli = new javax.swing.JLabel();
        a2_MRUVTorricelli = new javax.swing.JTextField();
        a3_MRUVTorricelli = new javax.swing.JComboBox<>();
        a4_MRUVTorricelli = new javax.swing.JLabel();
        a5_MRUVTorricelli = new javax.swing.JTextField();
        a6_MRUVTorricelli = new javax.swing.JComboBox<>();
        a7_MRUVTorricelli = new javax.swing.JLabel();
        a8_MRUVTorricelli = new javax.swing.JTextField();
        a9_MRUVTorricelli = new javax.swing.JComboBox<>();
        a10_MRUVTorricelli = new javax.swing.JLabel();
        a11_MRUVTorricelli = new javax.swing.JComboBox<>();
        a12_MRUVTorricelli = new javax.swing.JButton();
        a13_MRUVTorricelli = new javax.swing.JTextField();
        b1_MRUVTorricelli = new javax.swing.JLabel();
        b2_MRUVTorricelli = new javax.swing.JTextField();
        b3_MRUVTorricelli = new javax.swing.JComboBox<>();
        b4_MRUVTorricelli = new javax.swing.JLabel();
        b5_MRUVTorricelli = new javax.swing.JTextField();
        b6_MRUVTorricelli = new javax.swing.JComboBox<>();
        b7_MRUVTorricelli = new javax.swing.JLabel();
        b8_MRUVTorricelli = new javax.swing.JTextField();
        b9_MRUVTorricelli = new javax.swing.JComboBox<>();
        b10_MRUVTorricelli = new javax.swing.JLabel();
        b11_MRUVTorricelli = new javax.swing.JComboBox<>();
        b12_MRUVTorricelli = new javax.swing.JButton();
        b13_MRUVTorricelli = new javax.swing.JTextField();
        c1_MRUVTorricelli = new javax.swing.JLabel();
        c2_MRUVTorricelli = new javax.swing.JTextField();
        c3_MRUVTorricelli = new javax.swing.JComboBox<>();
        c4_MRUVTorricelli = new javax.swing.JLabel();
        c5_MRUVTorricelli = new javax.swing.JTextField();
        c6_MRUVTorricelli = new javax.swing.JComboBox<>();
        c7_MRUVTorricelli = new javax.swing.JLabel();
        c8_MRUVTorricelli = new javax.swing.JTextField();
        c9_MRUVTorricelli = new javax.swing.JComboBox<>();
        c10_MRUVTorricelli = new javax.swing.JLabel();
        c11_MRUVTorricelli = new javax.swing.JComboBox<>();
        c12_MRUVTorricelli = new javax.swing.JButton();
        c13_MRUVTorricelli = new javax.swing.JTextField();
        d1_MRUVTorricelli = new javax.swing.JLabel();
        d2_MRUVTorricelli = new javax.swing.JTextField();
        d3_MRUVTorricelli = new javax.swing.JComboBox<>();
        d4_MRUVTorricelli = new javax.swing.JLabel();
        d5_MRUVTorricelli = new javax.swing.JTextField();
        d6_MRUVTorricelli = new javax.swing.JComboBox<>();
        d7_MRUVTorricelli = new javax.swing.JLabel();
        d8_MRUVTorricelli = new javax.swing.JComboBox<>();
        d9_MRUVTorricelli = new javax.swing.JLabel();
        d10_MRUVTorricelli = new javax.swing.JTextField();
        d11_MRUVTorricelli = new javax.swing.JComboBox<>();
        d12_MRUVTorricelli = new javax.swing.JButton();
        d13_MRUVTorricelli = new javax.swing.JTextField();
        visualizarCalculoTelaMRUVTorricelli = new javax.swing.JButton();
        estrada1 = new javax.swing.JLabel();
        carrinho_2 = new javax.swing.JLabel();
        velocidade_2 = new javax.swing.JLabel();
        btContinua_2 = new javax.swing.JButton();
        btPausa_2 = new javax.swing.JButton();
        t1_2 = new javax.swing.JLabel();
        k1_2 = new javax.swing.JLabel();
        k2_3 = new javax.swing.JLabel();
        t2_3 = new javax.swing.JLabel();
        k3_4 = new javax.swing.JLabel();
        t3_4 = new javax.swing.JLabel();
        k4_5 = new javax.swing.JLabel();
        t4_5 = new javax.swing.JLabel();
        txtkm5 = new javax.swing.JLabel();
        txtt5 = new javax.swing.JLabel();
        txtkm6 = new javax.swing.JLabel();
        txtt6 = new javax.swing.JLabel();
        txtt7 = new javax.swing.JLabel();
        txtkm7 = new javax.swing.JLabel();
        txtt8 = new javax.swing.JLabel();
        txtkm8 = new javax.swing.JLabel();
        btVoltarTelaInicioMRUVTorricelli = new javax.swing.JButton();
        btLimparTelaMRUVTorricelli = new javax.swing.JButton();
        btVoltarTelaMRUVTorricelli = new javax.swing.JButton();
        borda1TelaMRUVTorricelli = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        borda2TelaMRUVTorricelli = new javax.swing.Box.Filler(new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 0), new java.awt.Dimension(56, 32767));
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli = new javax.swing.JPanel();
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1 = new javax.swing.JButton();
        textoExplicacaoCalculoMovimentoUniforme7 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme8 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme9 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme10 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme11 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme12 = new javax.swing.JLabel();
        textoExplicacaoCalculoMovimentoUniforme13 = new javax.swing.JLabel();
        textoCalculosTelaMovimentoUniforme1 = new javax.swing.JLabel();
        telaAvaliacao = new javax.swing.JPanel();
        telaAvaliaxaoTxt11 = new javax.swing.JLabel();
        telaAvaliaxaoTxt12 = new javax.swing.JLabel();
        bt1 = new javax.swing.JRadioButton();
        bt2 = new javax.swing.JRadioButton();
        bt3 = new javax.swing.JRadioButton();
        bt4 = new javax.swing.JRadioButton();
        bt6 = new javax.swing.JRadioButton();
        bt5 = new javax.swing.JRadioButton();
        bt8 = new javax.swing.JRadioButton();
        bt7 = new javax.swing.JRadioButton();
        bt9 = new javax.swing.JRadioButton();
        bt10 = new javax.swing.JRadioButton();
        telaAvaliaxaoTxt13 = new javax.swing.JLabel();
        telaAvaliacaoJComboBox = new javax.swing.JComboBox<>();
        campoAreaTexto = new javax.swing.JScrollPane();
        telaAvaliacaoAreaTexto = new javax.swing.JTextArea();
        telaAvaliaxaoBtenviar = new javax.swing.JButton();
        telaAvaliaxaoBtVoltar = new javax.swing.JButton();
        borda02 = new javax.swing.JLabel();
        iconComent = new javax.swing.JLabel();
        telaAdministrador = new javax.swing.JPanel();
        telaAdmTxt1 = new javax.swing.JLabel();
        telaAdmGrafico = new javax.swing.JLabel();
        btVoltarTelaAdm = new javax.swing.JButton();
        telaAdmTxt2 = new javax.swing.JLabel();
        telaComentariosSugestoesCriticas = new javax.swing.JPanel();
        telaComentariosTxt1 = new javax.swing.JLabel();
        telaComentariosTxt1JComboBox = new javax.swing.JComboBox<>();
        telaComentariosAreaTexto01 = new javax.swing.JScrollPane();
        telaComentariosAreaTexto = new javax.swing.JTextArea();
        telaComentariosBtImprimir = new javax.swing.JButton();
        telaComentariosBtLimpar = new javax.swing.JButton();
        telaComentariosBtVoltar = new javax.swing.JButton();
        telaUsuarios = new javax.swing.JPanel();
        telaUsuarioTxt1 = new javax.swing.JLabel();
        telaUsuarioBtImprimirTudo = new javax.swing.JButton();
        telaUsuarioCampotexto1 = new javax.swing.JTextField();
        telaUsuarioTxt2 = new javax.swing.JLabel();
        telaUsuarioBtBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        telaUsuarioTabela = new javax.swing.JTable();
        telaUsuarioBtVoltar = new javax.swing.JButton();
        telaUsuarioBtRemoverSelecionado = new javax.swing.JButton();
        telaUsuarioBtRemoverTudo = new javax.swing.JButton();
        telaUsuarioBtLimparTela = new javax.swing.JButton();
        barraMenus = new javax.swing.JMenuBar();
        menuAdm = new javax.swing.JMenu();
        menuPainelAdm = new javax.swing.JMenuItem();
        menuAvaliacoes = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenuItem();
        menuAvaliacao = new javax.swing.JMenu();
        menuAvaliar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("easyFísica");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        painelCamadas.setPreferredSize(new java.awt.Dimension(1000, 600));

        telaInicial.setBackground(new java.awt.Color(26, 31, 74));
        telaInicial.setPreferredSize(new java.awt.Dimension(1000, 600));

        textoPhysisTelaInicial.setFont(new java.awt.Font("Kristen ITC", 1, 50)); // NOI18N
        textoPhysisTelaInicial.setForeground(new java.awt.Color(255, 255, 51));
        textoPhysisTelaInicial.setText("Physis");

        animacaoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Gifs/atomo.gif"))); // NOI18N

        btFisica1TelaInicial.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btFisica1TelaInicial.setForeground(new java.awt.Color(255, 0, 0));
        btFisica1TelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica1.png"))); // NOI18N
        btFisica1TelaInicial.setBorder(null);
        btFisica1TelaInicial.setBorderPainted(false);
        btFisica1TelaInicial.setContentAreaFilled(false);
        btFisica1TelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFisica1TelaInicial.setFocusable(false);
        btFisica1TelaInicial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica1Glow.png"))); // NOI18N
        btFisica1TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFisica1TelaInicialActionPerformed(evt);
            }
        });

        btFisica2TelaInicial.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btFisica2TelaInicial.setForeground(new java.awt.Color(255, 102, 0));
        btFisica2TelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica2.png"))); // NOI18N
        btFisica2TelaInicial.setBorderPainted(false);
        btFisica2TelaInicial.setContentAreaFilled(false);
        btFisica2TelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFisica2TelaInicial.setFocusPainted(false);
        btFisica2TelaInicial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica2Glow.png"))); // NOI18N
        btFisica2TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFisica2TelaInicialActionPerformed(evt);
            }
        });

        btFisica3TelaInicial.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btFisica3TelaInicial.setForeground(new java.awt.Color(0, 204, 0));
        btFisica3TelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica3.png"))); // NOI18N
        btFisica3TelaInicial.setBorderPainted(false);
        btFisica3TelaInicial.setContentAreaFilled(false);
        btFisica3TelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFisica3TelaInicial.setFocusable(false);
        btFisica3TelaInicial.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/Imagens 2.0/fisica3Glow.png"))); // NOI18N
        btFisica3TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFisica3TelaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaInicialLayout = new javax.swing.GroupLayout(telaInicial);
        telaInicial.setLayout(telaInicialLayout);
        telaInicialLayout.setHorizontalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btFisica1TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btFisica2TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btFisica3TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(animacaoTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaInicialLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(textoPhysisTelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        telaInicialLayout.setVerticalGroup(
            telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaInicialLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(textoPhysisTelaInicial)
                .addGap(36, 36, 36)
                .addComponent(animacaoTelaInicial)
                .addGap(66, 66, 66)
                .addGroup(telaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFisica1TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFisica2TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFisica3TelaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        painelCamadas.add(telaInicial);
        telaInicial.setBounds(0, 0, 1000, 601);

        telaLogin.setPreferredSize(new java.awt.Dimension(1000, 600));

        txtLoginTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtLoginTelaLogin.setForeground(new java.awt.Color(0, 153, 0));
        txtLoginTelaLogin.setText("Login");

        txtUsuarioTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtUsuarioTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/user.png"))); // NOI18N
        txtUsuarioTelaLogin.setText("Usuário:");

        campoTextoUsuarioTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        txtSenhaTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSenhaTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/senha.png"))); // NOI18N
        txtSenhaTelaLogin.setText("Senha:");

        campoTextoSenhaTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btEntrarTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEntrarTelaLogin.setForeground(new java.awt.Color(0, 0, 255));
        btEntrarTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/entrar.png"))); // NOI18N
        btEntrarTelaLogin.setText("Entrar");
        btEntrarTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarTelaLoginActionPerformed(evt);
            }
        });

        bordaTelaLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAindaNaoCadastradoTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAindaNaoCadastradoTelaLogin.setForeground(new java.awt.Color(255, 0, 0));
        txtAindaNaoCadastradoTelaLogin.setText("Ainda não é Cadastrado?");

        btCadastreseTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCadastreseTelaLogin.setForeground(new java.awt.Color(0, 0, 255));
        btCadastreseTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/cadastro01.png"))); // NOI18N
        btCadastreseTelaLogin.setText("Cadastre-se");
        btCadastreseTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastreseTelaLoginActionPerformed(evt);
            }
        });

        btTestarAplicativoTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btTestarAplicativoTelaLogin.setForeground(new java.awt.Color(0, 153, 0));
        btTestarAplicativoTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/testar.png"))); // NOI18N
        btTestarAplicativoTelaLogin.setText("Testar Aplicativo");
        btTestarAplicativoTelaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestarAplicativoTelaLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaLoginLayout = new javax.swing.GroupLayout(telaLogin);
        telaLogin.setLayout(telaLoginLayout);
        telaLoginLayout.setHorizontalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(txtLoginTelaLogin))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLoginLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtSenhaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(campoTextoUsuarioTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLoginLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtUsuarioTelaLogin))
                            .addGroup(telaLoginLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(btEntrarTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLoginLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(campoTextoSenhaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bordaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(txtAindaNaoCadastradoTelaLogin))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(btCadastreseTelaLogin))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(btTestarAplicativoTelaLogin)))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        telaLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCadastreseTelaLogin, btEntrarTelaLogin});

        telaLoginLayout.setVerticalGroup(
            telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLoginLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtLoginTelaLogin)
                .addGap(14, 14, 14)
                .addGroup(telaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(txtSenhaTelaLogin))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(campoTextoUsuarioTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtUsuarioTelaLogin))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btEntrarTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLoginLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(campoTextoSenhaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bordaTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(txtAindaNaoCadastradoTelaLogin)
                .addGap(18, 18, 18)
                .addComponent(btCadastreseTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btTestarAplicativoTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        telaLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btCadastreseTelaLogin, btEntrarTelaLogin});

        painelCamadas.add(telaLogin);
        telaLogin.setBounds(0, 0, 1000, 601);

        telaMecanica.setPreferredSize(new java.awt.Dimension(1000, 600));
        telaMecanica.setLayout(null);

        txtMecanicaTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtMecanicaTelaMecanica.setForeground(new java.awt.Color(255, 255, 255));
        txtMecanicaTelaMecanica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMecanicaTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/mecanica.png"))); // NOI18N
        txtMecanicaTelaMecanica.setText("Mecânica");
        telaMecanica.add(txtMecanicaTelaMecanica);
        txtMecanicaTelaMecanica.setBounds(337, 20, 289, 60);

        btExplicacaoTelaMecanica.setBorderPainted(false);
        btExplicacaoTelaMecanica.setContentAreaFilled(false);
        btExplicacaoTelaMecanica.setFocusPainted(false);
        btExplicacaoTelaMecanica.setFocusable(false);
        btExplicacaoTelaMecanica.setRequestFocusEnabled(false);
        btExplicacaoTelaMecanica.setRolloverEnabled(false);
        btExplicacaoTelaMecanica.setVerifyInputWhenFocusTarget(false);
        btExplicacaoTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExplicacaoTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btExplicacaoTelaMecanica);
        btExplicacaoTelaMecanica.setBounds(630, 46, 25, 17);

        btCinematicaTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btCinematicaTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Cinematica.png"))); // NOI18N
        btCinematicaTelaMecanica.setBorderPainted(false);
        btCinematicaTelaMecanica.setContentAreaFilled(false);
        btCinematicaTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCinematicaTelaMecanica.setFocusPainted(false);
        btCinematicaTelaMecanica.setFocusable(false);
        btCinematicaTelaMecanica.setRequestFocusEnabled(false);
        btCinematicaTelaMecanica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Cinematica_on.png"))); // NOI18N
        btCinematicaTelaMecanica.setVerifyInputWhenFocusTarget(false);
        btCinematicaTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCinematicaTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btCinematicaTelaMecanica);
        btCinematicaTelaMecanica.setBounds(45, 119, 232, 198);

        btDinamicaTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btDinamicaTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Dinamica.png"))); // NOI18N
        btDinamicaTelaMecanica.setBorderPainted(false);
        btDinamicaTelaMecanica.setContentAreaFilled(false);
        btDinamicaTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDinamicaTelaMecanica.setFocusPainted(false);
        btDinamicaTelaMecanica.setRequestFocusEnabled(false);
        btDinamicaTelaMecanica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Dinamica_on.png"))); // NOI18N
        btDinamicaTelaMecanica.setVerifyInputWhenFocusTarget(false);
        btDinamicaTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDinamicaTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btDinamicaTelaMecanica);
        btDinamicaTelaMecanica.setBounds(720, 110, 210, 200);

        btEstaticaTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btEstaticaTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Estatica.png"))); // NOI18N
        btEstaticaTelaMecanica.setBorderPainted(false);
        btEstaticaTelaMecanica.setContentAreaFilled(false);
        btEstaticaTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEstaticaTelaMecanica.setFocusPainted(false);
        btEstaticaTelaMecanica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Estatica_on.png"))); // NOI18N
        btEstaticaTelaMecanica.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Estatica_on.png"))); // NOI18N
        btEstaticaTelaMecanica.setVerifyInputWhenFocusTarget(false);
        btEstaticaTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstaticaTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btEstaticaTelaMecanica);
        btEstaticaTelaMecanica.setBounds(410, 240, 200, 200);

        btHidrostaticaTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btHidrostaticaTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/hidro.png"))); // NOI18N
        btHidrostaticaTelaMecanica.setBorderPainted(false);
        btHidrostaticaTelaMecanica.setContentAreaFilled(false);
        btHidrostaticaTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btHidrostaticaTelaMecanica.setFocusPainted(false);
        btHidrostaticaTelaMecanica.setRequestFocusEnabled(false);
        btHidrostaticaTelaMecanica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/hidro_on.png"))); // NOI18N
        btHidrostaticaTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHidrostaticaTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btHidrostaticaTelaMecanica);
        btHidrostaticaTelaMecanica.setBounds(70, 350, 200, 200);

        btGravUniversalTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btGravUniversalTelaMecanica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Gravi.png"))); // NOI18N
        btGravUniversalTelaMecanica.setBorderPainted(false);
        btGravUniversalTelaMecanica.setContentAreaFilled(false);
        btGravUniversalTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGravUniversalTelaMecanica.setFocusPainted(false);
        btGravUniversalTelaMecanica.setFocusable(false);
        btGravUniversalTelaMecanica.setRequestFocusEnabled(false);
        btGravUniversalTelaMecanica.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/Botoes/Gravi_on.png"))); // NOI18N
        btGravUniversalTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravUniversalTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btGravUniversalTelaMecanica);
        btGravUniversalTelaMecanica.setBounds(730, 350, 210, 200);

        btVoltarTelaMecanica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltarTelaMecanica.setText("Voltar");
        btVoltarTelaMecanica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaMecanica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaMecanicaActionPerformed(evt);
            }
        });
        telaMecanica.add(btVoltarTelaMecanica);
        btVoltarTelaMecanica.setBounds(450, 540, 110, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Gravitação Universal");
        telaMecanica.add(jLabel2);
        jLabel2.setBounds(740, 330, 200, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cinemática");
        telaMecanica.add(jLabel3);
        jLabel3.setBounds(110, 100, 101, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hidrostática");
        telaMecanica.add(jLabel4);
        jLabel4.setBounds(110, 330, 120, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estática");
        telaMecanica.add(jLabel5);
        jLabel5.setBounds(470, 220, 80, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Dinâmica");
        telaMecanica.add(jLabel6);
        jLabel6.setBounds(780, 90, 100, 22);

        painelCamadas.add(telaMecanica);
        telaMecanica.setBounds(0, 0, 1000, 612);

        telaCadastro.setPreferredSize(new java.awt.Dimension(1000, 600));
        telaCadastro.setLayout(null);

        txtCadastroTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtCadastroTelaCadastro.setForeground(new java.awt.Color(0, 153, 0));
        txtCadastroTelaCadastro.setText("Cadastro");
        telaCadastro.add(txtCadastroTelaCadastro);
        txtCadastroTelaCadastro.setBounds(466, 24, 172, 44);

        txtNometxtTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNometxtTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/nome.png"))); // NOI18N
        txtNometxtTelaCadastro.setText("Nome:*");
        telaCadastro.add(txtNometxtTelaCadastro);
        txtNometxtTelaCadastro.setBounds(258, 113, 150, 39);

        txtCampoNomeTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        telaCadastro.add(txtCampoNomeTelaCadastro);
        txtCampoNomeTelaCadastro.setBounds(447, 109, 284, 29);

        txtUsuarioTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtUsuarioTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/user.png"))); // NOI18N
        txtUsuarioTelaCadastro.setText("Usuário:*");
        telaCadastro.add(txtUsuarioTelaCadastro);
        txtUsuarioTelaCadastro.setBounds(259, 182, 170, 40);

        txtCampoUsuarioTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        telaCadastro.add(txtCampoUsuarioTelaCadastro);
        txtCampoUsuarioTelaCadastro.setBounds(449, 182, 284, 29);

        txtSenhaTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtSenhaTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/senha.png"))); // NOI18N
        txtSenhaTelaCadastro.setText("Senha:*");
        telaCadastro.add(txtSenhaTelaCadastro);
        txtSenhaTelaCadastro.setBounds(259, 262, 170, 40);

        txtCampoSenhaTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        telaCadastro.add(txtCampoSenhaTelaCadastro);
        txtCampoSenhaTelaCadastro.setBounds(449, 262, 280, 29);

        txtCursoTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCursoTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/curso.png"))); // NOI18N
        txtCursoTelaCadastro.setText("Curso:");
        telaCadastro.add(txtCursoTelaCadastro);
        txtCursoTelaCadastro.setBounds(251, 332, 175, 50);

        txtCampoCursoTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        telaCadastro.add(txtCampoCursoTelaCadastro);
        txtCampoCursoTelaCadastro.setBounds(446, 342, 284, 29);

        txtTipoDeUsuarioTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTipoDeUsuarioTelaCadastro.setText("Tipo de Usuário:");
        telaCadastro.add(txtTipoDeUsuarioTelaCadastro);
        txtTipoDeUsuarioTelaCadastro.setBounds(231, 427, 195, 29);

        tipoUsuarioTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tipoUsuarioTelaCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Outro" }));
        telaCadastro.add(tipoUsuarioTelaCadastro);
        tipoUsuarioTelaCadastro.setBounds(446, 428, 284, 28);

        btCadastratTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btCadastratTelaCadastro.setForeground(new java.awt.Color(0, 0, 255));
        btCadastratTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/cadastro02.png"))); // NOI18N
        btCadastratTelaCadastro.setText("Cadastrar");
        btCadastratTelaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastratTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastratTelaCadastroActionPerformed(evt);
            }
        });
        telaCadastro.add(btCadastratTelaCadastro);
        btCadastratTelaCadastro.setBounds(291, 523, 201, 53);

        btVoltarTelaCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaCadastro.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaCadastro.setText("Voltar");
        btVoltarTelaCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaCadastroActionPerformed(evt);
            }
        });
        telaCadastro.add(btVoltarTelaCadastro);
        btVoltarTelaCadastro.setBounds(513, 521, 201, 53);

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telaCadastro.add(jLabel1);
        jLabel1.setBounds(180, 80, 630, 410);

        painelCamadas.add(telaCadastro);
        telaCadastro.setBounds(0, 0, 1000, 601);

        telaCinematica.setPreferredSize(new java.awt.Dimension(1000, 600));

        txtCinematicaTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtCinematicaTelaCinematica.setForeground(new java.awt.Color(0, 153, 0));
        txtCinematicaTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/cinematica.png"))); // NOI18N
        txtCinematicaTelaCinematica.setText("Cinemática");

        btExplicacaoTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/exRetangular.png"))); // NOI18N
        btExplicacaoTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExplicacaoTelaCinematicaActionPerformed(evt);
            }
        });

        btVelocidadeMediaTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVelocidadeMediaTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/velocidadeMedia.png"))); // NOI18N
        btVelocidadeMediaTelaCinematica.setText("Velocidade Média");
        btVelocidadeMediaTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVelocidadeMediaTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVelocidadeMediaTelaCinematicaActionPerformed(evt);
            }
        });

        btMovimentoUniformeTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMovimentoUniformeTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoUniforme.png"))); // NOI18N
        btMovimentoUniformeTelaCinematica.setText("Mov. Uniforme");
        btMovimentoUniformeTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMovimentoUniformeTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoUniformeTelaCinematicaActionPerformed(evt);
            }
        });

        btMovimentoUniformeVariadoTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMovimentoUniformeVariadoTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoUniformeVariado.png"))); // NOI18N
        btMovimentoUniformeVariadoTelaCinematica.setText("Mov. Uni. Var");
        btMovimentoUniformeVariadoTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMovimentoUniformeVariadoTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoUniformeVariadoTelaCinematicaActionPerformed(evt);
            }
        });

        btMovimentoVerticalTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMovimentoVerticalTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimento vertical.png"))); // NOI18N
        btMovimentoVerticalTelaCinematica.setText("Mov. Vertical");
        btMovimentoVerticalTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMovimentoVerticalTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoVerticalTelaCinematicaActionPerformed(evt);
            }
        });

        btMovimentoObliquoTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMovimentoObliquoTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoObliquo.png"))); // NOI18N
        btMovimentoObliquoTelaCinematica.setText("Mov. Oblíquo");
        btMovimentoObliquoTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMovimentoObliquoTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoObliquoTelaCinematicaActionPerformed(evt);
            }
        });

        btMovimentoCircularTelaCinematica.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMovimentoCircularTelaCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoCircular.png"))); // NOI18N
        btMovimentoCircularTelaCinematica.setText("Mov. Circular");
        btMovimentoCircularTelaCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMovimentoCircularTelaCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimentoCircularTelaCinematicaActionPerformed(evt);
            }
        });

        btVoltarTelaAnteriorCinematica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btVoltarTelaAnteriorCinematica.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaAnteriorCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaAnteriorCinematica.setText("Voltar");
        btVoltarTelaAnteriorCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaAnteriorCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaAnteriorCinematicaActionPerformed(evt);
            }
        });

        btVoltarTelaInicioCinematica.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btVoltarTelaInicioCinematica.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaInicioCinematica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/inicio.png"))); // NOI18N
        btVoltarTelaInicioCinematica.setText("Início");
        btVoltarTelaInicioCinematica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaInicioCinematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicioCinematicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCinematicaLayout = new javax.swing.GroupLayout(telaCinematica);
        telaCinematica.setLayout(telaCinematicaLayout);
        telaCinematicaLayout.setHorizontalGroup(
            telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaCinematicaLayout.createSequentialGroup()
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCinematicaLayout.createSequentialGroup()
                        .addContainerGap(130, Short.MAX_VALUE)
                        .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMovimentoUniformeVariadoTelaCinematica)
                            .addComponent(btMovimentoObliquoTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 190, 190)
                        .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMovimentoVerticalTelaCinematica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMovimentoCircularTelaCinematica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaCinematicaLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btVelocidadeMediaTelaCinematica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMovimentoUniformeTelaCinematica)
                        .addGap(9, 9, 9)))
                .addGap(134, 134, 134))
            .addGroup(telaCinematicaLayout.createSequentialGroup()
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaCinematicaLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(txtCinematicaTelaCinematica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExplicacaoTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaCinematicaLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btVoltarTelaAnteriorCinematica)
                        .addGap(33, 33, 33)
                        .addComponent(btVoltarTelaInicioCinematica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telaCinematicaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btMovimentoObliquoTelaCinematica, btMovimentoUniformeVariadoTelaCinematica, btVelocidadeMediaTelaCinematica});

        telaCinematicaLayout.setVerticalGroup(
            telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCinematicaLayout.createSequentialGroup()
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaCinematicaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtCinematicaTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaCinematicaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btExplicacaoTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMovimentoUniformeTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVelocidadeMediaTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMovimentoVerticalTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMovimentoUniformeVariadoTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMovimentoObliquoTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMovimentoCircularTelaCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(telaCinematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltarTelaAnteriorCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltarTelaInicioCinematica, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        telaCinematicaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btMovimentoCircularTelaCinematica, btMovimentoObliquoTelaCinematica, btMovimentoUniformeTelaCinematica, btMovimentoUniformeVariadoTelaCinematica, btMovimentoVerticalTelaCinematica, btVelocidadeMediaTelaCinematica});

        painelCamadas.add(telaCinematica);
        telaCinematica.setBounds(0, 0, 1000, 612);

        telaVelocidadeMedia.setPreferredSize(new java.awt.Dimension(1000, 600));

        txtVelocidadeMediaTituloTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtVelocidadeMediaTituloTelaVelocidadeMedia.setForeground(new java.awt.Color(255, 255, 0));
        txtVelocidadeMediaTituloTelaVelocidadeMedia.setText("Velocidade Média");

        txtTitpoDeCalculoTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTitpoDeCalculoTelaVelocidadeMedia.setText("O que você deseja calcular?");

        selecionarTipodeCalculoTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selecionarTipodeCalculoTelaVelocidadeMedia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Velocidade Média", "Espaço Percorrido", "Tempo Gasto" }));
        selecionarTipodeCalculoTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTipodeCalculoTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        txtTempoGastoTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTempoGastoTelaVelocidadeMedia.setText("∆T = ∆V / ∆S");

        txtVelocidadeMediaTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtVelocidadeMediaTelaVelocidadeMedia.setText("∆V = ∆S / ∆T");

        txtFormulaEspacoPercorridoTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaEspacoPercorridoTelaVelocidadeMedia.setText("∆S = ∆V * ∆T");

        a1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a1.setText("∆S = ");

        a2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 255, 0));
        a2.setCaretColor(new java.awt.Color(255, 255, 0));
        a2.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a2.setSelectionColor(new java.awt.Color(255, 255, 0));

        a3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        a4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a4.setText("∆T = ");

        a5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a5.setForeground(new java.awt.Color(255, 255, 0));
        a5.setCaretColor(new java.awt.Color(255, 255, 0));
        a5.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a5.setSelectionColor(new java.awt.Color(255, 255, 0));
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        a7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a7.setText("Unidade ∆V  : ");

        a8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });

        a9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a9.setForeground(new java.awt.Color(255, 0, 0));
        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        a9.setText("Calcular!");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });

        a10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a10.setForeground(new java.awt.Color(255, 255, 0));
        a10.setCaretColor(new java.awt.Color(255, 255, 0));
        a10.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a10.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a10.setSelectionColor(new java.awt.Color(255, 255, 0));
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setText("∆V = ");

        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 0));
        b2.setCaretColor(new java.awt.Color(255, 255, 0));
        b2.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        b2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b2.setSelectionColor(new java.awt.Color(255, 255, 0));

        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.setText("∆T = ");

        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 0));
        b5.setCaretColor(new java.awt.Color(255, 255, 0));
        b5.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        b5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b5.setSelectionColor(new java.awt.Color(255, 255, 0));

        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7.setText("Unidade ∆S  : ");

        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 0, 0));
        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        b9.setText("Calcular!");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b10.setForeground(new java.awt.Color(255, 255, 0));
        b10.setCaretColor(new java.awt.Color(255, 255, 0));
        b10.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        b10.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b10.setSelectionColor(new java.awt.Color(255, 255, 0));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        c1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c1.setText("∆V = ");

        c2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 0));
        c2.setCaretColor(new java.awt.Color(255, 255, 0));
        c2.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        c2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c2.setSelectionColor(new java.awt.Color(255, 255, 0));

        c3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c4.setText("∆S = ");

        c5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 0));
        c5.setCaretColor(new java.awt.Color(255, 255, 0));
        c5.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        c5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c5.setSelectionColor(new java.awt.Color(255, 255, 0));

        c6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        c7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c7.setText("Unidade ∆T  : ");

        c8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });

        c9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        c9.setForeground(new java.awt.Color(255, 0, 0));
        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        c9.setText("Calcular!");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });

        c10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c10.setForeground(new java.awt.Color(255, 255, 0));
        c10.setCaretColor(new java.awt.Color(255, 255, 0));
        c10.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        c10.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c10.setSelectionColor(new java.awt.Color(255, 255, 0));
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });

        btVisualizarCalculoTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btVisualizarCalculoTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 204));
        btVisualizarCalculoTelaVelocidadeMedia.setText("Visualizar Cálculo");
        btVisualizarCalculoTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarCalculoTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        estradaTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/estrada.jpg"))); // NOI18N
        estradaTelaVelocidadeMedia.setText("jLabel16");

        carrinhoTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagenscarrinhos/1.png"))); // NOI18N

        velocidadeTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        velocidadeTelaVelocidadeMedia.setForeground(new java.awt.Color(255, 255, 0));

        km1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        km1.setForeground(new java.awt.Color(255, 255, 0));
        km1.setText("0");

        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 0));
        t1.setText("0");

        km2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        km2.setForeground(new java.awt.Color(255, 255, 0));
        km2.setText("0");

        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 0));
        t2.setText("0");

        km3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        km3.setForeground(new java.awt.Color(255, 255, 0));
        km3.setText("0");

        t3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 0));
        t3.setText("0");

        km4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        km4.setForeground(new java.awt.Color(255, 255, 0));
        km4.setText("0");

        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 0));
        t4.setText("0");

        btContinuaTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btContinuaTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 204));
        btContinuaTelaVelocidadeMedia.setText("CONTINUAR");
        btContinuaTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinuaTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        btPausaTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPausaTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 204));
        btPausaTelaVelocidadeMedia.setText("PAUSAR");
        btPausaTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausaTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        txtAux1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux1.setForeground(new java.awt.Color(255, 255, 0));
        txtAux1.setText("0 km");

        txtAux2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux2.setForeground(new java.awt.Color(255, 255, 0));
        txtAux2.setText("0 hr");

        txtAux3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux3.setForeground(new java.awt.Color(255, 255, 0));
        txtAux3.setText("x hr");

        txtAux4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux4.setForeground(new java.awt.Color(255, 255, 0));
        txtAux4.setText("x km");

        txtAux5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux5.setForeground(new java.awt.Color(255, 255, 0));
        txtAux5.setText("x hr");

        txtAux6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux6.setForeground(new java.awt.Color(255, 255, 0));
        txtAux6.setText("x km");

        txtAux7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux7.setForeground(new java.awt.Color(255, 255, 0));
        txtAux7.setText("x hr");

        txtAux8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAux8.setForeground(new java.awt.Color(255, 255, 0));
        txtAux8.setText("x km");

        btVoltarTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaVelocidadeMedia.setText("Voltar");
        btVoltarTelaVelocidadeMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        btLimparTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btLimparTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 255));
        btLimparTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/limpar.png"))); // NOI18N
        btLimparTelaVelocidadeMedia.setText("Limpar");
        btLimparTelaVelocidadeMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimparTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        btInicioTelaVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btInicioTelaVelocidadeMedia.setForeground(new java.awt.Color(0, 0, 255));
        btInicioTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/inicio.png"))); // NOI18N
        btInicioTelaVelocidadeMedia.setText("Início");
        btInicioTelaVelocidadeMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btInicioTelaVelocidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioTelaVelocidadeMediaActionPerformed(evt);
            }
        });

        borda1TelaVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        borda2TelaVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        javax.swing.GroupLayout telaVelocidadeMediaLayout = new javax.swing.GroupLayout(telaVelocidadeMedia);
        telaVelocidadeMedia.setLayout(telaVelocidadeMediaLayout);
        telaVelocidadeMediaLayout.setHorizontalGroup(
            telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borda1TelaVelocidadeMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(txtVelocidadeMediaTituloTelaVelocidadeMedia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(borda2TelaVelocidadeMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(velocidadeTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(carrinhoTelaVelocidadeMedia))
                        .addGap(180, 180, 180)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(km2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAux8))
                        .addGap(230, 230, 230)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAux6)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPausaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btContinuaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAux4)
                                    .addComponent(txtAux3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(km4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtAux1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtAux2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(km1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(txtAux5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(txtAux7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(km3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estradaTelaVelocidadeMedia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btVoltarTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btLimparTelaVelocidadeMedia)
                        .addGap(35, 35, 35)
                        .addComponent(btInicioTelaVelocidadeMedia))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btVisualizarCalculoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitpoDeCalculoTelaVelocidadeMedia)
                        .addGap(18, 18, 18)
                        .addComponent(selecionarTipodeCalculoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFormulaEspacoPercorridoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTempoGastoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVelocidadeMediaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        telaVelocidadeMediaLayout.setVerticalGroup(
            telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                .addComponent(txtVelocidadeMediaTituloTelaVelocidadeMedia)
                .addGap(28, 28, 28)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitpoDeCalculoTelaVelocidadeMedia)
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(selecionarTipodeCalculoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormulaEspacoPercorridoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoGastoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVelocidadeMediaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borda1TelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(c1)
                    .addComponent(a1)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4)
                    .addComponent(c4)
                    .addComponent(b4)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7)
                    .addComponent(c7)
                    .addComponent(a7)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a9)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVisualizarCalculoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(borda2TelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(velocidadeTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(carrinhoTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(km2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtAux8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(txtAux6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addComponent(btPausaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btContinuaTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAux4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtAux3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(km4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(txtAux1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(txtAux2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(km1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(txtAux5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(txtAux7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(km3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estradaTelaVelocidadeMedia))
                .addGap(6, 6, 6)
                .addGroup(telaVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltarTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparTelaVelocidadeMedia)
                    .addComponent(btInicioTelaVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        painelCamadas.add(telaVelocidadeMedia);
        telaVelocidadeMedia.setBounds(0, 0, 1000, 612);

        telaDemonstracaoCalculoVelocidadeMedia.setPreferredSize(new java.awt.Dimension(1000, 600));

        textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.setForeground(new java.awt.Color(255, 0, 0));
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.setText("Voltar");
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaExplicacaoFormulaVelocidadeMedia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaExplicacaoFormulaVelocidadeMedia3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaDemonstracaoCalculoVelocidadeMediaLayout = new javax.swing.GroupLayout(telaDemonstracaoCalculoVelocidadeMedia);
        telaDemonstracaoCalculoVelocidadeMedia.setLayout(telaDemonstracaoCalculoVelocidadeMediaLayout);
        telaDemonstracaoCalculoVelocidadeMediaLayout.setHorizontalGroup(
            telaDemonstracaoCalculoVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(btVoltarTelaExplicacaoFormulaVelocidadeMedia3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaDemonstracaoCalculoVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                        .addGroup(telaDemonstracaoCalculoVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)))
                .addGap(244, 244, 244))
        );
        telaDemonstracaoCalculoVelocidadeMediaLayout.setVerticalGroup(
            telaDemonstracaoCalculoVelocidadeMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoVelocidadeMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltarTelaExplicacaoFormulaVelocidadeMedia3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelCamadas.add(telaDemonstracaoCalculoVelocidadeMedia);
        telaDemonstracaoCalculoVelocidadeMedia.setBounds(10, 1, 1000, 600);

        txtTopo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTopo.setForeground(new java.awt.Color(255, 255, 0));
        txtTopo.setText("Funçao horária do deslocamento");

        txtOQueVoceDesejaCalcularTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOQueVoceDesejaCalcularTelaMovimentoUniforme.setText("O que você deseja calcular?");

        selecionarTipoDeCalculoTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selecionarTipoDeCalculoTelaMovimentoUniforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espaço Final", "Espaço Inicial", "Velocidade Média", "Tempo Gasto" }));
        selecionarTipoDeCalculoTelaMovimentoUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTipoDeCalculoTelaMovimentoUniformeActionPerformed(evt);
            }
        });

        txtFormulaTTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaTTelaMovimentoUniforme.setText("∆T  = (S - So)  / ∆V");

        txtFormulaSTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaSTelaMovimentoUniforme.setText("S  = So +  ∆V * ∆T");

        txtFormulaSoTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaSoTelaMovimentoUniforme.setText("So  = S -  ∆V * ∆T");

        txtFormulaVTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaVTelaMovimentoUniforme.setText("∆V  = (S - So)  / ∆T");

        a_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a_1.setText("So = ");

        a_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_2.setForeground(new java.awt.Color(255, 255, 0));
        a_2.setCaretColor(new java.awt.Color(255, 255, 0));
        a_2.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a_2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a_2.setSelectionColor(new java.awt.Color(255, 255, 0));

        a_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        a_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_3ActionPerformed(evt);
            }
        });

        a_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a_4.setText("V =");

        a_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_5.setForeground(new java.awt.Color(255, 255, 0));
        a_5.setCaretColor(new java.awt.Color(255, 255, 0));
        a_5.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a_5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a_5.setSelectionColor(new java.awt.Color(255, 255, 0));

        a_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        a_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_6ActionPerformed(evt);
            }
        });

        a_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a_7.setText("T =");

        a_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_8.setForeground(new java.awt.Color(255, 255, 0));
        a_8.setCaretColor(new java.awt.Color(255, 255, 0));
        a_8.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a_8.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a_8.setSelectionColor(new java.awt.Color(255, 255, 0));

        a_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        a_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_9ActionPerformed(evt);
            }
        });

        a_10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a_10.setText("Unidade S :");

        a_11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        a_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_11ActionPerformed(evt);
            }
        });

        a_12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_12.setForeground(new java.awt.Color(255, 0, 0));
        a_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        a_12.setText("Calcular!");
        a_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_12ActionPerformed(evt);
            }
        });

        a_13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a_13.setForeground(new java.awt.Color(255, 255, 0));
        a_13.setCaretColor(new java.awt.Color(255, 255, 0));
        a_13.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a_13.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a_13.setSelectionColor(new java.awt.Color(255, 255, 0));
        a_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_13ActionPerformed(evt);
            }
        });

        b_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_1.setText("S = ");

        b_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_2.setForeground(new java.awt.Color(255, 255, 0));
        b_2.setCaretColor(new java.awt.Color(255, 255, 0));
        b_2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b_2.setSelectionColor(new java.awt.Color(255, 255, 0));

        b_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });

        b_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_4.setText("V = ");

        b_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_5.setForeground(new java.awt.Color(255, 255, 0));
        b_5.setCaretColor(new java.awt.Color(255, 255, 0));
        b_5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b_5.setSelectionColor(new java.awt.Color(255, 255, 0));

        b_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        b_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_6ActionPerformed(evt);
            }
        });

        b_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_7.setText("T = ");

        b_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_8.setForeground(new java.awt.Color(255, 255, 0));
        b_8.setCaretColor(new java.awt.Color(255, 255, 0));
        b_8.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b_8.setSelectionColor(new java.awt.Color(255, 255, 0));

        b_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        b_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_9ActionPerformed(evt);
            }
        });

        b_10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_10.setText("Unidade So :");

        b_11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        b_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_11ActionPerformed(evt);
            }
        });

        b_12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_12.setForeground(new java.awt.Color(255, 0, 0));
        b_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        b_12.setText("Calcular!");
        b_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_12ActionPerformed(evt);
            }
        });

        b_13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_13.setForeground(new java.awt.Color(255, 255, 0));
        b_13.setCaretColor(new java.awt.Color(255, 255, 0));
        b_13.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b_13.setSelectionColor(new java.awt.Color(255, 255, 0));
        b_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_13ActionPerformed(evt);
            }
        });

        c_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c_1.setText("So = ");

        c_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_2.setForeground(new java.awt.Color(255, 255, 0));
        c_2.setCaretColor(new java.awt.Color(255, 255, 0));
        c_2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c_2.setSelectionColor(new java.awt.Color(255, 255, 0));

        c_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        c_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_3ActionPerformed(evt);
            }
        });

        c_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c_4.setText("S = ");

        c_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_5.setForeground(new java.awt.Color(255, 255, 0));
        c_5.setCaretColor(new java.awt.Color(255, 255, 0));
        c_5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c_5.setSelectionColor(new java.awt.Color(255, 255, 0));

        c_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        c_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_6ActionPerformed(evt);
            }
        });

        c_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c_7.setText("T =");

        c_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_8.setForeground(new java.awt.Color(255, 255, 0));
        c_8.setCaretColor(new java.awt.Color(255, 255, 0));
        c_8.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c_8.setSelectionColor(new java.awt.Color(255, 255, 0));

        c_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        c_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_9ActionPerformed(evt);
            }
        });

        c_10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c_10.setText("Unidade V :");

        c_11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        c_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_11ActionPerformed(evt);
            }
        });

        c_12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_12.setForeground(new java.awt.Color(255, 0, 0));
        c_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        c_12.setText("Calcular!");
        c_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_12ActionPerformed(evt);
            }
        });

        c_13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c_13.setForeground(new java.awt.Color(255, 255, 0));
        c_13.setCaretColor(new java.awt.Color(255, 255, 0));
        c_13.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c_13.setSelectionColor(new java.awt.Color(255, 255, 0));
        c_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_13ActionPerformed(evt);
            }
        });

        d_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_1.setText("So = ");

        d_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_2.setForeground(new java.awt.Color(255, 255, 0));
        d_2.setCaretColor(new java.awt.Color(255, 255, 0));
        d_2.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        d_2.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d_2.setSelectionColor(new java.awt.Color(255, 255, 0));

        d_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        d_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_3ActionPerformed(evt);
            }
        });

        d_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_4.setText("S = ");

        d_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_5.setForeground(new java.awt.Color(255, 255, 0));
        d_5.setCaretColor(new java.awt.Color(255, 255, 0));
        d_5.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d_5.setSelectionColor(new java.awt.Color(255, 255, 0));

        d_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        d_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_6ActionPerformed(evt);
            }
        });

        d_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_7.setText("V = ");

        d_9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        d_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_9ActionPerformed(evt);
            }
        });

        d_10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_10.setText("Unidade T : ");

        d_8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_8.setForeground(new java.awt.Color(255, 255, 0));
        d_8.setCaretColor(new java.awt.Color(255, 255, 0));
        d_8.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d_8.setSelectionColor(new java.awt.Color(255, 255, 0));

        d_11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hr", "Min" }));
        d_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_11ActionPerformed(evt);
            }
        });

        d_12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_12.setForeground(new java.awt.Color(255, 0, 0));
        d_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        d_12.setText("Calcular!");
        d_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_12ActionPerformed(evt);
            }
        });

        d_13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d_13.setForeground(new java.awt.Color(255, 255, 0));
        d_13.setCaretColor(new java.awt.Color(255, 255, 0));
        d_13.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d_13.setSelectionColor(new java.awt.Color(255, 255, 0));
        d_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_13ActionPerformed(evt);
            }
        });

        visualizarCalculoTelaMovUniforme.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        visualizarCalculoTelaMovUniforme.setForeground(new java.awt.Color(0, 0, 204));
        visualizarCalculoTelaMovUniforme.setText("Visualizar Cálculo");
        visualizarCalculoTelaMovUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCalculoTelaMovUniformeActionPerformed(evt);
            }
        });

        estrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/estrada.jpg"))); // NOI18N

        carrinho_1.setForeground(new java.awt.Color(255, 255, 0));
        carrinho_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagenscarrinhos/1.png"))); // NOI18N

        velocidade_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        velocidade_1.setForeground(new java.awt.Color(255, 255, 0));

        btContinua_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btContinua_1.setForeground(new java.awt.Color(0, 0, 204));
        btContinua_1.setText("CONTINUAR");
        btContinua_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinua_1ActionPerformed(evt);
            }
        });

        btPausa_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPausa_1.setForeground(new java.awt.Color(0, 0, 204));
        btPausa_1.setText("PAUSAR");
        btPausa_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausa_1ActionPerformed(evt);
            }
        });

        t1_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1_1.setForeground(new java.awt.Color(255, 255, 0));
        t1_1.setText("0");

        k1_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k1_1.setForeground(new java.awt.Color(255, 255, 0));
        k1_1.setText("0");

        k2_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k2_2.setForeground(new java.awt.Color(255, 255, 0));
        k2_2.setText("0");

        t2_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2_2.setForeground(new java.awt.Color(255, 255, 0));
        t2_2.setText("0");

        k3_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k3_3.setForeground(new java.awt.Color(255, 255, 0));
        k3_3.setText("0");

        t3_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3_3.setForeground(new java.awt.Color(255, 255, 0));
        t3_3.setText("0");

        k4_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k4_4.setForeground(new java.awt.Color(255, 255, 0));
        k4_4.setText("0");

        t4_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4_4.setForeground(new java.awt.Color(255, 255, 0));
        t4_4.setText("0");

        txtkm1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm1.setForeground(new java.awt.Color(255, 255, 0));
        txtkm1.setText("0 km");

        txtt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt1.setForeground(new java.awt.Color(255, 255, 0));
        txtt1.setText("0 hr");

        txtkm2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm2.setForeground(new java.awt.Color(255, 255, 0));
        txtkm2.setText("x km");

        txtt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt2.setForeground(new java.awt.Color(255, 255, 0));
        txtt2.setText("x hr");

        txtt4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt4.setForeground(new java.awt.Color(255, 255, 0));
        txtt4.setText("x hr");

        txtkm4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm4.setForeground(new java.awt.Color(255, 255, 0));
        txtkm4.setText("x km");

        txtt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt3.setForeground(new java.awt.Color(255, 255, 0));
        txtt3.setText("x hr");

        txtkm3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm3.setForeground(new java.awt.Color(255, 255, 0));
        txtkm3.setText("x km");

        btVoltarTelaInicioMovUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaInicioMovUniforme.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaInicioMovUniforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/inicio.png"))); // NOI18N
        btVoltarTelaInicioMovUniforme.setText("Início");
        btVoltarTelaInicioMovUniforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaInicioMovUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicioMovUniformeActionPerformed(evt);
            }
        });

        btLimparTelaMovUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btLimparTelaMovUniforme.setForeground(new java.awt.Color(0, 0, 255));
        btLimparTelaMovUniforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/limpar.png"))); // NOI18N
        btLimparTelaMovUniforme.setText("Limpar");
        btLimparTelaMovUniforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimparTelaMovUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelaMovUniformeActionPerformed(evt);
            }
        });

        btVoltarTelaMovUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaMovUniforme.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaMovUniforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaMovUniforme.setText("Voltar");
        btVoltarTelaMovUniforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaMovUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaMovUniformeActionPerformed(evt);
            }
        });

        borda1TelaMovimentoUniforme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        borda2TelaMovimentoUniforme.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        javax.swing.GroupLayout telaMovimentoUniformeLayout = new javax.swing.GroupLayout(telaMovimentoUniforme);
        telaMovimentoUniforme.setLayout(telaMovimentoUniformeLayout);
        telaMovimentoUniformeLayout.setHorizontalGroup(
            telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaMovimentoUniformeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaMovimentoUniformeLayout.createSequentialGroup()
                        .addComponent(txtTopo)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaMovimentoUniformeLayout.createSequentialGroup()
                        .addComponent(txtOQueVoceDesejaCalcularTelaMovimentoUniforme)
                        .addGap(19, 19, 19)
                        .addComponent(selecionarTipoDeCalculoTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
            .addComponent(borda1TelaMovimentoUniforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(borda2TelaMovimentoUniforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_4)
                            .addComponent(d_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d_5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c_5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a_5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_7)
                            .addComponent(a_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a_11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(d_11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d_13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(visualizarCalculoTelaMovUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(velocidade_1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(505, 505, 505)
                        .addComponent(k3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carrinho_1)
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(k2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(k1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(txtt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(txtkm4))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(k4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(txtkm3))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(t3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtkm1))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(t1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(t2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(txtkm2))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(btPausa_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(t4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(btContinua_1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estrada, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtFormulaSTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFormulaTTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormulaVTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtFormulaSoTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btVoltarTelaMovUniforme)
                        .addGap(63, 63, 63)
                        .addComponent(btLimparTelaMovUniforme)
                        .addGap(53, 53, 53)
                        .addComponent(btVoltarTelaInicioMovUniforme)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        telaMovimentoUniformeLayout.setVerticalGroup(
            telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                .addComponent(txtTopo)
                .addGap(22, 22, 22)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOQueVoceDesejaCalcularTelaMovimentoUniforme)
                    .addComponent(selecionarTipoDeCalculoTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormulaSTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaTTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaVTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaSoTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borda1TelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_1)
                    .addComponent(d_1)
                    .addComponent(c_1)
                    .addComponent(a_1)
                    .addComponent(c_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_4)
                    .addComponent(d_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_4)
                    .addComponent(c_4)
                    .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_4)
                    .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_7)
                    .addComponent(b_7)
                    .addComponent(d_7)
                    .addComponent(a_7)
                    .addComponent(c_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d_10)
                    .addComponent(b_10)
                    .addComponent(a_10)
                    .addComponent(c_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarCalculoTelaMovUniforme)
                    .addComponent(c_10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(borda2TelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(velocidade_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(k3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(carrinho_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(k2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(k1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(txtkm4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(k4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(t3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(t1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(t2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btPausa_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(t4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btContinua_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estrada, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltarTelaInicioMovUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(telaMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btLimparTelaMovUniforme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btVoltarTelaMovUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        painelCamadas.add(telaMovimentoUniforme);
        telaMovimentoUniforme.setBounds(0, 0, 1000, 600);

        telaDemonstracaoCalculoMovimentoUniforme.setPreferredSize(new java.awt.Dimension(1000, 600));

        btVoltarTelaExplicacaoFormulaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaExplicacaoFormulaMovimentoUniforme.setForeground(new java.awt.Color(255, 0, 0));
        btVoltarTelaExplicacaoFormulaMovimentoUniforme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaExplicacaoFormulaMovimentoUniforme.setText("Voltar");
        btVoltarTelaExplicacaoFormulaMovimentoUniforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaExplicacaoFormulaMovimentoUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaExplicacaoFormulaMovimentoUniformeActionPerformed(evt);
            }
        });

        textoExplicacaoCalculoMovimentoUniforme1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoMovimentoUniforme1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme0.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoExplicacaoCalculoMovimentoUniforme2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoMovimentoUniforme6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoCalculosTelaMovimentoUniforme.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        textoCalculosTelaMovimentoUniforme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoCalculosTelaMovimentoUniforme.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout telaDemonstracaoCalculoMovimentoUniformeLayout = new javax.swing.GroupLayout(telaDemonstracaoCalculoMovimentoUniforme);
        telaDemonstracaoCalculoMovimentoUniforme.setLayout(telaDemonstracaoCalculoMovimentoUniformeLayout);
        telaDemonstracaoCalculoMovimentoUniformeLayout.setHorizontalGroup(
            telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme0, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                                .addComponent(textoExplicacaoCalculoMovimentoUniforme2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoExplicacaoCalculoMovimentoUniforme5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoExplicacaoCalculoMovimentoUniforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme6, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(textoCalculosTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(btVoltarTelaExplicacaoFormulaMovimentoUniforme))
        );
        telaDemonstracaoCalculoMovimentoUniformeLayout.setVerticalGroup(
            telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(telaDemonstracaoCalculoMovimentoUniformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(textoCalculosTelaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btVoltarTelaExplicacaoFormulaMovimentoUniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelCamadas.add(telaDemonstracaoCalculoMovimentoUniforme);
        telaDemonstracaoCalculoMovimentoUniforme.setBounds(10, 1, 1000, 600);

        telaMRUV.setPreferredSize(new java.awt.Dimension(1000, 600));

        txtCinematicaTelaMRUV.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtCinematicaTelaMRUV.setForeground(new java.awt.Color(0, 153, 0));
        txtCinematicaTelaMRUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/cinematica.png"))); // NOI18N
        txtCinematicaTelaMRUV.setText("Movimento Retilíneo Uniforme Variado");

        btExplicacaoTelaMRUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/exRetangular.png"))); // NOI18N
        btExplicacaoTelaMRUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExplicacaoTelaMRUVActionPerformed(evt);
            }
        });

        btMRUVAceleracaoMedia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMRUVAceleracaoMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/velocidadeMedia.png"))); // NOI18N
        btMRUVAceleracaoMedia.setText("Aceleração Média");
        btMRUVAceleracaoMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMRUVAceleracaoMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMRUVAceleracaoMediaActionPerformed(evt);
            }
        });

        btMRUVFuncaoHorariaDaPosicao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMRUVFuncaoHorariaDaPosicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoUniforme.png"))); // NOI18N
        btMRUVFuncaoHorariaDaPosicao.setText("Função Horária da Posição");
        btMRUVFuncaoHorariaDaPosicao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMRUVFuncaoHorariaDaPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMRUVFuncaoHorariaDaPosicaoActionPerformed(evt);
            }
        });

        btMRUVPosicaoEmFuncaoDoTempo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMRUVPosicaoEmFuncaoDoTempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimentoUniformeVariado.png"))); // NOI18N
        btMRUVPosicaoEmFuncaoDoTempo.setText("Posição em Função do Tempo");
        btMRUVPosicaoEmFuncaoDoTempo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMRUVPosicaoEmFuncaoDoTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMRUVPosicaoEmFuncaoDoTempoActionPerformed(evt);
            }
        });

        btMRUVEquacaoDeTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btMRUVEquacaoDeTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/movimento vertical.png"))); // NOI18N
        btMRUVEquacaoDeTorricelli.setText("Equação de Torricelli");
        btMRUVEquacaoDeTorricelli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btMRUVEquacaoDeTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMRUVEquacaoDeTorricelliActionPerformed(evt);
            }
        });

        btVoltarTelaAnteriorMRUV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btVoltarTelaAnteriorMRUV.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaAnteriorMRUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaAnteriorMRUV.setText("Voltar");
        btVoltarTelaAnteriorMRUV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaAnteriorMRUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaAnteriorMRUVActionPerformed(evt);
            }
        });

        btVoltarTelaInicioMRUV.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btVoltarTelaInicioMRUV.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaInicioMRUV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/inicio.png"))); // NOI18N
        btVoltarTelaInicioMRUV.setText("Início");
        btVoltarTelaInicioMRUV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaInicioMRUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicioMRUVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaMRUVLayout = new javax.swing.GroupLayout(telaMRUV);
        telaMRUV.setLayout(telaMRUVLayout);
        telaMRUVLayout.setHorizontalGroup(
            telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMRUVLayout.createSequentialGroup()
                .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMRUVLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMRUVEquacaoDeTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMRUVAceleracaoMedia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btMRUVPosicaoEmFuncaoDoTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btMRUVFuncaoHorariaDaPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(184, 184, 184))
                    .addGroup(telaMRUVLayout.createSequentialGroup()
                        .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaMRUVLayout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(btVoltarTelaAnteriorMRUV)
                                .addGap(121, 121, 121)
                                .addComponent(btVoltarTelaInicioMRUV))
                            .addGroup(telaMRUVLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(txtCinematicaTelaMRUV)
                                .addGap(18, 18, 18)
                                .addComponent(btExplicacaoTelaMRUV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(219, 219, 219))
        );
        telaMRUVLayout.setVerticalGroup(
            telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMRUVLayout.createSequentialGroup()
                .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMRUVLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtCinematicaTelaMRUV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btExplicacaoTelaMRUV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(telaMRUVLayout.createSequentialGroup()
                        .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btMRUVPosicaoEmFuncaoDoTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMRUVAceleracaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btMRUVEquacaoDeTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btMRUVFuncaoHorariaDaPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(telaMRUVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltarTelaInicioMRUV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltarTelaAnteriorMRUV, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        painelCamadas.add(telaMRUV);
        telaMRUV.setBounds(0, 0, 1000, 612);

        txtTopoTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTopoTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        txtTopoTorricelli.setText("Equação de Torricelli");

        txtOQueVoceDesejaCalcularTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOQueVoceDesejaCalcularTelaMRUVTorricelli.setText("O que você deseja calcular?");

        selecionarTipoDeCalculoTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selecionarTipoDeCalculoTelaMRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Velocidade Final", "Velocidade Inicial", "Aceleração", "Variação de Espaço" }));
        selecionarTipoDeCalculoTelaMRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarTipoDeCalculoTelaMRUVTorricelliActionPerformed(evt);
            }
        });

        txtFormulaVTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaVTelaMRUVTorricelli.setText("V² = Vo² + 2A * ∆S");

        txtFormulaVoTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaVoTelaMRUVTorricelli.setText("Vo² = V² - 2A * ∆S");

        txtFormulaATelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaATelaMRUVTorricelli.setText("A = (V² - Vo²) / 2*∆S");

        txtFormulaDeltaSTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFormulaDeltaSTelaMRUVTorricelli.setText("∆S = (V² - Vo²) / 2A");

        a1_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a1_MRUVTorricelli.setText("Vo² =");

        a2_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a2_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        a2_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        a2_MRUVTorricelli.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a2_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a2_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        a3_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a3_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        a3_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3_MRUVTorricelliActionPerformed(evt);
            }
        });

        a4_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a4_MRUVTorricelli.setText("A = ");

        a5_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a5_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        a5_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        a5_MRUVTorricelli.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a5_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a5_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        a6_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a6_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h²", "M/s²" }));
        a6_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6_MRUVTorricelliActionPerformed(evt);
            }
        });

        a7_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a7_MRUVTorricelli.setText("∆S =");

        a8_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a8_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        a8_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        a8_MRUVTorricelli.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a8_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a8_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        a9_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a9_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        a9_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9_MRUVTorricelliActionPerformed(evt);
            }
        });

        a10_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        a10_MRUVTorricelli.setText("Unidade V :");

        a11_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a11_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        a11_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11_MRUVTorricelliActionPerformed(evt);
            }
        });

        a12_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a12_MRUVTorricelli.setForeground(new java.awt.Color(255, 0, 0));
        a12_MRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        a12_MRUVTorricelli.setText("Calcular!");
        a12_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a12_MRUVTorricelliActionPerformed(evt);
            }
        });

        a13_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        a13_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        a13_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        a13_MRUVTorricelli.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        a13_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        a13_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));
        a13_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a13_MRUVTorricelliActionPerformed(evt);
            }
        });

        b1_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1_MRUVTorricelli.setText("V² =");

        b2_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        b2_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        b2_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b2_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        b3_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        b3_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3_MRUVTorricelliActionPerformed(evt);
            }
        });

        b4_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4_MRUVTorricelli.setText("A =");

        b5_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        b5_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        b5_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b5_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        b6_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h²", "M/s²" }));
        b6_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6_MRUVTorricelliActionPerformed(evt);
            }
        });

        b7_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7_MRUVTorricelli.setText("∆S = ");

        b8_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        b8_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        b8_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b8_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        b9_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        b9_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9_MRUVTorricelliActionPerformed(evt);
            }
        });

        b10_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b10_MRUVTorricelli.setText("Unidade Vo :");

        b11_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b11_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        b11_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11_MRUVTorricelliActionPerformed(evt);
            }
        });

        b12_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b12_MRUVTorricelli.setForeground(new java.awt.Color(255, 0, 0));
        b12_MRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        b12_MRUVTorricelli.setText("Calcular!");
        b12_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12_MRUVTorricelliActionPerformed(evt);
            }
        });

        b13_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b13_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        b13_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        b13_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        b13_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));
        b13_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13_MRUVTorricelliActionPerformed(evt);
            }
        });

        c1_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c1_MRUVTorricelli.setText("V² = ");

        c2_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c2_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        c2_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        c2_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c2_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        c3_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c3_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        c3_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3_MRUVTorricelliActionPerformed(evt);
            }
        });

        c4_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c4_MRUVTorricelli.setText("Vo² = ");

        c5_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c5_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        c5_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        c5_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c5_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        c6_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c6_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        c6_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6_MRUVTorricelliActionPerformed(evt);
            }
        });

        c7_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c7_MRUVTorricelli.setText("∆S =");

        c8_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c8_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        c8_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        c8_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c8_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        c9_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c9_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        c9_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9_MRUVTorricelliActionPerformed(evt);
            }
        });

        c10_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        c10_MRUVTorricelli.setText("Unidade A :");

        c11_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c11_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h²", "M/s²" }));
        c11_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11_MRUVTorricelliActionPerformed(evt);
            }
        });

        c12_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c12_MRUVTorricelli.setForeground(new java.awt.Color(255, 0, 0));
        c12_MRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        c12_MRUVTorricelli.setText("Calcular!");
        c12_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12_MRUVTorricelliActionPerformed(evt);
            }
        });

        c13_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        c13_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        c13_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        c13_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        c13_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));
        c13_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13_MRUVTorricelliActionPerformed(evt);
            }
        });

        d1_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d1_MRUVTorricelli.setText("V² =");

        d2_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d2_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        d2_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        d2_MRUVTorricelli.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        d2_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d2_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        d3_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d3_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        d3_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3_MRUVTorricelliActionPerformed(evt);
            }
        });

        d4_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d4_MRUVTorricelli.setText("Vo² = ");

        d5_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d5_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        d5_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        d5_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d5_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        d6_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d6_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h", "M/s" }));
        d6_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6_MRUVTorricelliActionPerformed(evt);
            }
        });

        d7_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d7_MRUVTorricelli.setText("A = ");

        d8_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d8_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km/h²", "M/s²" }));
        d8_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8_MRUVTorricelliActionPerformed(evt);
            }
        });

        d9_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d9_MRUVTorricelli.setText("Unidade ∆S : ");

        d10_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d10_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        d10_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        d10_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d10_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));

        d11_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d11_MRUVTorricelli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Km", "M" }));
        d11_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d11_MRUVTorricelliActionPerformed(evt);
            }
        });

        d12_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d12_MRUVTorricelli.setForeground(new java.awt.Color(255, 0, 0));
        d12_MRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagens/calcular.png"))); // NOI18N
        d12_MRUVTorricelli.setText("Calcular!");
        d12_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d12_MRUVTorricelliActionPerformed(evt);
            }
        });

        d13_MRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        d13_MRUVTorricelli.setForeground(new java.awt.Color(255, 255, 0));
        d13_MRUVTorricelli.setCaretColor(new java.awt.Color(255, 255, 0));
        d13_MRUVTorricelli.setSelectedTextColor(new java.awt.Color(255, 255, 0));
        d13_MRUVTorricelli.setSelectionColor(new java.awt.Color(255, 255, 0));
        d13_MRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d13_MRUVTorricelliActionPerformed(evt);
            }
        });

        visualizarCalculoTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        visualizarCalculoTelaMRUVTorricelli.setForeground(new java.awt.Color(0, 0, 204));
        visualizarCalculoTelaMRUVTorricelli.setText("Visualizar Cálculo");
        visualizarCalculoTelaMRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCalculoTelaMRUVTorricelliActionPerformed(evt);
            }
        });

        estrada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/estrada.jpg"))); // NOI18N

        carrinho_2.setForeground(new java.awt.Color(255, 255, 0));
        carrinho_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagenscarrinhos/1.png"))); // NOI18N

        velocidade_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        velocidade_2.setForeground(new java.awt.Color(255, 255, 0));

        btContinua_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btContinua_2.setForeground(new java.awt.Color(0, 0, 204));
        btContinua_2.setText("CONTINUAR");
        btContinua_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContinua_2ActionPerformed(evt);
            }
        });

        btPausa_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPausa_2.setForeground(new java.awt.Color(0, 0, 204));
        btPausa_2.setText("PAUSAR");
        btPausa_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausa_2ActionPerformed(evt);
            }
        });

        t1_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1_2.setForeground(new java.awt.Color(255, 255, 0));
        t1_2.setText("0");

        k1_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k1_2.setForeground(new java.awt.Color(255, 255, 0));
        k1_2.setText("0");

        k2_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k2_3.setForeground(new java.awt.Color(255, 255, 0));
        k2_3.setText("0");

        t2_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2_3.setForeground(new java.awt.Color(255, 255, 0));
        t2_3.setText("0");

        k3_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k3_4.setForeground(new java.awt.Color(255, 255, 0));
        k3_4.setText("0");

        t3_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3_4.setForeground(new java.awt.Color(255, 255, 0));
        t3_4.setText("0");

        k4_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        k4_5.setForeground(new java.awt.Color(255, 255, 0));
        k4_5.setText("0");

        t4_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4_5.setForeground(new java.awt.Color(255, 255, 0));
        t4_5.setText("0");

        txtkm5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm5.setForeground(new java.awt.Color(255, 255, 0));
        txtkm5.setText("0 km");

        txtt5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt5.setForeground(new java.awt.Color(255, 255, 0));
        txtt5.setText("0 hr");

        txtkm6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm6.setForeground(new java.awt.Color(255, 255, 0));
        txtkm6.setText("x km");

        txtt6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt6.setForeground(new java.awt.Color(255, 255, 0));
        txtt6.setText("x hr");

        txtt7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt7.setForeground(new java.awt.Color(255, 255, 0));
        txtt7.setText("x hr");

        txtkm7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm7.setForeground(new java.awt.Color(255, 255, 0));
        txtkm7.setText("x km");

        txtt8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtt8.setForeground(new java.awt.Color(255, 255, 0));
        txtt8.setText("x hr");

        txtkm8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtkm8.setForeground(new java.awt.Color(255, 255, 0));
        txtkm8.setText("x km");

        btVoltarTelaInicioMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaInicioMRUVTorricelli.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaInicioMRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/inicio.png"))); // NOI18N
        btVoltarTelaInicioMRUVTorricelli.setText("Início");
        btVoltarTelaInicioMRUVTorricelli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaInicioMRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaInicioMRUVTorricelliActionPerformed(evt);
            }
        });

        btLimparTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btLimparTelaMRUVTorricelli.setForeground(new java.awt.Color(0, 0, 255));
        btLimparTelaMRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/limpar.png"))); // NOI18N
        btLimparTelaMRUVTorricelli.setText("Limpar");
        btLimparTelaMRUVTorricelli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLimparTelaMRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparTelaMRUVTorricelliActionPerformed(evt);
            }
        });

        btVoltarTelaMRUVTorricelli.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaMRUVTorricelli.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaMRUVTorricelli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaMRUVTorricelli.setText("Voltar");
        btVoltarTelaMRUVTorricelli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaMRUVTorricelli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaMRUVTorricelliActionPerformed(evt);
            }
        });

        borda1TelaMRUVTorricelli.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        borda2TelaMRUVTorricelli.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 0), null));

        javax.swing.GroupLayout telaMRUVEquacaoDeTorricelliLayout = new javax.swing.GroupLayout(telaMRUVEquacaoDeTorricelli);
        telaMRUVEquacaoDeTorricelli.setLayout(telaMRUVEquacaoDeTorricelliLayout);
        telaMRUVEquacaoDeTorricelliLayout.setHorizontalGroup(
            telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtOQueVoceDesejaCalcularTelaMRUVTorricelli)
                .addGap(19, 19, 19)
                .addComponent(selecionarTipoDeCalculoTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addComponent(borda1TelaMRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(borda2TelaMRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d1_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c1_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a1_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b4_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c4_MRUVTorricelli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d4_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(d7_MRUVTorricelli)
                                .addComponent(a7_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c7_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(b7_MRUVTorricelli))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d10_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b10_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a10_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c10_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d9_MRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(d11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(visualizarCalculoTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(velocidade_2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(505, 505, 505)
                        .addComponent(k3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carrinho_2)
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(k2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(k1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(txtt7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(txtt8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(txtt6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(txtkm7))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(k4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(txtkm8))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(t3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtkm5))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(t1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(t2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(txtkm6))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(btPausa_2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(930, 930, 930)
                        .addComponent(t4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(btContinua_2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFormulaVTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormulaVoTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFormulaATelaMRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(txtFormulaDeltaSTelaMRUVTorricelli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btVoltarTelaMRUVTorricelli)
                        .addGap(63, 63, 63)
                        .addComponent(btLimparTelaMRUVTorricelli)
                        .addGap(53, 53, 53)
                        .addComponent(btVoltarTelaInicioMRUVTorricelli)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(txtTopoTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(417, 417, 417))
        );
        telaMRUVEquacaoDeTorricelliLayout.setVerticalGroup(
            telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addComponent(txtTopoTorricelli)
                .addGap(22, 22, 22)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOQueVoceDesejaCalcularTelaMRUVTorricelli)
                    .addComponent(selecionarTipoDeCalculoTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormulaVoTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaVTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaDeltaSTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormulaATelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borda1TelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1_MRUVTorricelli)
                    .addComponent(d1_MRUVTorricelli)
                    .addComponent(c1_MRUVTorricelli)
                    .addComponent(a1_MRUVTorricelli)
                    .addComponent(c2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4_MRUVTorricelli)
                    .addComponent(d5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d4_MRUVTorricelli)
                    .addComponent(c4_MRUVTorricelli)
                    .addComponent(b5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4_MRUVTorricelli)
                    .addComponent(b6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7_MRUVTorricelli)
                    .addComponent(b7_MRUVTorricelli)
                    .addComponent(d7_MRUVTorricelli)
                    .addComponent(a7_MRUVTorricelli)
                    .addComponent(c8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d10_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d8_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d9_MRUVTorricelli)
                    .addComponent(b10_MRUVTorricelli)
                    .addComponent(a10_MRUVTorricelli)
                    .addComponent(c11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d11_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a13_MRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visualizarCalculoTelaMRUVTorricelli)
                    .addComponent(c10_MRUVTorricelli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(borda2TelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(velocidade_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(k3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(carrinho_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(k2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(k1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(txtt6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(txtkm7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(k4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(t3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(t1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(t2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(txtkm6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btPausa_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(t4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btContinua_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(estrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltarTelaInicioMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(telaMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btLimparTelaMRUVTorricelli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btVoltarTelaMRUVTorricelli, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        painelCamadas.add(telaMRUVEquacaoDeTorricelli);
        telaMRUVEquacaoDeTorricelli.setBounds(0, 0, 1000, 600);

        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli.setPreferredSize(new java.awt.Dimension(1000, 600));

        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.setForeground(new java.awt.Color(255, 0, 0));
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.setText("Voltar");
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaExplicacaoFormulaMovimentoUniforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaExplicacaoFormulaMovimentoUniforme1ActionPerformed(evt);
            }
        });

        textoExplicacaoCalculoMovimentoUniforme7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoMovimentoUniforme7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textoExplicacaoCalculoMovimentoUniforme9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoExplicacaoCalculoMovimentoUniforme13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoExplicacaoCalculoMovimentoUniforme13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textoExplicacaoCalculoMovimentoUniforme13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoCalculosTelaMovimentoUniforme1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        textoCalculosTelaMovimentoUniforme1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoCalculosTelaMovimentoUniforme1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout = new javax.swing.GroupLayout(telaDemonstracaoCalculoMRUVEquacaoDeTorricelli);
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli.setLayout(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout);
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.setHorizontalGroup(
            telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme8, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                                .addComponent(textoExplicacaoCalculoMovimentoUniforme9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoExplicacaoCalculoMovimentoUniforme12, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoExplicacaoCalculoMovimentoUniforme10, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme11, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme13, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(textoCalculosTelaMovimentoUniforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(btVoltarTelaExplicacaoFormulaMovimentoUniforme1))
        );
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.setVerticalGroup(
            telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoExplicacaoCalculoMovimentoUniforme8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(telaDemonstracaoCalculoMRUVEquacaoDeTorricelliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoExplicacaoCalculoMovimentoUniforme11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(textoExplicacaoCalculoMovimentoUniforme13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(textoCalculosTelaMovimentoUniforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btVoltarTelaExplicacaoFormulaMovimentoUniforme1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelCamadas.add(telaDemonstracaoCalculoMRUVEquacaoDeTorricelli);
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli.setBounds(10, 1, 1000, 600);

        telaAvaliacao.setPreferredSize(new java.awt.Dimension(1000, 600));

        telaAvaliaxaoTxt11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaAvaliaxaoTxt11.setForeground(new java.awt.Color(0, 153, 0));
        telaAvaliaxaoTxt11.setText("Avaliação do Aplicativo");

        telaAvaliaxaoTxt12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaAvaliaxaoTxt12.setText("Em uma escala de 1 a 10, qual nota você daria para o Aplicativo?");

        grupoBotoesTelaAvaliacao.add(bt1);
        bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt1.setText("1");

        grupoBotoesTelaAvaliacao.add(bt2);
        bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt2.setText("2");

        grupoBotoesTelaAvaliacao.add(bt3);
        bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt3.setText("3");

        grupoBotoesTelaAvaliacao.add(bt4);
        bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt4.setText("4");

        grupoBotoesTelaAvaliacao.add(bt6);
        bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt6.setText("6");

        grupoBotoesTelaAvaliacao.add(bt5);
        bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt5.setText("5");

        grupoBotoesTelaAvaliacao.add(bt8);
        bt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt8.setText("8");

        grupoBotoesTelaAvaliacao.add(bt7);
        bt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt7.setText("7");

        grupoBotoesTelaAvaliacao.add(bt9);
        bt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt9.setText("9");

        grupoBotoesTelaAvaliacao.add(bt10);
        bt10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt10.setText("10");

        telaAvaliaxaoTxt13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        telaAvaliaxaoTxt13.setText("Fale um pouco mais! ( Opcional )");

        telaAvaliacaoJComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaAvaliacaoJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comentário", "Sugestão", "Crítica" }));

        telaAvaliacaoAreaTexto.setColumns(20);
        telaAvaliacaoAreaTexto.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        telaAvaliacaoAreaTexto.setRows(5);
        campoAreaTexto.setViewportView(telaAvaliacaoAreaTexto);

        telaAvaliaxaoBtenviar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        telaAvaliaxaoBtenviar.setForeground(new java.awt.Color(0, 0, 255));
        telaAvaliaxaoBtenviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/envia.png"))); // NOI18N
        telaAvaliaxaoBtenviar.setText("Enviar");
        telaAvaliaxaoBtenviar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaAvaliaxaoBtVoltar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        telaAvaliaxaoBtVoltar.setForeground(new java.awt.Color(0, 0, 255));
        telaAvaliaxaoBtVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        telaAvaliaxaoBtVoltar.setText("Voltar");
        telaAvaliaxaoBtVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaAvaliaxaoBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaAvaliaxaoBtVoltarActionPerformed(evt);
            }
        });

        borda02.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        iconComent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/comentario.png"))); // NOI18N

        javax.swing.GroupLayout telaAvaliacaoLayout = new javax.swing.GroupLayout(telaAvaliacao);
        telaAvaliacao.setLayout(telaAvaliacaoLayout);
        telaAvaliacaoLayout.setHorizontalGroup(
            telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(telaAvaliaxaoTxt11))
                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(bt1)
                                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telaAvaliaxaoTxt12)
                                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(bt2)
                                        .addGap(32, 32, 32)
                                        .addComponent(bt3)
                                        .addGap(35, 35, 35)
                                        .addComponent(bt4)
                                        .addGap(26, 26, 26)
                                        .addComponent(bt5)
                                        .addGap(27, 27, 27)
                                        .addComponent(bt6)
                                        .addGap(36, 36, 36)
                                        .addComponent(bt7)
                                        .addGap(36, 36, 36)
                                        .addComponent(bt8)
                                        .addGap(33, 33, 33)
                                        .addComponent(bt9)
                                        .addGap(32, 32, 32)
                                        .addComponent(bt10))))
                            .addComponent(borda02, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(telaAvaliaxaoTxt13))
                                .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(iconComent)
                                    .addGap(32, 32, 32)
                                    .addComponent(telaAvaliacaoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(campoAreaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                .addComponent(telaAvaliaxaoBtenviar)
                                .addGap(18, 18, 18)
                                .addComponent(telaAvaliaxaoBtVoltar)))))
                .addContainerGap())
        );
        telaAvaliacaoLayout.setVerticalGroup(
            telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(telaAvaliaxaoTxt11)
                .addGap(38, 38, 38)
                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(bt1))
                    .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(telaAvaliaxaoTxt12)
                        .addGap(31, 31, 31)
                        .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaAvaliacaoLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt2)
                                    .addComponent(bt3)
                                    .addComponent(bt4)
                                    .addComponent(bt5)
                                    .addComponent(bt6)
                                    .addComponent(bt7)
                                    .addComponent(bt8)
                                    .addComponent(bt10)))))
                    .addComponent(borda02, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(telaAvaliaxaoTxt13)
                .addGap(10, 10, 10)
                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telaAvaliacaoJComboBox)
                    .addComponent(iconComent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(campoAreaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(telaAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaAvaliaxaoBtenviar)
                    .addComponent(telaAvaliaxaoBtVoltar))
                .addContainerGap())
        );

        painelCamadas.add(telaAvaliacao);
        telaAvaliacao.setBounds(0, 0, 1000, 601);

        telaAdministrador.setPreferredSize(new java.awt.Dimension(1000, 600));

        telaAdmTxt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaAdmTxt1.setForeground(new java.awt.Color(0, 153, 0));
        telaAdmTxt1.setText("Painel Administrativo");

        telaAdmGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/graficoNotas.png"))); // NOI18N

        btVoltarTelaAdm.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btVoltarTelaAdm.setForeground(new java.awt.Color(0, 0, 255));
        btVoltarTelaAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        btVoltarTelaAdm.setText("Voltar");
        btVoltarTelaAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVoltarTelaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarTelaAdmActionPerformed(evt);
            }
        });

        telaAdmTxt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaAdmTxt2.setText("Relatório de Avaliações");

        javax.swing.GroupLayout telaAdministradorLayout = new javax.swing.GroupLayout(telaAdministrador);
        telaAdministrador.setLayout(telaAdministradorLayout);
        telaAdministradorLayout.setHorizontalGroup(
            telaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAdministradorLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(telaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradorLayout.createSequentialGroup()
                        .addComponent(telaAdmGrafico)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradorLayout.createSequentialGroup()
                        .addComponent(telaAdmTxt1)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaAdministradorLayout.createSequentialGroup()
                        .addGroup(telaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telaAdmTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btVoltarTelaAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(384, 384, 384))))
        );
        telaAdministradorLayout.setVerticalGroup(
            telaAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaAdministradorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(telaAdmTxt1)
                .addGap(18, 18, 18)
                .addComponent(telaAdmGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telaAdmTxt2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btVoltarTelaAdm)
                .addContainerGap())
        );

        painelCamadas.add(telaAdministrador);
        telaAdministrador.setBounds(0, 0, 1000, 601);

        telaComentariosSugestoesCriticas.setPreferredSize(new java.awt.Dimension(1000, 600));

        telaComentariosTxt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaComentariosTxt1.setForeground(new java.awt.Color(0, 153, 0));
        telaComentariosTxt1.setText("Comentários, Sugestões e Críticas");

        telaComentariosTxt1JComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaComentariosTxt1JComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comentários", "Sugestões", "Críticas" }));

        telaComentariosAreaTexto.setColumns(20);
        telaComentariosAreaTexto.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        telaComentariosAreaTexto.setRows(5);
        telaComentariosAreaTexto01.setViewportView(telaComentariosAreaTexto);

        telaComentariosBtImprimir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaComentariosBtImprimir.setForeground(new java.awt.Color(0, 0, 255));
        telaComentariosBtImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/imprimir.png"))); // NOI18N
        telaComentariosBtImprimir.setText("Imprimir");
        telaComentariosBtImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaComentariosBtLimpar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaComentariosBtLimpar.setForeground(new java.awt.Color(0, 0, 255));
        telaComentariosBtLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/limpar.png"))); // NOI18N
        telaComentariosBtLimpar.setText("Limpar Tela");
        telaComentariosBtLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaComentariosBtVoltar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaComentariosBtVoltar.setForeground(new java.awt.Color(0, 0, 255));
        telaComentariosBtVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        telaComentariosBtVoltar.setText("Voltar");
        telaComentariosBtVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaComentariosBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaComentariosBtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaComentariosSugestoesCriticasLayout = new javax.swing.GroupLayout(telaComentariosSugestoesCriticas);
        telaComentariosSugestoesCriticas.setLayout(telaComentariosSugestoesCriticasLayout);
        telaComentariosSugestoesCriticasLayout.setHorizontalGroup(
            telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaComentariosSugestoesCriticasLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaComentariosSugestoesCriticasLayout.createSequentialGroup()
                        .addComponent(telaComentariosTxt1JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telaComentariosBtImprimir)
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaComentariosSugestoesCriticasLayout.createSequentialGroup()
                        .addComponent(telaComentariosBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(telaComentariosBtLimpar)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaComentariosSugestoesCriticasLayout.createSequentialGroup()
                        .addGroup(telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telaComentariosAreaTexto01)
                            .addComponent(telaComentariosTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(184, 184, 184))))
        );
        telaComentariosSugestoesCriticasLayout.setVerticalGroup(
            telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaComentariosSugestoesCriticasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(telaComentariosTxt1)
                .addGap(29, 29, 29)
                .addGroup(telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telaComentariosBtImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaComentariosTxt1JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(telaComentariosAreaTexto01, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(telaComentariosSugestoesCriticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaComentariosBtLimpar)
                    .addComponent(telaComentariosBtVoltar))
                .addContainerGap())
        );

        painelCamadas.add(telaComentariosSugestoesCriticas);
        telaComentariosSugestoesCriticas.setBounds(0, 0, 1000, 601);

        telaUsuarios.setPreferredSize(new java.awt.Dimension(1000, 600));

        telaUsuarioTxt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        telaUsuarioTxt1.setForeground(new java.awt.Color(0, 153, 0));
        telaUsuarioTxt1.setText("Buscar Usuários");

        telaUsuarioBtImprimirTudo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaUsuarioBtImprimirTudo.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtImprimirTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/imprimir.png"))); // NOI18N
        telaUsuarioBtImprimirTudo.setText("Print All");
        telaUsuarioBtImprimirTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaUsuarioCampotexto1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        telaUsuarioTxt2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        telaUsuarioTxt2.setText("Usuário:");

        telaUsuarioBtBuscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        telaUsuarioBtBuscar.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/buscar.png"))); // NOI18N
        telaUsuarioBtBuscar.setText("Buscar");
        telaUsuarioBtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaUsuarioTabela.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        telaUsuarioTabela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        telaUsuarioTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email", "Curso", "Tipo de Usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(telaUsuarioTabela);
        if (telaUsuarioTabela.getColumnModel().getColumnCount() > 0) {
            telaUsuarioTabela.getColumnModel().getColumn(0).setResizable(false);
            telaUsuarioTabela.getColumnModel().getColumn(1).setResizable(false);
            telaUsuarioTabela.getColumnModel().getColumn(2).setResizable(false);
            telaUsuarioTabela.getColumnModel().getColumn(3).setResizable(false);
        }

        telaUsuarioBtVoltar.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        telaUsuarioBtVoltar.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/voltar.png"))); // NOI18N
        telaUsuarioBtVoltar.setText("Voltar");
        telaUsuarioBtVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        telaUsuarioBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaUsuarioBtVoltarActionPerformed(evt);
            }
        });

        telaUsuarioBtRemoverSelecionado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaUsuarioBtRemoverSelecionado.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtRemoverSelecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/remove2.png"))); // NOI18N
        telaUsuarioBtRemoverSelecionado.setText("Remove Selected");
        telaUsuarioBtRemoverSelecionado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaUsuarioBtRemoverTudo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telaUsuarioBtRemoverTudo.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtRemoverTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/remove2.png"))); // NOI18N
        telaUsuarioBtRemoverTudo.setText("Remove All");
        telaUsuarioBtRemoverTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        telaUsuarioBtLimparTela.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        telaUsuarioBtLimparTela.setForeground(new java.awt.Color(0, 0, 255));
        telaUsuarioBtLimparTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wesley/easyfisica/imagensAuxiliares/limpar.png"))); // NOI18N
        telaUsuarioBtLimparTela.setText("Limpar Tela");
        telaUsuarioBtLimparTela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout telaUsuariosLayout = new javax.swing.GroupLayout(telaUsuarios);
        telaUsuarios.setLayout(telaUsuariosLayout);
        telaUsuariosLayout.setHorizontalGroup(
            telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaUsuarioTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaUsuarioTxt2)
                .addGap(18, 18, 18)
                .addComponent(telaUsuarioCampotexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(telaUsuarioBtBuscar)
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUsuariosLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(telaUsuariosLayout.createSequentialGroup()
                        .addComponent(telaUsuarioBtImprimirTudo)
                        .addGap(86, 86, 86)
                        .addComponent(telaUsuarioBtRemoverSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telaUsuarioBtRemoverTudo))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telaUsuarioBtVoltar)
                .addGap(26, 26, 26)
                .addComponent(telaUsuarioBtLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        telaUsuariosLayout.setVerticalGroup(
            telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaUsuariosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(telaUsuarioTxt1)
                .addGap(27, 27, 27)
                .addGroup(telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaUsuarioCampotexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaUsuarioTxt2)
                    .addComponent(telaUsuarioBtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telaUsuarioBtImprimirTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaUsuarioBtRemoverSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaUsuarioBtRemoverTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(telaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telaUsuarioBtLimparTela)
                    .addComponent(telaUsuarioBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        painelCamadas.add(telaUsuarios);
        telaUsuarios.setBounds(0, 0, 1000, 601);

        getContentPane().add(painelCamadas, new java.awt.GridBagConstraints());

        menuAdm.setText("User Adm");

        menuPainelAdm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPainelAdm.setText("Painel Administrativo");
        menuPainelAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPainelAdmActionPerformed(evt);
            }
        });
        menuAdm.add(menuPainelAdm);

        menuAvaliacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAvaliacoes.setText("Avaliações");
        menuAvaliacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAvaliacoesActionPerformed(evt);
            }
        });
        menuAdm.add(menuAvaliacoes);

        menuUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuUsuario.setText("Usuários");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        menuAdm.add(menuUsuario);

        barraMenus.add(menuAdm);

        menuAvaliacao.setText("Avaliação");

        menuAvaliar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuAvaliar.setText("Realizar Avaliação");
        menuAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAvaliarActionPerformed(evt);
            }
        });
        menuAvaliacao.add(menuAvaliar);

        barraMenus.add(menuAvaliacao);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFisica1TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFisica1TelaInicialActionPerformed
       
        escondePaineis();
        telaLogin.setVisible(true);
        telaInicial.setVisible(false);
        
    }//GEN-LAST:event_btFisica1TelaInicialActionPerformed

    private void btVoltarTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaMecanicaActionPerformed
        
        
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        escondePaineis();
        telaInicial.setVisible(true);
        admEntrou = false;
        
    }//GEN-LAST:event_btVoltarTelaMecanicaActionPerformed

    private void btCinematicaTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCinematicaTelaMecanicaActionPerformed
        
        escondePaineis();
        telaCinematica.setVisible(true);
        telaInicial.setVisible(false);
        
    }//GEN-LAST:event_btCinematicaTelaMecanicaActionPerformed

    private void btMovimentoUniformeVariadoTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoUniformeVariadoTelaCinematicaActionPerformed
        escondePaineis();
        telaMRUV.setVisible(true);
    }//GEN-LAST:event_btMovimentoUniformeVariadoTelaCinematicaActionPerformed

    private void btMovimentoVerticalTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoVerticalTelaCinematicaActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção - Selecione Velocidade Média", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMovimentoVerticalTelaCinematicaActionPerformed

    private void btMovimentoUniformeTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoUniformeTelaCinematicaActionPerformed
      
        escondePaineis();
        k1_1.setText("");
        t1_1.setText("");
        k2_2.setText("");
        t2_2.setText("");
        k3_3.setText("");
        t3_3.setText("");
        k4_4.setText("");
        t4_4.setText("");
        velocidade_1.setText("");        
        telaMovimentoUniforme.setVisible(true);
        telaInicial.setVisible(false);
        telaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
         telaDemonstracaoCalculoMovimentoUniforme.setVisible(false);
        carrinho_1.setLocation(0, 446);
        velocidade_1.setLocation(0, 426);
        a_2.setText("");
        a_5.setText("");
        a_8.setText("");
        a_13.setText("");
        a_3.setSelectedItem("Km");
        a_6.setSelectedItem("Km/h");
        a_9.setSelectedItem("Hr");
        a_11.setSelectedItem("Km");
       selecionarTipoDeCalculoTelaMovimentoUniforme.setSelectedItem("Espaço Final");
       gerenciadorVisualizacaoDeDadosParaCalculosTelaVelocidadeMedia();
        
        
    }//GEN-LAST:event_btMovimentoUniformeTelaCinematicaActionPerformed
  
    private void btVelocidadeMediaTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVelocidadeMediaTelaCinematicaActionPerformed
        desativaBotaoPausaEContinua();
        escondePaineis();
        km1.setText("");
        t1.setText("");
        km2.setText("");
        t2.setText("");
        km3.setText("");
        t3.setText("");
        km4.setText("");
        t4.setText("");
        velocidadeTelaVelocidadeMedia.setText("");
        telaVelocidadeMedia.setVisible(true);
        telaInicial.setVisible(false);
        telaDemonstracaoCalculoVelocidadeMedia.setVisible(false);
        telaDemonstracaoCalculoMovimentoUniforme.setVisible(false);
        carrinhoTelaVelocidadeMedia.setLocation(0, 446);
        velocidadeTelaVelocidadeMedia.setLocation(0, 426);
        a2.setText("");
        a5.setText("");
        a10.setText("");
        a3.setSelectedItem("Km");
        a6.setSelectedItem("Hr");
        a8.setSelectedItem("Km/h");
        selecionarTipodeCalculoTelaVelocidadeMedia.setSelectedItem("Velocidade Média");
       gerenciadorVisualizacaoDeDadosParaCalculosTelaVelocidadeMedia();
      
                
    }//GEN-LAST:event_btVelocidadeMediaTelaCinematicaActionPerformed

    private void btMovimentoCircularTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoCircularTelaCinematicaActionPerformed
         JOptionPane.showMessageDialog(null, "Em Construção - Selecione Velocidade Média", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMovimentoCircularTelaCinematicaActionPerformed

    private void btMovimentoObliquoTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimentoObliquoTelaCinematicaActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção - Selecione Velocidade Média", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMovimentoObliquoTelaCinematicaActionPerformed

    
    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        txtAux1.setText("");
        txtAux2.setText("");
        txtAux3.setText("");
        txtAux4.setText("");
        txtAux5.setText("");
        txtAux6.setText("");
        txtAux7.setText("");
        txtAux8.setText("");
        
        ativaBotaoPausaEContinua();
         
        
        if(a3.getSelectedItem().equals("Km") && a6.getSelectedItem().equals("Hr") && a8.getSelectedItem().equals("Km/h") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">Km/h</font>, ΔS em <font color=\"red\">Km</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("Km") && a6.getSelectedItem().equals("Hr") && a8.getSelectedItem().equals("M/s") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">M/s</font>, ΔS em <font color=\"red\">Km</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("Km") && a6.getSelectedItem().equals("Min") && a8.getSelectedItem().equals("Km/h") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">Km/h</font>, ΔS em <font color=\"red\">Km</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("Km") && a6.getSelectedItem().equals("Min") && a8.getSelectedItem().equals("M/s") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">m/s</font>, ΔS em <font color=\"red\">Km</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("M") && a6.getSelectedItem().equals("Hr") && a8.getSelectedItem().equals("Km/h") ){
       
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">Km/h</font>, ΔS em <font color=\"red\">M</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("M") && a6.getSelectedItem().equals("Hr") && a8.getSelectedItem().equals("M/s") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">m/s</font>, ΔS em <font color=\"red\">M</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(a3.getSelectedItem().equals("M") && a6.getSelectedItem().equals("Min") && a8.getSelectedItem().equals("Km/h") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">Km/h</font>, ΔS em <font color=\"red\">M</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        }else{
            
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆V = ∆S / ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆V em <font color=\"green\">m/s</font>, ΔS em <font color=\"red\">M</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
            
        }
        
        VelocidadeMediaTelaVelocidadeMedia dadosDosCamposVelocidadeMedia = new VelocidadeMediaTelaVelocidadeMedia(a2, a5);
        
        try {
            controleVelocidadeMedia.calculoVelocidadeMedia(dadosDosCamposVelocidadeMedia, a3,
            a6, a8,
            a10, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);
            
            telaDemonstracaoCalculoVelocidadeMedia.setVisible(false);          
            
            controleVelocidadeMedia.informacoesParaMovimentarCarrinho(dadosDosCamposVelocidadeMedia, a2, a5, a3,
            a6, a8 , a10,
            velocidadeTelaVelocidadeMedia, km1 ,  t1, km2 ,  t2,  km3 ,  t3, km4 , t4 , carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);
            
            
            if(!admEntrou){            
            
                if(contador == 5){

                    JOptionPane.showMessageDialog(null, "Você Atingiu o Limite Máximo de Cálculos na Versão Teste! Para Continuar Cadastre-se e Faça uma Avaliação !");

                    escondePaineis();
                    telaAvaliacao.setVisible(true);

                    contador = 0;

                }

                contador++;
            
            }
         
        } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        
           
    }//GEN-LAST:event_a9ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a10ActionPerformed
       
    private void btPausaTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaTelaVelocidadeMediaActionPerformed
        
              
        if(selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Velocidade Média")){           
           
            try {
               
                controleVelocidadeMedia.pararCarrinho(); 
                                     
            } catch (InterruptedException ex) {} 
        }else if (selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Espaço Percorrido")){
            
          try {
            controleEspacoPercorrido.pararCarrinho();          
            
        } catch (InterruptedException ex) {}
        
        }else{
            try {
                controleTempoGasto.pararCarrinho();          

            } catch (InterruptedException ex) {} 
        }
        
        
    }//GEN-LAST:event_btPausaTelaVelocidadeMediaActionPerformed

    private void btContinuaTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinuaTelaVelocidadeMediaActionPerformed
         

        if(selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Velocidade Média")){           
         VelocidadeMediaTelaVelocidadeMedia dadosDosCamposVelocidadeMedia = new VelocidadeMediaTelaVelocidadeMedia(a2, a5);

                try {
                controleVelocidadeMedia.calculoVelocidadeMedia(dadosDosCamposVelocidadeMedia, a3,
                a6, a8,
                a10, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);

                controleVelocidadeMedia.informacoesParaMovimentarCarrinho(dadosDosCamposVelocidadeMedia,a2, a5, a3,
                a6,  a8 , a10,
                velocidadeTelaVelocidadeMedia, km1 , t1, km2 , t2, km3 , t3, km4 , t4 , carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);

                } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }else if (selecionarTipodeCalculoTelaVelocidadeMedia.getSelectedItem().equals("Espaço Percorrido")){
            

             EspacoPercorridoTelaVelocidadeMedia dadosDosCamposEspacoPercorrido = new EspacoPercorridoTelaVelocidadeMedia(b2, b5);

             try {

             controleEspacoPercorrido.calculoEspacoPercorrido(dadosDosCamposEspacoPercorrido, b3,
             b6, b8,
             b10, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);

             controleEspacoPercorrido.informacoesParaMovimentarCarrinho(dadosDosCamposEspacoPercorrido,b2, b5, b3,
             b6,  b8 , b10,
             velocidadeTelaVelocidadeMedia, km1 , t1, km2 , t2, km3 , t3, km4 , t4 , carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);

             } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
             } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
             }  
        }else{
    
            TempoGastoTelaVelocidadeMedia dadosDosCamposTempoGasto = new TempoGastoTelaVelocidadeMedia(c2, c5);

            try {

                controleTempoGasto.calculoTempoGasto(dadosDosCamposTempoGasto, c3, c6, c8, c10, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);

                controleTempoGasto.informacoesParaMovimentarCarrinho(dadosDosCamposTempoGasto, c2, c5, c3,
                        c6, c8, c10,
                        velocidadeTelaVelocidadeMedia, km1, t1, km2, t2, km3, t3, km4, t4, carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);

            } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        
        }
        
       
       
    }//GEN-LAST:event_btContinuaTelaVelocidadeMediaActionPerformed

    private void btFisica2TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFisica2TelaInicialActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção - Selecione Física I", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btFisica2TelaInicialActionPerformed

    private void btFisica3TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFisica3TelaInicialActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção - Selecione Física I", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btFisica3TelaInicialActionPerformed

    private void btDinamicaTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDinamicaTelaMecanicaActionPerformed
         JOptionPane.showMessageDialog(null, "Em Construção -Selecione Cinemática", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btDinamicaTelaMecanicaActionPerformed

    private void btEstaticaTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstaticaTelaMecanicaActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção -Selecione Cinemática", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btEstaticaTelaMecanicaActionPerformed

    private void btHidrostaticaTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHidrostaticaTelaMecanicaActionPerformed
       JOptionPane.showMessageDialog(null, "Em Construção -Selecione Cinemática", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btHidrostaticaTelaMecanicaActionPerformed

    private void btGravUniversalTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravUniversalTelaMecanicaActionPerformed
       JOptionPane.showMessageDialog(null, "Em Construção -Selecione Cinemática", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btGravUniversalTelaMecanicaActionPerformed

    private void btVoltarTelaAnteriorCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaAnteriorCinematicaActionPerformed
            
        
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        
            escondePaineis();
            telaMecanica.setVisible(true);
    }//GEN-LAST:event_btVoltarTelaAnteriorCinematicaActionPerformed

    private void btVoltarTelaInicioCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicioCinematicaActionPerformed
        
        voltaATelaInicial();
    }//GEN-LAST:event_btVoltarTelaInicioCinematicaActionPerformed

    
    
    private void selecionarTipodeCalculoTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTipodeCalculoTelaVelocidadeMediaActionPerformed
        gerenciadorVisualizacaoDeDadosParaCalculosTelaVelocidadeMedia();        
            
    }//GEN-LAST:event_selecionarTipodeCalculoTelaVelocidadeMediaActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
    
        txtAux1.setText("");
        txtAux2.setText("");
        txtAux3.setText("");
        txtAux4.setText("");
        txtAux5.setText("");
        txtAux6.setText("");
        txtAux7.setText("");
        txtAux8.setText("");
        
        ativaBotaoPausaEContinua();
        
        if(b3.getSelectedItem().equals("Km/h") && b6.getSelectedItem().equals("Hr") && b8.getSelectedItem().equals("Km") ){

            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">Km</font>, ΔV em <font color=\"red\">Km/h</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(b3.getSelectedItem().equals("Km/h") && b6.getSelectedItem().equals("Hr") && b8.getSelectedItem().equals("M") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">M</font>, ΔV em <font color=\"red\">Km/h</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        } else if(b3.getSelectedItem().equals("Km/h") && b6.getSelectedItem().equals("Min") && b8.getSelectedItem().equals("Km") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">Km</font>, ΔV em <font color=\"red\">Km/h</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        }  else if(b3.getSelectedItem().equals("Km/h") && b6.getSelectedItem().equals("Min") && b8.getSelectedItem().equals("M") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">M</font>, ΔV em <font color=\"red\">Km/h</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        } else if(b3.getSelectedItem().equals("M/s") && b6.getSelectedItem().equals("Hr") && b8.getSelectedItem().equals("Km") ){
        
          
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">Km</font>, ΔV em <font color=\"red\">m/s</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        }else if(b3.getSelectedItem().equals("M/s") && b6.getSelectedItem().equals("Hr") && b8.getSelectedItem().equals("M") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">M</font>, ΔV em <font color=\"red\">m/s</font> e ΔT em <font color=\"blue\">Hr</font>, Temos:</html>");
        } else if(b3.getSelectedItem().equals("M/s") && b6.getSelectedItem().equals("Min") && b8.getSelectedItem().equals("Km") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">Km</font>, ΔV em <font color=\"red\">m/s</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        }  else{
          
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆S = ∆V * ∆t");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔT: Tempo Gasto");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆S em <font color=\"green\">M</font>, ΔV em <font color=\"red\">m/s</font> e ΔT em <font color=\"blue\">Min</font>, Temos:</html>");
        } 
        
                
        EspacoPercorridoTelaVelocidadeMedia dadosDosCamposEspacoPercorrido = new EspacoPercorridoTelaVelocidadeMedia(b2, b5);
        
        try {
            controleEspacoPercorrido.calculoEspacoPercorrido(dadosDosCamposEspacoPercorrido, b3, b6, b8, b10,textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);
            
            controleEspacoPercorrido.informacoesParaMovimentarCarrinho(dadosDosCamposEspacoPercorrido, b2, b5, b3,
            b6, b8 , b10,
            velocidadeTelaVelocidadeMedia, km1 ,  t1, km2 ,  t2,  km3 ,  t3, km4 , t4 , carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);
         
        } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
      
        txtAux1.setText("");
        txtAux2.setText("");
        txtAux3.setText("");
        txtAux4.setText("");
        txtAux5.setText("");
        txtAux6.setText("");
        txtAux7.setText("");
        txtAux8.setText("");
        
        ativaBotaoPausaEContinua();
        
        if(c3.getSelectedItem().equals("Km/h") && c6.getSelectedItem().equals("Km") && c8.getSelectedItem().equals("Hr") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Hr</font>, ΔS em <font color=\"red\">Km</font> e ΔV em <font color=\"blue\">Km/h</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("Km/h") && c6.getSelectedItem().equals("Km") && c8.getSelectedItem().equals("Min") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Min</font>, ΔS em <font color=\"red\">Km</font> e ΔV em <font color=\"blue\">Km/h</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("Km/h") && c6.getSelectedItem().equals("M") && c8.getSelectedItem().equals("Hr") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Hr</font>, ΔS em <font color=\"red\">M</font> e ΔV em <font color=\"blue\">Km/h</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("Km/h") && c6.getSelectedItem().equals("M") && c8.getSelectedItem().equals("Min") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Min</font>, ΔS em <font color=\"red\">M</font> e ΔV em <font color=\"blue\">Km/h</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("M/s") && c6.getSelectedItem().equals("Km") && c8.getSelectedItem().equals("Hr") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Hr</font>, ΔS em <font color=\"red\">Km</font> e ΔV em <font color=\"blue\">m/s</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("M/s") && c6.getSelectedItem().equals("Km") && c8.getSelectedItem().equals("Min") ){
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Min</font>, ΔS em <font color=\"red\">Km</font> e ΔV em <font color=\"blue\">m/sh</font>, Temos:</html>");
        }else if(c3.getSelectedItem().equals("M/s") && c6.getSelectedItem().equals("M") && c8.getSelectedItem().equals("Hr") ){
      
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Hr</font>, ΔS em <font color=\"red\">M</font> e ΔV em <font color=\"blue\">m/s</font>, Temos:</html>");
        }else{
        
            textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("∆T = ∆S / ∆V");        
            textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔS: Espaço Percorrido");
            textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("ΔV: Velocidade Média");
            textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("<html>Para ∆T em <font color=\"green\">Min</font>, ΔS em <font color=\"red\">M</font> e ΔV em <font color=\"blue\">m/s</font>, Temos:</html>");
        }
           
        TempoGastoTelaVelocidadeMedia dadosDosCamposTempoGasto = new TempoGastoTelaVelocidadeMedia(c2, c5);
        
        try {           
            
            controleTempoGasto.calculoTempoGasto(dadosDosCamposTempoGasto,c3, c6, c8, c10, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia);
            
            controleTempoGasto.informacoesParaMovimentarCarrinho(dadosDosCamposTempoGasto, c2, c5, c3,
            c6, c8 , c10,
            velocidadeTelaVelocidadeMedia, km1 ,  t1, km2 ,  t2,  km3 ,  t3, km4 , t4 , carrinhoTelaVelocidadeMedia, textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia, btLimparTelaVelocidadeMedia);
         
        } catch (VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        
    }//GEN-LAST:event_c9ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c10ActionPerformed

    private void btInicioTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioTelaVelocidadeMediaActionPerformed
        admEntrou = false;
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        escondePaineis();
        telaInicial.setVisible(true);  
        textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setText("");   
       textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("");
    }//GEN-LAST:event_btInicioTelaVelocidadeMediaActionPerformed

    private void btLimparTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelaVelocidadeMediaActionPerformed
        txtAux1.setText("0 km");
        txtAux2.setText("0 hr");
        txtAux3.setText("x hr");
        txtAux4.setText("x km");
        txtAux5.setText("x hr");
        txtAux6.setText("x km");
        txtAux7.setText("x hr");
        txtAux8.setText("x km");
        
      desativaBotaoPausaEContinua();
        
       textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("");
              

        carrinhoTelaVelocidadeMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource(getAleatorio(caminhoImagensAleatorio))));

        km1.setText("");
        t1.setText("");
        km2.setText("");
        t2.setText("");
        km3.setText("");
        t3.setText("");
        km4.setText("");
        t4.setText("");
        velocidadeTelaVelocidadeMedia.setText("");
        a2.setText("");
        a5.setText("");
        a10.setText("");
        a3.setSelectedItem("Km");
        a6.setSelectedItem("Hr");
        a8.setSelectedItem("Km/h");
        
        b2.setText("");
        b5.setText("");
        b10.setText("");
        b3.setSelectedItem("Km/h");
        b6.setSelectedItem("Hr");
        b8.setSelectedItem("Km");
        
        c2.setText("");
        c5.setText("");
        c10.setText("");
        c3.setSelectedItem("Km/h");
        c6.setSelectedItem("Km");
        c8.setSelectedItem("Hr");

        new Thread() {
            @Override
            public void run() {
                int posicaoInicial = carrinhoTelaVelocidadeMedia.getLocation().x;
                int x = carrinhoTelaVelocidadeMedia.getLocation().x;
                int y = carrinhoTelaVelocidadeMedia.getLocation().y;
                while (true) {
                    x--;
                    if (x <= 0) {
                        break;
                    }
                    carrinhoTelaVelocidadeMedia.setLocation(x, y);
                    try {
                        sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
    }//GEN-LAST:event_btLimparTelaVelocidadeMediaActionPerformed

    private void btVoltarTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaVelocidadeMediaActionPerformed
        escondePaineis();
       telaCinematica.setVisible(true);
       telaInicial.setVisible(false);  
       textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia.setText("");
       textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia.setText("");
    }//GEN-LAST:event_btVoltarTelaVelocidadeMediaActionPerformed

    private void btVoltarTelaExplicacaoFormulaVelocidadeMedia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaExplicacaoFormulaVelocidadeMedia3ActionPerformed
       escondePaineis();
       telaInicial.setVisible(false);
       telaVelocidadeMedia.setVisible(true);  
       desativaBotaoPausaEContinua();
       velocidadeTelaVelocidadeMedia.setText("");
                
    }//GEN-LAST:event_btVoltarTelaExplicacaoFormulaVelocidadeMedia3ActionPerformed

    private void btVisualizarCalculoTelaVelocidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarCalculoTelaVelocidadeMediaActionPerformed
       escondePaineis();
       telaInicial.setVisible(false);
       telaDemonstracaoCalculoVelocidadeMedia.setVisible(true);
       textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia.setVisible(true);
             
    }//GEN-LAST:event_btVisualizarCalculoTelaVelocidadeMediaActionPerformed

    private void a_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_3ActionPerformed

    private void a_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_6ActionPerformed

    private void a_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_9ActionPerformed

    private void a_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_11ActionPerformed

    private void a_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_12ActionPerformed
     
        txtkm1.setText("");
        txtt1.setText("");        
        txtkm2.setText("");
        txtt2.setText("");        
        txtkm3.setText("");
        txtt3.setText("");        
        txtkm4.setText("");
        txtt4.setText("");  
                
        
        
        if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else if(a_3.getSelectedItem().equals("Km") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
         
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("Km/h") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Hr") &&
        a_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(a_3.getSelectedItem().equals("M") && a_6.getSelectedItem().equals("M/s") && a_9.getSelectedItem().equals("Min") &&
        a_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else{
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("S  = So +  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
           
        }
        
        
        
        
        
        VelocidadeMediaTelaVelocidadeMedia dadosDosCamposVelocidadeMedia = new VelocidadeMediaTelaVelocidadeMedia(a2, a5);
        
        EspacoFinalTelaMovimentoUniforme espacoFinal = new EspacoFinalTelaMovimentoUniforme(a_2, a_5, a_8);
        
        try {
                       
            controleEspacoFinal.calculoEspacoFinal(espacoFinal, a_3, a_6, a_9, a_11, a_13, textoCalculosTelaMovimentoUniforme);
                      
            controleEspacoFinal.informacoesParaMovimentarCarrinho(espacoFinal, a_2, a_5, a_8, a_3, a_6, a_9, a_11, a_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme,  btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  
        
    }//GEN-LAST:event_a_12ActionPerformed

    private void a_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_13ActionPerformed

    private void btContinua_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinua_1ActionPerformed
    
        if(selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Final")){           
                
        EspacoFinalTelaMovimentoUniforme espacoFinal = new EspacoFinalTelaMovimentoUniforme(a_2, a_5, a_8);
        
        try {
                       
            controleEspacoFinal.calculoEspacoFinal(espacoFinal, a_3, a_6, a_9, a_11, a_13, textoCalculosTelaMovimentoUniforme);
            
            controleEspacoFinal.informacoesParaMovimentarCarrinho(espacoFinal, a_2, a_5, a_8, a_3, a_6, a_9, a_11, a_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme,  btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }  
        }else if (selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Inicial")){
            
                     
        EspacoInicialTelaMovimentoUniforme espacoInicial = new EspacoInicialTelaMovimentoUniforme(b_2, b_5, b_8);
        
        try {
                       
            controleEspacoInicial.calculoEspacoInicial(espacoInicial, b_3, b_6, b_9, b_11, b_13, textoCalculosTelaMovimentoUniforme);
            
            controleEspacoInicial.informacoesParaMovimentarCarrinho(espacoInicial, b_2, b_5, b_8, b_3, b_6, b_9, b_11, b_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }  

        }else if (selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Velocidade Média")){
            
             br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.VelocidadeMediaTelaMovimentoUniforme velocidadeMedia = new br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.VelocidadeMediaTelaMovimentoUniforme(c_2, c_5, c_8);
        
        try {
                       
            controleVelocidadeMediaTelaMovimentoUniforme.calculoVelocidadeMedia(velocidadeMedia, c_3, c_6, c_9, c_11, c_13, textoCalculosTelaMovimentoUniforme);
                      
            controleVelocidadeMediaTelaMovimentoUniforme.informacoesParaMovimentarCarrinho(velocidadeMedia, c_2, c_5, c_8, c_3, c_6, c_9, c_11, c_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  

        }else{
    
             TempoGastoTelaMovimentoUniforme tempoGastoTelaMovimentoUniforme = new TempoGastoTelaMovimentoUniforme(d_2, d_5, d_8);
        
        try {                       
            controleTempoGastoTelaMovimentoUniforme.calculoTempoGasto(tempoGastoTelaMovimentoUniforme, d_3, d_6, d_9, d_11, d_13, textoCalculosTelaMovimentoUniforme);
                        controleTempoGastoTelaMovimentoUniforme.informacoesParaMovimentarCarrinho(tempoGastoTelaMovimentoUniforme, d_2, d_5, d_8, d_3, d_6, d_9, d_11, d_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  
            
            
        }
        
       
        
    }//GEN-LAST:event_btContinua_1ActionPerformed

    private void btPausa_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausa_1ActionPerformed
        
        if(selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Final")){           
            try {
                controleEspacoFinal.pararCarrinho();          

            } catch (InterruptedException ex) {} 
        }else if (selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Espaço Inicial")){
            
          try {
              controleEspacoInicial.pararCarrinho();          
            
        } catch (InterruptedException ex) {}
        
        }else if (selecionarTipoDeCalculoTelaMovimentoUniforme.getSelectedItem().equals("Velocidade Média")){
            
          try {
            controleVelocidadeMediaTelaMovimentoUniforme.pararCarrinho();          
            
        } catch (InterruptedException ex) {}
          
        }else{
            try {
                controleTempoGastoTelaMovimentoUniforme.pararCarrinho();          

            } catch (InterruptedException ex) {} 
        }
        
    }//GEN-LAST:event_btPausa_1ActionPerformed

    private void selecionarTipoDeCalculoTelaMovimentoUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTipoDeCalculoTelaMovimentoUniformeActionPerformed
        gerenciadorVisualizacaoDeDadosParaCalculosTelaMovimentoUniforme();
    }//GEN-LAST:event_selecionarTipoDeCalculoTelaMovimentoUniformeActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_3ActionPerformed

    private void b_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_6ActionPerformed

    private void b_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_9ActionPerformed

    private void b_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_11ActionPerformed

    private void b_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_12ActionPerformed
        
        txtkm1.setText("");
        txtt1.setText("");        
        txtkm2.setText("");
        txtt2.setText("");        
        txtkm3.setText("");
        txtt3.setText("");        
        txtkm4.setText("");
        txtt4.setText("");      
        
        
        
           
        if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");  
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");       
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");         
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("M")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");       
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("Km")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");     
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else if(b_3.getSelectedItem().equals("Km") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");       
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
         
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("Km")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");     
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("M")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");     
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("Km/h") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");       
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");  
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Hr") &&
        b_11.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");         
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(b_3.getSelectedItem().equals("M") && b_6.getSelectedItem().equals("M/s") && b_9.getSelectedItem().equals("Min") &&
        b_11.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");    
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else{
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("So  = S -  ∆V * ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
           
        }
        
        EspacoInicialTelaMovimentoUniforme espacoInicial = new EspacoInicialTelaMovimentoUniforme(b_2, b_5, b_8);
        
        try {
                       
            controleEspacoInicial.calculoEspacoInicial(espacoInicial, b_3, b_6, b_9, b_11, b_13, textoCalculosTelaMovimentoUniforme);
                      
            controleEspacoInicial.informacoesParaMovimentarCarrinho(espacoInicial, b_2, b_5, b_8, b_3, b_6, b_9, b_11, b_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  
    }//GEN-LAST:event_b_12ActionPerformed

    private void b_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_13ActionPerformed

    private void c_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_3ActionPerformed

    private void c_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_6ActionPerformed

    private void c_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_9ActionPerformed

    private void c_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_11ActionPerformed

    private void c_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_12ActionPerformed
        
        txtkm1.setText("");
        txtt1.setText("");        
        txtkm2.setText("");
        txtt2.setText("");        
        txtkm3.setText("");
        txtt3.setText("");        
        txtkm4.setText("");
        txtt4.setText("");            
        
        if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("M")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");    
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");      
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");      
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");         
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("Km")){
                    
                   
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else if(c_3.getSelectedItem().equals("Km") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
         
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("Km")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");       
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("Km")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("Km/h") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Hr") &&
        c_6.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(c_3.getSelectedItem().equals("M") && c_11.getSelectedItem().equals("M/s") && c_9.getSelectedItem().equals("Min") &&
        c_6.getSelectedItem().equals("Km")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T"); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else{
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText("∆V= (S - So) / ∆T");         
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
           
        }
        
        br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.VelocidadeMediaTelaMovimentoUniforme velocidadeMedia = new br.com.wesley.easyfisica.fisica1.mecanica.cinematica.movimentouniforme.VelocidadeMediaTelaMovimentoUniforme(c_2, c_5, c_8);
        
        try {
                       
            controleVelocidadeMediaTelaMovimentoUniforme.calculoVelocidadeMedia(velocidadeMedia, c_3, c_6, c_9, c_11, c_13, textoCalculosTelaMovimentoUniforme);
                      
            controleVelocidadeMediaTelaMovimentoUniforme.informacoesParaMovimentarCarrinho(velocidadeMedia, c_2, c_5, c_8, c_3, c_6, c_9, c_11, c_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
         
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  
    }//GEN-LAST:event_c_12ActionPerformed

    private void c_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_13ActionPerformed

    private void btVoltarTelaInicioMovUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicioMovUniformeActionPerformed
        admEntrou = false;
            
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        escondePaineis();
        telaInicial.setVisible(true);
        
        textoCalculosTelaMovimentoUniforme.setText("");
       textoExplicacaoCalculoMovimentoUniforme1.setText("");
       textoExplicacaoCalculoMovimentoUniforme2.setText("");
       textoExplicacaoCalculoMovimentoUniforme3.setText("");
       textoExplicacaoCalculoMovimentoUniforme4.setText("");
       textoExplicacaoCalculoMovimentoUniforme5.setText("");
       textoExplicacaoCalculoMovimentoUniforme6.setText("");
    }//GEN-LAST:event_btVoltarTelaInicioMovUniformeActionPerformed

    private void btLimparTelaMovUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelaMovUniformeActionPerformed

        
        txtkm1.setText("0 km");
        txtt1.setText("0 hr");
        txtt4.setText("x hr");
        txtkm4.setText("x km");
        txtt3.setText("x hr");
        txtkm3.setText("x km");
        txtt2.setText("x hr");
        txtkm2.setText("x km");
        k4_4.setText("");
        t4_4.setText("");
        
       textoCalculosTelaMovimentoUniforme.setText("");
       textoExplicacaoCalculoMovimentoUniforme1.setText("");
       textoExplicacaoCalculoMovimentoUniforme2.setText("");
       textoExplicacaoCalculoMovimentoUniforme3.setText("");
       textoExplicacaoCalculoMovimentoUniforme4.setText("");
       textoExplicacaoCalculoMovimentoUniforme5.setText("");
       textoExplicacaoCalculoMovimentoUniforme6.setText("");

        carrinho_1.setIcon(new javax.swing.ImageIcon(getClass().getResource(getAleatorio(caminhoImagensAleatorio))));

        k1_1.setText("");
        t1_1.setText("");
        k2_2.setText("");
        t2_2.setText("");
        k2_2.setText("");
        t3_3.setText("");
        k3_3.setText("");
        t3_3.setText("");
        velocidade_1.setText("");
        
        a_2.setText("");
        a_5.setText("");
        a_8.setText("");
        a_13.setText("");
        a_3.setSelectedItem("Km");
        a_6.setSelectedItem("Km/h");
        a_9.setSelectedItem("Hr");
        a_11.setSelectedItem("Km");
        
       b_2.setText("");
        b_5.setText("");
        b_8.setText("");
        b_13.setText("");
        b_3.setSelectedItem("Km");
        b_6.setSelectedItem("Km/h");
        b_9.setSelectedItem("Hr");
        b_11.setSelectedItem("Km");
        
        c_2.setText("");
        c_5.setText("");
        c_8.setText("");
        c_13.setText("");
        c_3.setSelectedItem("Km");
        c_6.setSelectedItem("Km");
        c_9.setSelectedItem("Hr");
        c_11.setSelectedItem("Km/h");
        
           
        d_2.setText("");
        d_5.setText("");
        d_8.setText("");
        d_13.setText("");
        d_3.setSelectedItem("Km");
        d_6.setSelectedItem("Km");
        d_9.setSelectedItem("Km/h");
        d_11.setSelectedItem("Hr");

        new Thread() {
            @Override
            public void run() {
                int posicaoInicial = carrinho_1.getLocation().x;
                int x = carrinho_1.getLocation().x;
                int y = carrinho_1.getLocation().y;
                while (true) {
                    x--;
                    if (x <= 0) {
                        break;
                    }
                    carrinho_1.setLocation(x, y);
                    try {
                        sleep(2);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();
        
    }//GEN-LAST:event_btLimparTelaMovUniformeActionPerformed
    
      
    private void btVoltarTelaMovUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaMovUniformeActionPerformed
        escondePaineis();
        telaCinematica.setVisible(true);
        telaInicial.setVisible(false);
        
       textoCalculosTelaMovimentoUniforme.setText("");
       textoExplicacaoCalculoMovimentoUniforme1.setText("");
       textoExplicacaoCalculoMovimentoUniforme2.setText("");
       textoExplicacaoCalculoMovimentoUniforme3.setText("");
       textoExplicacaoCalculoMovimentoUniforme4.setText("");
       textoExplicacaoCalculoMovimentoUniforme5.setText("");
       textoExplicacaoCalculoMovimentoUniforme6.setText("");
       
       
    }//GEN-LAST:event_btVoltarTelaMovUniformeActionPerformed

    private void visualizarCalculoTelaMovUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCalculoTelaMovUniformeActionPerformed

       escondePaineis();
       telaInicial.setVisible(false);
       telaDemonstracaoCalculoMovimentoUniforme.setVisible(true);
       textoCalculosTelaMovimentoUniforme.setVisible(true);
        
        
    }//GEN-LAST:event_visualizarCalculoTelaMovUniformeActionPerformed

    private void d_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_3ActionPerformed

    private void d_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_6ActionPerformed

    private void d_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_9ActionPerformed

    private void d_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_11ActionPerformed

    private void d_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_12ActionPerformed
       txtkm1.setText("");
        txtt1.setText("");        
        txtkm2.setText("");
        txtt2.setText("");        
        txtkm3.setText("");
        txtt3.setText("");        
        txtkm4.setText("");
        txtt4.setText("");       
       
        if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("M")){
                    
             textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");    
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");      
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("M")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");     
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");        
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("M")){
                    
        textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("Km")){
                    
                   
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else if(d_3.getSelectedItem().equals("Km") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("M")){
                    
          textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">Km</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
         
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("Km")){
                    
           textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("M")){
                    
         textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");      
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("Km")){
                    
          textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("Km/h") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("M")){
                    
        textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">Km/h</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("Km")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        }else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Hr") &&
        d_6.getSelectedItem().equals("M")){
                    
            textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">m</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">Hr</font>, Temos:</html>");
        } else if(d_3.getSelectedItem().equals("M") && d_9.getSelectedItem().equals("M/s") && d_11.getSelectedItem().equals("Min") &&
        d_6.getSelectedItem().equals("Km")){
                    
          textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V "); 
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">Km</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
        }  else{
                    
        textoExplicacaoCalculoMovimentoUniforme1.setText(" ∆T = (S - So) / ∆V ");         
            textoExplicacaoCalculoMovimentoUniforme2.setText("S: Espaço Final");
            textoExplicacaoCalculoMovimentoUniforme3.setText("So: Espaço Inicial");
            textoExplicacaoCalculoMovimentoUniforme4.setText("∆V: Velocidade Média");
            textoExplicacaoCalculoMovimentoUniforme5.setText("∆T: Tempo Gasto");
            textoExplicacaoCalculoMovimentoUniforme6.setText("<html>Para S em <font color=\"green\">M</font>, So em <font color=\"red\">m</font>,"
            + " ΔV em <font color=\"blue\">m/s</font> e ΔT em <font color=\"orange\">min</font>, Temos:</html>");
           
        }
        
        TempoGastoTelaMovimentoUniforme tempoGastoTelaMovimentoUniforme = new TempoGastoTelaMovimentoUniforme(d_2, d_5, d_8);
        
        try {                       
            controleTempoGastoTelaMovimentoUniforme.calculoTempoGasto(tempoGastoTelaMovimentoUniforme, d_3, d_6, d_9, d_11, d_13, textoCalculosTelaMovimentoUniforme);
                        controleTempoGastoTelaMovimentoUniforme.informacoesParaMovimentarCarrinho(tempoGastoTelaMovimentoUniforme, d_2, d_5, d_8, d_3, d_6, d_9, d_11, d_13,
            velocidade_1, k1_1, t1_1, k2_2, t2_2, k3_3, t3_3, k4_4, t4_4, carrinho_1, textoCalculosTelaMovimentoUniforme, btLimparTelaMovUniforme);
        
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException | EspacoFinalExeptionTelaMovimentoUniforme | VelocidadeMediaExeptionTelaVelocidadeMedia | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex, "ERRO", JOptionPane.ERROR_MESSAGE);          
        }  
    }//GEN-LAST:event_d_12ActionPerformed

    private void d_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_13ActionPerformed

    private void btVoltarTelaExplicacaoFormulaMovimentoUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaExplicacaoFormulaMovimentoUniformeActionPerformed
       escondePaineis();
       telaInicial.setVisible(false);
       telaMovimentoUniforme.setVisible(true);  
    }//GEN-LAST:event_btVoltarTelaExplicacaoFormulaMovimentoUniformeActionPerformed

    private void btEntrarTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarTelaLoginActionPerformed
      
        if(campoTextoUsuarioTelaLogin.getText().equals("")){
            
              JOptionPane.showMessageDialog(null, "Campo Usuário Vazio", "ERRO", JOptionPane.ERROR_MESSAGE); 
              campoTextoUsuarioTelaLogin.requestFocus();              
        }else if(campoTextoSenhaTelaLogin.getText().equals("")){
            
              JOptionPane.showMessageDialog(null, "Campo Senha Vazio", "ERRO", JOptionPane.ERROR_MESSAGE); 
              campoTextoSenhaTelaLogin.requestFocus();              
            
        }else if(!campoTextoUsuarioTelaLogin.getText().equals("wesleyeduardo")){
              JOptionPane.showMessageDialog(null, "Usuário Incorreto", "ERRO", JOptionPane.ERROR_MESSAGE); 
              campoTextoUsuarioTelaLogin.requestFocus();   
        }else if(!campoTextoSenhaTelaLogin.getText().equals("81230268")){
              JOptionPane.showMessageDialog(null, "Senha Incorreta", "ERRO", JOptionPane.ERROR_MESSAGE); 
              campoTextoUsuarioTelaLogin.requestFocus();   
        }else{
            
            escondePaineis();
            telaMecanica.setVisible(true);
            telaInicial.setVisible(false);
            
            
            menuAdm.setVisible(true);
            menuAvaliacao.setVisible(true);
            
            campoTextoUsuarioTelaLogin.setText("");
            campoTextoSenhaTelaLogin.setText("");
            
            admEntrou = true;
            
        }
        
        
    }//GEN-LAST:event_btEntrarTelaLoginActionPerformed

    private void btCadastreseTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastreseTelaLoginActionPerformed
            
            escondePaineis();
            telaCadastro.setVisible(true);
            telaInicial.setVisible(false);
        
    }//GEN-LAST:event_btCadastreseTelaLoginActionPerformed

    private void btTestarAplicativoTelaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestarAplicativoTelaLoginActionPerformed
       
            escondePaineis();
            telaMecanica.setVisible(true);
            telaInicial.setVisible(false);
            
            
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(true);
        
    }//GEN-LAST:event_btTestarAplicativoTelaLoginActionPerformed

    private void btVoltarTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaCadastroActionPerformed
        admEntrou = false;
        
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        
            escondePaineis();            
            telaInicial.setVisible(true);
            
            txtCampoNomeTelaCadastro.setText("");
            txtCampoUsuarioTelaCadastro.setText("");
            txtCampoSenhaTelaCadastro.setText("");
            txtCampoCursoTelaCadastro.setText("");
            
            tipoUsuarioTelaCadastro.setSelectedItem("Aluno");
            
        
    }//GEN-LAST:event_btVoltarTelaCadastroActionPerformed

    private void btCadastratTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastratTelaCadastroActionPerformed
        
            
        
    }//GEN-LAST:event_btCadastratTelaCadastroActionPerformed

    private void menuPainelAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPainelAdmActionPerformed
           escondePaineis();
            telaAdministrador.setVisible(true);
            telaInicial.setVisible(false);
        
    }//GEN-LAST:event_menuPainelAdmActionPerformed

    private void menuAvaliacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAvaliacoesActionPerformed
      
            escondePaineis();
            telaComentariosSugestoesCriticas.setVisible(true);
            telaInicial.setVisible(false);
        
    }//GEN-LAST:event_menuAvaliacoesActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
            escondePaineis();
            telaUsuarios.setVisible(true);
            telaInicial.setVisible(false);
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void telaAvaliaxaoBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaAvaliaxaoBtVoltarActionPerformed
            admEntrou = false;
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
            escondePaineis();            
            telaInicial.setVisible(true);
    }//GEN-LAST:event_telaAvaliaxaoBtVoltarActionPerformed

    private void btVoltarTelaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaAdmActionPerformed
            admEntrou = false;
            
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        
            escondePaineis();            
            telaInicial.setVisible(true);
    }//GEN-LAST:event_btVoltarTelaAdmActionPerformed

    private void telaComentariosBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaComentariosBtVoltarActionPerformed
            admEntrou = false;
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
            escondePaineis();            
            telaInicial.setVisible(true);
    }//GEN-LAST:event_telaComentariosBtVoltarActionPerformed

    private void telaUsuarioBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaUsuarioBtVoltarActionPerformed
        admEntrou = false;
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
            escondePaineis();            
            telaInicial.setVisible(true);
    }//GEN-LAST:event_telaUsuarioBtVoltarActionPerformed

    private void menuAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAvaliarActionPerformed
        escondePaineis();
            telaAvaliacao.setVisible(true);
            telaInicial.setVisible(false);
    }//GEN-LAST:event_menuAvaliarActionPerformed

    private void btExplicacaoTelaCinematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExplicacaoTelaCinematicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExplicacaoTelaCinematicaActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void btExplicacaoTelaMRUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExplicacaoTelaMRUVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExplicacaoTelaMRUVActionPerformed

    private void btMRUVAceleracaoMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMRUVAceleracaoMediaActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMRUVAceleracaoMediaActionPerformed

    private void btMRUVFuncaoHorariaDaPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMRUVFuncaoHorariaDaPosicaoActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMRUVFuncaoHorariaDaPosicaoActionPerformed

    private void btMRUVPosicaoEmFuncaoDoTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMRUVPosicaoEmFuncaoDoTempoActionPerformed
        JOptionPane.showMessageDialog(null, "Em Construção", "ERRO", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btMRUVPosicaoEmFuncaoDoTempoActionPerformed

    private void btMRUVEquacaoDeTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMRUVEquacaoDeTorricelliActionPerformed
        escondePaineis();
        
        km1.setText("");
        t1.setText("");
        km2.setText("");
        t2.setText("");
        km3.setText("");
        t3.setText("");
        km4.setText("");
        t4.setText("");
        velocidadeTelaVelocidadeMedia.setText("");
        
        telaMRUVEquacaoDeTorricelli.setVisible(true);
        telaInicial.setVisible(false);
        telaDemonstracaoCalculoMRUVEquacaoDeTorricelli.setVisible(false);
        telaDemonstracaoCalculoMovimentoUniforme.setVisible(false);
        
        carrinhoTelaVelocidadeMedia.setLocation(0, 446);
        velocidadeTelaVelocidadeMedia.setLocation(0, 426);
        a2.setText("");
        a5.setText("");
        a10.setText("");
        a3.setSelectedItem("Km");
        a6.setSelectedItem("Hr");
        a8.setSelectedItem("Km/h");
        
        selecionarTipoDeCalculoTelaMRUVTorricelli.setSelectedItem("Velocidade Final");
        
    }//GEN-LAST:event_btMRUVEquacaoDeTorricelliActionPerformed

    private void btVoltarTelaAnteriorMRUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaAnteriorMRUVActionPerformed
        escondePaineis();
       telaCinematica.setVisible(true); 
    }//GEN-LAST:event_btVoltarTelaAnteriorMRUVActionPerformed

    private void btVoltarTelaInicioMRUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicioMRUVActionPerformed
        voltaATelaInicial();
    }//GEN-LAST:event_btVoltarTelaInicioMRUVActionPerformed

    private void selecionarTipoDeCalculoTelaMRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarTipoDeCalculoTelaMRUVTorricelliActionPerformed
        gerenciadorVisualizacaoDeDadosParaCalculosTelaMRUVTorricelli();
    }//GEN-LAST:event_selecionarTipoDeCalculoTelaMRUVTorricelliActionPerformed

    private void a3_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3_MRUVTorricelliActionPerformed

    private void a6_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6_MRUVTorricelliActionPerformed

    private void a9_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a9_MRUVTorricelliActionPerformed

    private void a11_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11_MRUVTorricelliActionPerformed

    private void a12_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a12_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a12_MRUVTorricelliActionPerformed

    private void a13_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a13_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a13_MRUVTorricelliActionPerformed

    private void b3_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3_MRUVTorricelliActionPerformed

    private void b6_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6_MRUVTorricelliActionPerformed

    private void b9_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b9_MRUVTorricelliActionPerformed

    private void b11_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b11_MRUVTorricelliActionPerformed

    private void b12_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b12_MRUVTorricelliActionPerformed

    private void b13_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b13_MRUVTorricelliActionPerformed

    private void c3_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3_MRUVTorricelliActionPerformed

    private void c6_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6_MRUVTorricelliActionPerformed

    private void c9_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c9_MRUVTorricelliActionPerformed

    private void c11_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c11_MRUVTorricelliActionPerformed

    private void c12_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c12_MRUVTorricelliActionPerformed

    private void c13_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c13_MRUVTorricelliActionPerformed

    private void d3_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3_MRUVTorricelliActionPerformed

    private void d6_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d6_MRUVTorricelliActionPerformed

    private void d8_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d8_MRUVTorricelliActionPerformed

    private void d11_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d11_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d11_MRUVTorricelliActionPerformed

    private void d12_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d12_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d12_MRUVTorricelliActionPerformed

    private void d13_MRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d13_MRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d13_MRUVTorricelliActionPerformed

    private void visualizarCalculoTelaMRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCalculoTelaMRUVTorricelliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarCalculoTelaMRUVTorricelliActionPerformed

    private void btContinua_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContinua_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btContinua_2ActionPerformed

    private void btPausa_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausa_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPausa_2ActionPerformed

    private void btVoltarTelaInicioMRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaInicioMRUVTorricelliActionPerformed
        voltaATelaInicial();
    }//GEN-LAST:event_btVoltarTelaInicioMRUVTorricelliActionPerformed

    private void btLimparTelaMRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparTelaMRUVTorricelliActionPerformed
        
    }//GEN-LAST:event_btLimparTelaMRUVTorricelliActionPerformed

    private void btVoltarTelaMRUVTorricelliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaMRUVTorricelliActionPerformed
        menuAdm.setVisible(false);
        menuAvaliacao.setVisible(false);
        
        escondePaineis();
        telaMRUV.setVisible(true);
    }//GEN-LAST:event_btVoltarTelaMRUVTorricelliActionPerformed

    private void btVoltarTelaExplicacaoFormulaMovimentoUniforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarTelaExplicacaoFormulaMovimentoUniforme1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarTelaExplicacaoFormulaMovimentoUniforme1ActionPerformed

    private void btExplicacaoTelaMecanicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExplicacaoTelaMecanicaActionPerformed
           
    }//GEN-LAST:event_btExplicacaoTelaMecanicaActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (Exception e) {
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {

            GUI tela = new GUI();
            tela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);            
            tela.addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosing(WindowEvent evt) {
                    int i = JOptionPane.showConfirmDialog(null, "Deseja Realmente SAIR?", "Saída", JOptionPane.ERROR_MESSAGE);
                    if (i == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    } else {
                    }
                }

            });

            tela.setVisible(true);

        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JTextField a10;
    private javax.swing.JLabel a10_MRUVTorricelli;
    private javax.swing.JComboBox<String> a11_MRUVTorricelli;
    private javax.swing.JButton a12_MRUVTorricelli;
    private javax.swing.JTextField a13_MRUVTorricelli;
    private javax.swing.JLabel a1_MRUVTorricelli;
    private static javax.swing.JTextField a2;
    private javax.swing.JTextField a2_MRUVTorricelli;
    private static javax.swing.JComboBox<String> a3;
    private javax.swing.JComboBox<String> a3_MRUVTorricelli;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a4_MRUVTorricelli;
    private static javax.swing.JTextField a5;
    private javax.swing.JTextField a5_MRUVTorricelli;
    private static javax.swing.JComboBox<String> a6;
    private javax.swing.JComboBox<String> a6_MRUVTorricelli;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a7_MRUVTorricelli;
    private static javax.swing.JComboBox<String> a8;
    private javax.swing.JTextField a8_MRUVTorricelli;
    private static javax.swing.JButton a9;
    private javax.swing.JComboBox<String> a9_MRUVTorricelli;
    private javax.swing.JLabel a_1;
    private javax.swing.JLabel a_10;
    private javax.swing.JComboBox<String> a_11;
    private javax.swing.JButton a_12;
    private javax.swing.JTextField a_13;
    private javax.swing.JTextField a_2;
    private javax.swing.JComboBox<String> a_3;
    private javax.swing.JLabel a_4;
    private javax.swing.JTextField a_5;
    private javax.swing.JComboBox<String> a_6;
    private javax.swing.JLabel a_7;
    private javax.swing.JTextField a_8;
    private javax.swing.JComboBox<String> a_9;
    private javax.swing.JLabel animacaoTelaInicial;
    private javax.swing.JLabel b1;
    private javax.swing.JTextField b10;
    private javax.swing.JLabel b10_MRUVTorricelli;
    private javax.swing.JComboBox<String> b11_MRUVTorricelli;
    private javax.swing.JButton b12_MRUVTorricelli;
    private javax.swing.JTextField b13_MRUVTorricelli;
    private javax.swing.JLabel b1_MRUVTorricelli;
    private static javax.swing.JTextField b2;
    private javax.swing.JTextField b2_MRUVTorricelli;
    private static javax.swing.JComboBox<String> b3;
    private javax.swing.JComboBox<String> b3_MRUVTorricelli;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b4_MRUVTorricelli;
    private static javax.swing.JTextField b5;
    private javax.swing.JTextField b5_MRUVTorricelli;
    private static javax.swing.JComboBox<String> b6;
    private javax.swing.JComboBox<String> b6_MRUVTorricelli;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b7_MRUVTorricelli;
    private static javax.swing.JComboBox<String> b8;
    private javax.swing.JTextField b8_MRUVTorricelli;
    private static javax.swing.JButton b9;
    private javax.swing.JComboBox<String> b9_MRUVTorricelli;
    private javax.swing.JLabel b_1;
    private javax.swing.JLabel b_10;
    private javax.swing.JComboBox<String> b_11;
    private javax.swing.JButton b_12;
    private javax.swing.JTextField b_13;
    private javax.swing.JTextField b_2;
    private javax.swing.JComboBox<String> b_3;
    private javax.swing.JLabel b_4;
    private javax.swing.JTextField b_5;
    private javax.swing.JComboBox<String> b_6;
    private javax.swing.JLabel b_7;
    private javax.swing.JTextField b_8;
    private javax.swing.JComboBox<String> b_9;
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JLabel borda02;
    private javax.swing.Box.Filler borda1TelaMRUVTorricelli;
    private javax.swing.Box.Filler borda1TelaMovimentoUniforme;
    private javax.swing.Box.Filler borda1TelaVelocidadeMedia;
    private javax.swing.Box.Filler borda2TelaMRUVTorricelli;
    private javax.swing.Box.Filler borda2TelaMovimentoUniforme;
    private javax.swing.Box.Filler borda2TelaVelocidadeMedia;
    private javax.swing.JLabel bordaTelaLogin;
    private javax.swing.JRadioButton bt1;
    private javax.swing.JRadioButton bt10;
    private javax.swing.JRadioButton bt2;
    private javax.swing.JRadioButton bt3;
    private javax.swing.JRadioButton bt4;
    private javax.swing.JRadioButton bt5;
    private javax.swing.JRadioButton bt6;
    private javax.swing.JRadioButton bt7;
    private javax.swing.JRadioButton bt8;
    private javax.swing.JRadioButton bt9;
    private javax.swing.JButton btCadastratTelaCadastro;
    private javax.swing.JButton btCadastreseTelaLogin;
    private javax.swing.JButton btCinematicaTelaMecanica;
    private static javax.swing.JButton btContinuaTelaVelocidadeMedia;
    private javax.swing.JButton btContinua_1;
    private javax.swing.JButton btContinua_2;
    private javax.swing.JButton btDinamicaTelaMecanica;
    private javax.swing.JButton btEntrarTelaLogin;
    private javax.swing.JButton btEstaticaTelaMecanica;
    private javax.swing.JButton btExplicacaoTelaCinematica;
    private javax.swing.JButton btExplicacaoTelaMRUV;
    private javax.swing.JButton btExplicacaoTelaMecanica;
    private javax.swing.JButton btFisica1TelaInicial;
    private javax.swing.JButton btFisica2TelaInicial;
    private javax.swing.JButton btFisica3TelaInicial;
    private javax.swing.JButton btGravUniversalTelaMecanica;
    private javax.swing.JButton btHidrostaticaTelaMecanica;
    private static javax.swing.JButton btInicioTelaVelocidadeMedia;
    private javax.swing.JButton btLimparTelaMRUVTorricelli;
    private javax.swing.JButton btLimparTelaMovUniforme;
    private javax.swing.JButton btLimparTelaVelocidadeMedia;
    private javax.swing.JButton btMRUVAceleracaoMedia;
    private javax.swing.JButton btMRUVEquacaoDeTorricelli;
    private javax.swing.JButton btMRUVFuncaoHorariaDaPosicao;
    private javax.swing.JButton btMRUVPosicaoEmFuncaoDoTempo;
    private javax.swing.JButton btMovimentoCircularTelaCinematica;
    private javax.swing.JButton btMovimentoObliquoTelaCinematica;
    private javax.swing.JButton btMovimentoUniformeTelaCinematica;
    private javax.swing.JButton btMovimentoUniformeVariadoTelaCinematica;
    private javax.swing.JButton btMovimentoVerticalTelaCinematica;
    private static javax.swing.JButton btPausaTelaVelocidadeMedia;
    private javax.swing.JButton btPausa_1;
    private javax.swing.JButton btPausa_2;
    private javax.swing.JButton btTestarAplicativoTelaLogin;
    private javax.swing.JButton btVelocidadeMediaTelaCinematica;
    private static javax.swing.JButton btVisualizarCalculoTelaVelocidadeMedia;
    private javax.swing.JButton btVoltarTelaAdm;
    private javax.swing.JButton btVoltarTelaAnteriorCinematica;
    private javax.swing.JButton btVoltarTelaAnteriorMRUV;
    private javax.swing.JButton btVoltarTelaCadastro;
    private javax.swing.JButton btVoltarTelaExplicacaoFormulaMovimentoUniforme;
    private javax.swing.JButton btVoltarTelaExplicacaoFormulaMovimentoUniforme1;
    private javax.swing.JButton btVoltarTelaExplicacaoFormulaVelocidadeMedia3;
    private javax.swing.JButton btVoltarTelaInicioCinematica;
    private javax.swing.JButton btVoltarTelaInicioMRUV;
    private javax.swing.JButton btVoltarTelaInicioMRUVTorricelli;
    private javax.swing.JButton btVoltarTelaInicioMovUniforme;
    private javax.swing.JButton btVoltarTelaMRUVTorricelli;
    private javax.swing.JButton btVoltarTelaMecanica;
    private javax.swing.JButton btVoltarTelaMovUniforme;
    private static javax.swing.JButton btVoltarTelaVelocidadeMedia;
    private javax.swing.JLabel c1;
    private javax.swing.JTextField c10;
    private javax.swing.JLabel c10_MRUVTorricelli;
    private javax.swing.JComboBox<String> c11_MRUVTorricelli;
    private javax.swing.JButton c12_MRUVTorricelli;
    private javax.swing.JTextField c13_MRUVTorricelli;
    private javax.swing.JLabel c1_MRUVTorricelli;
    private static javax.swing.JTextField c2;
    private javax.swing.JTextField c2_MRUVTorricelli;
    private static javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c3_MRUVTorricelli;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c4_MRUVTorricelli;
    private static javax.swing.JTextField c5;
    private javax.swing.JTextField c5_MRUVTorricelli;
    private static javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> c6_MRUVTorricelli;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c7_MRUVTorricelli;
    private static javax.swing.JComboBox<String> c8;
    private javax.swing.JTextField c8_MRUVTorricelli;
    private static javax.swing.JButton c9;
    private javax.swing.JComboBox<String> c9_MRUVTorricelli;
    private javax.swing.JLabel c_1;
    private javax.swing.JLabel c_10;
    private javax.swing.JComboBox<String> c_11;
    private javax.swing.JButton c_12;
    private javax.swing.JTextField c_13;
    private javax.swing.JTextField c_2;
    private javax.swing.JComboBox<String> c_3;
    private javax.swing.JLabel c_4;
    private javax.swing.JTextField c_5;
    private javax.swing.JComboBox<String> c_6;
    private javax.swing.JLabel c_7;
    private javax.swing.JTextField c_8;
    private javax.swing.JComboBox<String> c_9;
    private javax.swing.JScrollPane campoAreaTexto;
    private javax.swing.JPasswordField campoTextoSenhaTelaLogin;
    private javax.swing.JTextField campoTextoUsuarioTelaLogin;
    public static javax.swing.JLabel carrinhoTelaVelocidadeMedia;
    private javax.swing.JLabel carrinho_1;
    private javax.swing.JLabel carrinho_2;
    private javax.swing.JTextField d10_MRUVTorricelli;
    private javax.swing.JComboBox<String> d11_MRUVTorricelli;
    private javax.swing.JButton d12_MRUVTorricelli;
    private javax.swing.JTextField d13_MRUVTorricelli;
    private javax.swing.JLabel d1_MRUVTorricelli;
    private javax.swing.JTextField d2_MRUVTorricelli;
    private javax.swing.JComboBox<String> d3_MRUVTorricelli;
    private javax.swing.JLabel d4_MRUVTorricelli;
    private javax.swing.JTextField d5_MRUVTorricelli;
    private javax.swing.JComboBox<String> d6_MRUVTorricelli;
    private javax.swing.JLabel d7_MRUVTorricelli;
    private javax.swing.JComboBox<String> d8_MRUVTorricelli;
    private javax.swing.JLabel d9_MRUVTorricelli;
    private javax.swing.JLabel d_1;
    private javax.swing.JLabel d_10;
    private javax.swing.JComboBox<String> d_11;
    private javax.swing.JButton d_12;
    private javax.swing.JTextField d_13;
    private javax.swing.JTextField d_2;
    private javax.swing.JComboBox<String> d_3;
    private javax.swing.JLabel d_4;
    private javax.swing.JTextField d_5;
    private javax.swing.JComboBox<String> d_6;
    private javax.swing.JLabel d_7;
    private javax.swing.JTextField d_8;
    private javax.swing.JComboBox<String> d_9;
    private javax.swing.JLabel estrada;
    private javax.swing.JLabel estrada1;
    private javax.swing.JLabel estradaTelaVelocidadeMedia;
    private javax.swing.ButtonGroup grupoBotoesTelaAvaliacao;
    private javax.swing.JLabel iconComent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel k1_1;
    private javax.swing.JLabel k1_2;
    private javax.swing.JLabel k2_2;
    private javax.swing.JLabel k2_3;
    private javax.swing.JLabel k3_3;
    private javax.swing.JLabel k3_4;
    private javax.swing.JLabel k4_4;
    private javax.swing.JLabel k4_5;
    private javax.swing.JLabel km1;
    private javax.swing.JLabel km2;
    private javax.swing.JLabel km3;
    private javax.swing.JLabel km4;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenu menuAvaliacao;
    private javax.swing.JMenuItem menuAvaliacoes;
    private javax.swing.JMenuItem menuAvaliar;
    private javax.swing.JMenuItem menuPainelAdm;
    private javax.swing.JMenuItem menuUsuario;
    private javax.swing.JLayeredPane painelCamadas;
    private javax.swing.JComboBox<String> selecionarTipoDeCalculoTelaMRUVTorricelli;
    private javax.swing.JComboBox<String> selecionarTipoDeCalculoTelaMovimentoUniforme;
    private static javax.swing.JComboBox<String> selecionarTipodeCalculoTelaVelocidadeMedia;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t1_1;
    private javax.swing.JLabel t1_2;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t2_2;
    private javax.swing.JLabel t2_3;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t3_3;
    private javax.swing.JLabel t3_4;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t4_4;
    private javax.swing.JLabel t4_5;
    private javax.swing.JLabel telaAdmGrafico;
    private javax.swing.JLabel telaAdmTxt1;
    private javax.swing.JLabel telaAdmTxt2;
    private javax.swing.JPanel telaAdministrador;
    private javax.swing.JPanel telaAvaliacao;
    private javax.swing.JTextArea telaAvaliacaoAreaTexto;
    private javax.swing.JComboBox<String> telaAvaliacaoJComboBox;
    private javax.swing.JButton telaAvaliaxaoBtVoltar;
    private javax.swing.JButton telaAvaliaxaoBtenviar;
    private javax.swing.JLabel telaAvaliaxaoTxt11;
    private javax.swing.JLabel telaAvaliaxaoTxt12;
    private javax.swing.JLabel telaAvaliaxaoTxt13;
    private javax.swing.JPanel telaCadastro;
    private javax.swing.JPanel telaCinematica;
    private javax.swing.JTextArea telaComentariosAreaTexto;
    private javax.swing.JScrollPane telaComentariosAreaTexto01;
    private javax.swing.JButton telaComentariosBtImprimir;
    private javax.swing.JButton telaComentariosBtLimpar;
    private javax.swing.JButton telaComentariosBtVoltar;
    private javax.swing.JPanel telaComentariosSugestoesCriticas;
    private javax.swing.JLabel telaComentariosTxt1;
    private javax.swing.JComboBox<String> telaComentariosTxt1JComboBox;
    private javax.swing.JPanel telaDemonstracaoCalculoMRUVEquacaoDeTorricelli;
    private javax.swing.JPanel telaDemonstracaoCalculoMovimentoUniforme;
    private javax.swing.JPanel telaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JPanel telaLogin;
    private javax.swing.JPanel telaMRUV;
    private javax.swing.JPanel telaMRUVEquacaoDeTorricelli;
    private javax.swing.JPanel telaMecanica;
    private javax.swing.JPanel telaMovimentoUniforme;
    private javax.swing.JButton telaUsuarioBtBuscar;
    private javax.swing.JButton telaUsuarioBtImprimirTudo;
    private javax.swing.JButton telaUsuarioBtLimparTela;
    private javax.swing.JButton telaUsuarioBtRemoverSelecionado;
    private javax.swing.JButton telaUsuarioBtRemoverTudo;
    private javax.swing.JButton telaUsuarioBtVoltar;
    private javax.swing.JTextField telaUsuarioCampotexto1;
    private javax.swing.JTable telaUsuarioTabela;
    private javax.swing.JLabel telaUsuarioTxt1;
    private javax.swing.JLabel telaUsuarioTxt2;
    private javax.swing.JPanel telaUsuarios;
    private javax.swing.JPanel telaVelocidadeMedia;
    private javax.swing.JLabel textoCalculosTelaMovimentoUniforme;
    private javax.swing.JLabel textoCalculosTelaMovimentoUniforme1;
    private javax.swing.JLabel textoCalculosTelaVelocidadeMediaTelaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme0;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme1;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme10;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme11;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme12;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme13;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme2;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme3;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme4;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme5;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme6;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme7;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme8;
    private javax.swing.JLabel textoExplicacaoCalculoMovimentoUniforme9;
    private javax.swing.JLabel textoExplicacaoCalculoVelocidadeMedia1TelaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JLabel textoExplicacaoCalculoVelocidadeMedia2TelaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JLabel textoExplicacaoCalculoVelocidadeMedia3TelaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JLabel textoExplicacaoCalculoVelocidadeMedia4TelaDemonstracaoCalculoVelocidadeMedia;
    private javax.swing.JLabel textoPhysisTelaInicial;
    private javax.swing.JComboBox<String> tipoUsuarioTelaCadastro;
    private javax.swing.JLabel txtAindaNaoCadastradoTelaLogin;
    private javax.swing.JLabel txtAux1;
    private javax.swing.JLabel txtAux2;
    private javax.swing.JLabel txtAux3;
    private javax.swing.JLabel txtAux4;
    private javax.swing.JLabel txtAux5;
    private javax.swing.JLabel txtAux6;
    private javax.swing.JLabel txtAux7;
    private javax.swing.JLabel txtAux8;
    private javax.swing.JLabel txtCadastroTelaCadastro;
    private javax.swing.JTextField txtCampoCursoTelaCadastro;
    private javax.swing.JTextField txtCampoNomeTelaCadastro;
    private javax.swing.JPasswordField txtCampoSenhaTelaCadastro;
    private javax.swing.JTextField txtCampoUsuarioTelaCadastro;
    private javax.swing.JLabel txtCinematicaTelaCinematica;
    private javax.swing.JLabel txtCinematicaTelaMRUV;
    private javax.swing.JLabel txtCursoTelaCadastro;
    private javax.swing.JLabel txtFormulaATelaMRUVTorricelli;
    private javax.swing.JLabel txtFormulaDeltaSTelaMRUVTorricelli;
    private javax.swing.JLabel txtFormulaEspacoPercorridoTelaVelocidadeMedia;
    private javax.swing.JLabel txtFormulaSTelaMovimentoUniforme;
    private javax.swing.JLabel txtFormulaSoTelaMovimentoUniforme;
    private javax.swing.JLabel txtFormulaTTelaMovimentoUniforme;
    private javax.swing.JLabel txtFormulaVTelaMRUVTorricelli;
    private javax.swing.JLabel txtFormulaVTelaMovimentoUniforme;
    private javax.swing.JLabel txtFormulaVoTelaMRUVTorricelli;
    private javax.swing.JLabel txtLoginTelaLogin;
    private javax.swing.JLabel txtMecanicaTelaMecanica;
    private javax.swing.JLabel txtNometxtTelaCadastro;
    private javax.swing.JLabel txtOQueVoceDesejaCalcularTelaMRUVTorricelli;
    private javax.swing.JLabel txtOQueVoceDesejaCalcularTelaMovimentoUniforme;
    private javax.swing.JLabel txtSenhaTelaCadastro;
    private javax.swing.JLabel txtSenhaTelaLogin;
    private javax.swing.JLabel txtTempoGastoTelaVelocidadeMedia;
    private javax.swing.JLabel txtTipoDeUsuarioTelaCadastro;
    private javax.swing.JLabel txtTitpoDeCalculoTelaVelocidadeMedia;
    private javax.swing.JLabel txtTopo;
    private javax.swing.JLabel txtTopoTorricelli;
    private javax.swing.JLabel txtUsuarioTelaCadastro;
    private javax.swing.JLabel txtUsuarioTelaLogin;
    private javax.swing.JLabel txtVelocidadeMediaTelaVelocidadeMedia;
    private javax.swing.JLabel txtVelocidadeMediaTituloTelaVelocidadeMedia;
    private javax.swing.JLabel txtkm1;
    private javax.swing.JLabel txtkm2;
    private javax.swing.JLabel txtkm3;
    private javax.swing.JLabel txtkm4;
    private javax.swing.JLabel txtkm5;
    private javax.swing.JLabel txtkm6;
    private javax.swing.JLabel txtkm7;
    private javax.swing.JLabel txtkm8;
    private javax.swing.JLabel txtt1;
    private javax.swing.JLabel txtt2;
    private javax.swing.JLabel txtt3;
    private javax.swing.JLabel txtt4;
    private javax.swing.JLabel txtt5;
    private javax.swing.JLabel txtt6;
    private javax.swing.JLabel txtt7;
    private javax.swing.JLabel txtt8;
    private javax.swing.JLabel velocidadeTelaVelocidadeMedia;
    private javax.swing.JLabel velocidade_1;
    private javax.swing.JLabel velocidade_2;
    private javax.swing.JButton visualizarCalculoTelaMRUVTorricelli;
    private javax.swing.JButton visualizarCalculoTelaMovUniforme;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/com/wesley/easyfisica/imagens/fisica.png")));
    }

}
