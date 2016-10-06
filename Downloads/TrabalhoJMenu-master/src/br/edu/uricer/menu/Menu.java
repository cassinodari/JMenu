package br.edu.uricer.menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author aluno
 */
public class Menu {
    JFrame tela;
    JPanel painel;
    JDesktopPane desktop;
    JToolBar toolbar;
    
    
    public Menu(){
        tela = new JFrame("Trabalho Menus");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(500, 500);
        
        JMenuBar menuBar = new JMenuBar();
                
        JMenu menu = new JMenu("Menu");
        JMenuItem pSubMenu = new JMenuItem("Primeiro menu");
        JMenuItem sSubMenu = new JMenuItem("Segundo menu");
        JMenuItem tSubMenu = new JMenuItem("Terceiro menu");
        JMenuItem qSubMenu = new JMenuItem("Quarto menu");
        
        menu.add(pSubMenu);
        menu.add(sSubMenu);
        menu.add(tSubMenu);
        menu.add(qSubMenu);
        
        menuBar.add(menu);
        
        JMenu menuTrocaCor = new JMenu("Trocar cor");
        JMenuItem subVermelho = new JMenuItem("Preto");
        subVermelho.addMouseListener(new SampleMouseListener());
        
        menuTrocaCor.add(subVermelho);
        menuBar.add(menuTrocaCor);
        
        JMenu menuToolbar = new JMenu("Toolbar");        
        menuToolbar.addMenuListener(new SampleMenuListener());
        
        menuBar.add(menuToolbar);
        
        
        desktop = new JDesktopPane();
        tela.add(desktop);
        tela.setJMenuBar(menuBar);
        tela.setVisible(true);
        
    }
    class SampleMenuListener implements MenuListener{
        
        @Override
        public void menuSelected(MenuEvent e) {
            
            JInternalFrame frameInterno = new JInternalFrame("Toolbar", true, true, true, true);
            frameInterno.setBounds(100, 100, 300, 150);            
            frameInterno.setVisible(true);
            
            JButton click = new JButton("Clique");
            
            toolbar = new JToolBar();
            toolbar.add(click);
            toolbar.setSize(100, 50);
            
            JMenuBar menuBarInterno = new JMenuBar();
            menuBarInterno.add(toolbar);
            frameInterno.setJMenuBar(menuBarInterno);
            
            desktop.add(frameInterno);
            tela.setContentPane(desktop);                     
            
        }

        @Override
        public void menuDeselected(MenuEvent e) {
        }

        @Override
        public void menuCanceled(MenuEvent e) {
            System.out.println("badtrtadtdf");
        }
    }
    
    class SampleMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            //painel.setBackground(Color.red);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            desktop.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            desktop.setBackground(Color.white); 
        }

        @Override
        public void mouseEntered(MouseEvent e) {
               
        }

        @Override
        public void mouseExited(MouseEvent e) {
           // painel.setBackground(Color.white);
        }
        
    }
    
    public static void main(String[] args) {
        Menu menu = new Menu();
    }
    
}
