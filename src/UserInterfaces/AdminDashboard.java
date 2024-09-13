package UserInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Hotel Management System Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        buttonPanel.setBackground(Color.WHITE);

        JButton roomButton = createButton("Hotel Rooms", Color.decode("#4CAF50")); 
        JButton categoryButton = createButton("Hotel Categories", Color.decode("#2196F3")); 
        JButton reservationButton = createButton("Hotel Reservations", Color.decode("#FFC107")); 
        JButton customersButton = createButton("Hotel Customers", Color.decode("#FF5722")); 

    
        buttonPanel.add(roomButton);
        buttonPanel.add(categoryButton);
        buttonPanel.add(reservationButton);
        buttonPanel.add(customersButton);

       
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

      
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }


    private JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(150, 50)); 
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16)); 
        button.setFocusPainted(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                openManagementUI(text);
            }
        });
        return button;
    }


    private void openManagementUI(String buttonText) {
        switch (buttonText) {
            case "Hotel Rooms":
                new RoomUI(); 
                break;
            case "Hotel Categories":
                new RoomCategoryUI(); 
                break;
            case "Hotel Reservations":
                new ReservationUI(); 
                break;
            case "Hotel Customers":
                new CustomerUI(); 
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        new AdminDashboard();
    }
}
