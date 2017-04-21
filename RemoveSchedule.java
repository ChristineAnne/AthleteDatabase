package athletedatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RemoveSchedule extends javax.swing.JFrame {
    
    private static final String url = "jdbc:sqlite:C:/Users/apple/Documents/CaH2O/komsaiPaMore/Komsai 127/ProjectGalore/AthleteDatabase.db";  
    
    private int day, year, hour, minute, month;
    private String time, month2;

    /**
     * Creates new form RemoveSchedule
     */
    public RemoveSchedule() {
        initComponents();
        updateTextArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        removeScheduleButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        monthComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        hourComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        minuteComboBox = new javax.swing.JComboBox<>();
        amButton = new javax.swing.JRadioButton();
        pmButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventsArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(250, 95));
        setMaximumSize(new java.awt.Dimension(748, 447));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        jLabel3.setText("Athlete Database");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel3)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(220, 220, 220));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Enter schedule:");

        removeScheduleButton.setBackground(new java.awt.Color(153, 153, 255));
        removeScheduleButton.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        removeScheduleButton.setText("Remove Schedule");
        removeScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeScheduleButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Events:");

        goBackButton.setBackground(new java.awt.Color(220, 220, 220));
        goBackButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        goBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/athletedatabase/arrow.png"))); // NOI18N
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Month");

        jLabel8.setText("Day");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Year");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        hourComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(":");

        minuteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minuteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuteComboBoxActionPerformed(evt);
            }
        });

        amButton.setBackground(new java.awt.Color(220, 220, 220));
        amButton.setText("AM");
        amButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amButtonActionPerformed(evt);
            }
        });

        pmButton.setBackground(new java.awt.Color(220, 220, 220));
        pmButton.setText("PM");
        pmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmButtonActionPerformed(evt);
            }
        });

        eventsArea.setEditable(false);
        eventsArea.setColumns(20);
        eventsArea.setRows(5);
        jScrollPane1.setViewportView(eventsArea);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBackButton))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pmButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeScheduleButton)
                .addGap(41, 41, 41))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amButton)
                                    .addComponent(pmButton)))
                            .addComponent(removeScheduleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        GUI menu = new GUI();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void removeScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeScheduleButtonActionPerformed
        if(dateValidity()){
            ArrayList<Event> eventList = new ArrayList<>();
            Connection conn = null;
            Statement stmt = null;
            try{
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection(url);
                stmt = conn.createStatement();

                String exe = "SELECT * FROM Event";
                ResultSet rs = stmt.executeQuery(exe);
                Boolean found = false;
                String schedule = "";
                
                while(rs.next()){
                    schedule = rs.getString("eventTime");
                    String rsMonth = rs.getString("eventMonth");
                    int rsDay = rs.getInt("eventDay");
                    int rsYear = rs.getInt("eventYear");
                    int rsHour = Integer.parseInt(schedule.substring(0, 2)); 
                    int rsMinute = Integer.parseInt(schedule.substring(3, 5));
                    String rsTime = schedule.substring(6, 8);
                    System.out.println("RS:    " + rsMonth + " " + rsDay + ", " + rsYear + " " + rsHour + ":" + rsMinute + " " + rsTime);
                    System.out.println("Input: " + month2 + " " + day + ", " + year + " " + hour + ":" + minute + " " + time);
                    
                    if(month2.equals(rsMonth) && (day == rsDay) && (year == rsYear) && (hour == rsHour) && (minute == rsMinute) && (time.equals(rsTime))){
                        exe = "DELETE FROM Event WHERE eventMonth = '" + month2 + "' AND eventDay = " + day + " AND eventYear = " + year + " AND eventTime = '" + schedule + "'";  
                        stmt.executeUpdate(exe);
                        System.out.println("Schedule deleted!");
                        found = true;
                        break;
                    }
                }
                if(!found){
                    JOptionPane.showMessageDialog(this, "Schedule not found!", "Error", JOptionPane.ERROR_MESSAGE);                    
                }

                updateTextArea();
                rs.close();
            }catch(SQLException e){
                System.out.println("SQLException from 'RemoveSchedule.java-removeScheduleButtonActionPerformed': " + e.getMessage());
            }catch(Exception e){
                System.out.println("Exception from 'RemoveSchedule.java-removeScheduleButtonActionPerformed': " + e.getMessage());
                e.printStackTrace();
            }finally{
                try{
                    if(stmt != null){
                        conn.close();
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please enter valid date.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeScheduleButtonActionPerformed

    private Boolean dateValidity(){
        if(month == 2 && day > 28){
           return false;
        }else if(month2.equals("April") || month2.equals("June") || month2.equals("September") || month2.equals("November")){
            if(day > 30){
                return false;
            }
        }
        return true;
    }
    
    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        RemoveMenu removeMenu = new RemoveMenu();
        this.setVisible(false);
        removeMenu.setVisible(true);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
        day = Integer.parseInt(dayComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_dayComboBoxActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        year = Integer.parseInt(yearComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void hourComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourComboBoxActionPerformed
        hour = Integer.parseInt(hourComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_hourComboBoxActionPerformed

    private void minuteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuteComboBoxActionPerformed
        minute = Integer.parseInt(minuteComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_minuteComboBoxActionPerformed

    private void amButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amButtonActionPerformed
        time = "AM";
        pmButton.setSelected(false);
    }//GEN-LAST:event_amButtonActionPerformed

    private void pmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmButtonActionPerformed
        time = "PM";
        amButton.setSelected(false);
    }//GEN-LAST:event_pmButtonActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        month = monthComboBox.getSelectedIndex() + 1;
        month2 = monthComboBox.getSelectedItem().toString();
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GUI menu = new GUI();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void updateTextArea(){
        Connection conn = null;
        Statement stmt = null;
        ArrayList<Event> eventList = new ArrayList<>();
        ArrayList<Athlete> athleteList = new ArrayList<>();
        ArrayList<Sport> sportList = new ArrayList<>();
        
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            
            String exe = "SELECT * FROM Event ORDER BY eventName ASC";
            ResultSet rs = stmt.executeQuery(exe);
            
            while(rs.next()){
                Event event = new Event(rs.getInt("athleteID"), rs.getInt("sportID"), rs.getString("eventName"), rs.getString("eventVenue"), rs.getString("eventMonth"), rs.getInt("eventDay"), rs.getInt("eventYear"), rs.getString("eventTime"));
                eventList.add(event);
            }
            
            exe = "SELECT athleteID, athleteName FROM Athlete";
            rs = stmt.executeQuery(exe);
            while(rs.next()){
                Athlete athlete = new Athlete(rs.getInt("athleteID"), rs.getString("athleteName"));
                athleteList.add(athlete);
            }
            
            exe = "SELECT sportID, sportName FROM Sport";
            rs = stmt.executeQuery(exe);
            while(rs.next()){
                Sport sport = new Sport(rs.getInt("sportID"), rs.getString("sportName"));
                sportList.add(sport);
            }
            
            rs.close();
        }catch(SQLException e){
            System.out.println("SQLException from 'AddMenu.java-viewEventButton': " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception from 'AddMenu.java-viewEventButton': " + e.getMessage());
        }finally{
            try{
                if(stmt != null){
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        
        int number = 1;
        String name = eventList.get(0).getName();
        String list = number + ". " + name + "\n";
        list += "          Athletes:\n";
        
        for(int i = 0; i < eventList.size(); i++){
            Event e = eventList.get(i);
            
            if(name.equals(e.getName())){
                list = athleteList(list, athleteList, e, sportList);
            }else{
                number++;
                list += "\n" + number + ". " + e.getName() + "\n";
                list += "          Athletes:\n";
                list = athleteList(list, athleteList, e, sportList);
            }
            name = e.getName();
        }
        
        eventsArea.setText(list);
    }
    
    private String athleteList(String list, ArrayList<Athlete> athleteList, Event e, ArrayList<Sport> sportList){
        for(Athlete a : athleteList){
            if(e.getAthleteID() == a.getID()){
                list += "               - " + a.getName() + "\n                    Schedule: " + e.getMonth() + " " + e.getDay() + ", " + e.getYear() + " " + e.getTime();
                for(Sport s : sportList){
                    if(e.getSportID() == s.getID()){
                        list += "  | |  " + s.getName() + "\n";
                    }
                }
            }
        }
        return list;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemoveSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amButton;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JTextArea eventsArea;
    private javax.swing.JButton goBackButton;
    private javax.swing.JComboBox<String> hourComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> minuteComboBox;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JRadioButton pmButton;
    private javax.swing.JButton removeScheduleButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}