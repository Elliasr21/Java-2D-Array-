package hermosura;

import javax.swing.JOptionPane; 

public class Hotel_Reservation_GUI {

    public static void main(String[] args) {

        int hotel[][] = new int[7][5];

        int optiontrans = 0;
        String roomdata = "";
        String floordata = ""; 

        JOptionPane.showMessageDialog(null, "==== Welcome to Isla Resort Hotel ====");
        String mainOption = JOptionPane.showInputDialog("Select option: "
                + "\n\n[1] Details"
                + "\n[2] Transaction"
                + "\n\nEnter choice: ");
        int mainOption1 = Integer.parseInt(mainOption);

        switch (mainOption1) {
        case 1:
            JOptionPane.showMessageDialog(null, "--Details--\n");
            JOptionPane.showMessageDialog(null, ""
                    + "\nFounder     : Estelle Hermosura"
                    + "\nDate Founded: 2013"
                    + "\nLocation    : Davao City"
                    + "\n\nBusiness Partnerships: "
                    + "\n      Kopiko Pantropiko      Del Monte Inc."
                    + "\n      SB19                   ALAMAT");

            JOptionPane.showMessageDialog(null, "\n\n>>> Restart to go back to Main Menu <<<");
            break;

        case 2:
            do {
                JOptionPane.showMessageDialog(null, "--Transaction--\n");
                String transOption = JOptionPane.showInputDialog("[1] View all rooms\r\n"
                        + "[2] Check-in (reserve a room)\r\n"
                        + "[3] Check-out (free a room)\r\n"
                        + "[4] Exit program"
                        + "\n\nEnter choice: ");
                optiontrans = Integer.parseInt(transOption);

                switch (optiontrans) {

                case 1:
                    floordata = ""; 

                    for (int i = 6; i >= 0; i--) {
                        roomdata = "";
                        for (int j = 0; j < hotel[i].length; j++) {
                            if (hotel[i][j] == 0) {
                                roomdata += "[0] ";
                            } else {
                                roomdata += "[1] ";
                            }
                        }
                        floordata += String.format("Floor %d: %s\n", i + 1, roomdata);
                    }

                    JOptionPane.showMessageDialog(null, floordata); 
                    break;

                case 2:
                    System.out.println("== Check in ==");

                    String floorin = JOptionPane.showInputDialog("Enter floor (1-7): ");
                    int checkInFloor = Integer.parseInt(floorin);

                    String roomin = JOptionPane.showInputDialog("Enter room (1-5): ");
                    int checkInRoom = Integer.parseInt(roomin);

                    if (checkInFloor < 1 || checkInFloor > 7 || checkInRoom < 1 || checkInRoom > 5) {
                        JOptionPane.showMessageDialog(null, "Invalid floor or room number.");
                    } else if (hotel[checkInFloor - 1][checkInRoom - 1] == 1) {
                        JOptionPane.showMessageDialog(null, "Room is already occupied!");
                    } else {
                        hotel[checkInFloor - 1][checkInRoom - 1] = 1;
                        JOptionPane.showMessageDialog(null, "Successfully checked in to Floor " + checkInFloor + ", Room " + checkInRoom + ".");
                    }
                    break;

                case 3:
                    System.out.println("== Check Out ==");

                    String floorout = JOptionPane.showInputDialog("Enter floor (1-7): ");
                    int checkOutFloor = Integer.parseInt(floorout);

                    String roomout = JOptionPane.showInputDialog("Enter room (1-5): ");
                    int checkOutRoom = Integer.parseInt(roomout);

                    if (checkOutFloor < 1 || checkOutFloor > 7 || checkOutRoom < 1 || checkOutRoom > 5) {
                        JOptionPane.showMessageDialog(null, "Invalid floor or room number.");
                    } else if (hotel[checkOutFloor - 1][checkOutRoom - 1] == 0) {
                        JOptionPane.showMessageDialog(null, "Room is already vacant!");
                    } else {
                        hotel[checkOutFloor - 1][checkOutRoom - 1] = 0;
                        JOptionPane.showMessageDialog(null, "Successfully checked out from Floor " + checkOutFloor + ", Room " + checkOutRoom + ".");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "\nThank you for doing business with us!");
                    break;
                }

            } while (optiontrans != 4);
        }
    }
}
