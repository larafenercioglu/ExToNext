package extonextgroup.extonext_v2;
import java.sql.*;
import java.util.*;
public class DBConnector {
    
    //VARIABLES
    private static Connection connection;
    
    /**
     * Constructor 
     * It creates a connection to our server, this way we will be able to reach our tables
     */
    public DBConnector()
    {
        String host = "jdbc:mysql://doadmin:dqayi5e1fec355f0@db-mysql-fra1-36875-do-user-6871507-0.db.ondigitalocean.com:25060/defaultdb?ssl-mode=REQUIRED";
        String username = "doadmin";
        String password = "dqayi5e1fec355f0";
        try {
            connection = DriverManager.getConnection(host, username, password);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
    /**
     * This method checks whether the userName has been used before or not.
     * @param userName
     * @return boolean
     * @throws SQLException 
     */
    public boolean isAlreadySignUp(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.user_name \n" +
        "FROM User u\n" +
        "WHERE u.user_name = '" + userName +"'");
        ArrayList<String> username = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.user_name");
            username.add(first);
        }
        //if arraylist's size is not 0 it is already sign
        if( username.size() != 0  )
        {
            return true;
        }
        else{
            return false;
        }
        
    }
    /**
     * This method returns 1 or 2 depending on the userName's type
     * @param userName
     * @return int
     * @throws SQLException 
     */
    public int personOrCorporation(String userName) throws SQLException
    {
        int typeId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT u.type_id\n" +
        "FROM User u\n" +
        "WHERE u.user_name ='" + userName + "'");
        while(data.next())
        {
            typeId = data.getInt("type_id");
        }
        return typeId;
    }
    /** 
     * Creating a card and then inserting to the card table in the database
     * This method will only be used while creating a person account
     * @param cardNo
     * @param dueDate
     * @param cvc
     * @param cardOwner
     * @throws SQLException 
     */
    private void createCard(String cardNo, String dueDate, int cvc, String cardOwner) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO card(card_no,due_date,cvc,card_owner)\n" +
         "VALUES ('" + cardNo +"','"+ dueDate +"',"+ cvc+",'"+ cardOwner +"')");
    }
    /** 
     * Adding a person to person table in the database
     * @param userName
     * @param cardId
     * @throws SQLException 
     */
    private void addOneToPerson(String userName, int cardId) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO person(rate,user_name,card_id)\n" +
        "VALUES(DEFAULT,'" + userName + "'," + cardId + ")");
    }
    
  /**
   * Creating a location
   * This method will be used for both while creating a corporation and person
   * @param city
   * @param province
   * @throws SQLException 
   */ 
    private void createLocation(String city, String province) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO location(city,province)" +
        "VALUES ('" + city + "','" + province + "')");
    }
    /**
     * Adding a corporation to the User table in the database
     * @param userName
     * @param name
     * @param password
     * @param email
     * @param address
     * @param phone
     * @param locationId
     * @param typeId
     * @param image
     * @throws SQLException 
     */
    private void addToUser(String userName, String name, String password, String email, String address, String phone, int locationId, int typeId, String image) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("insert into User (user_name,name,password,e_mail,address,phone,location_id,type_id,image_pathway)\n" +
        "VALUES ('" + userName + "','" + name + "','" + password + "','" + email + "','" + address + "','" + phone + "'," + locationId + "," + typeId + ",'" + image + "')");
    }
    /**
     * Creating a corporation as a user account
     * @param userName
     * @param city
     * @param province
     * @param name
     * @param password
     * @param email
     * @param address
     * @param phone
     * @param image
     * @param infoMessage
     * @throws SQLException 
     */
    public void createCorporationUser(String userName,String city, String province,String name, String password, String email, 
            String address, String phone, String image, String infoMessage) throws SQLException
    {
        try{
            createLocation(city, province);
        int locationID = getLocationId(city, province);
        addToUser(userName,name,password,email,address,phone,locationID,2,image);
        addOneToCorporation(infoMessage, userName);
        }
        catch(Exception e)
        {
            int locationID2 = getLocationId(city, province);
        addToUser(userName,name,password,email,address,phone,locationID2,2,image);
        addOneToCorporation(infoMessage, userName);
        }

    }
    /**
     * Creating a person as a user account
     * @param cardNo
     * @param dueDate
     * @param cvc
     * @param cardOwner
     * @param userName
     * @param city
     * @param province
     * @param name
     * @param password
     * @param email
     * @param address
     * @param phone
     * @param image
     * @throws SQLException 
     */
    public void createPersonUser(String cardNo, String dueDate, int cvc, String cardOwner,String userName,
            String city, String province,String name, String password, String email, String address, String phone, 
           String image) throws SQLException
    {
            try{
                createLocation(city, province);
            int locationID = getLocationId(city, province);
            addToUser(userName,name,password,email,address,phone,locationID,1,image);
            createCard(cardNo, dueDate, cvc, cardOwner);
        int cardID = getCardId(cardNo, dueDate, cvc, cardOwner);
        addOneToPerson(userName, cardID);
        }
        catch(Exception e)
        {
            int locationID = getLocationId(city, province);
        addToUser(userName,name,password,email,address,phone,locationID,1,image);
        createCard(cardNo, dueDate, cvc, cardOwner);
        int cardID = getCardId(cardNo, dueDate, cvc, cardOwner);
        addOneToPerson(userName, cardID);
        }
        
    }
    /**
     * Getting the user's image
     * @param userName
     * @return String
     * @throws SQLException 
     */
    public String userImage(String userName) throws SQLException
    {
        String image = "";
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT u.image_pathway\n" +
        "FROM User u\n" +
        "WHERE u.user_name= '" + userName + "'");
        while(data.next())
        {
            image = data.getString("image_pathway");
        }
        return image;
    }
    /**
     * Getting the item's image
     * @param itemId
     * @return String
     * @throws SQLException 
     */
    public String itemImage(int itemId) throws SQLException
    {
        String image = "";
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT sfi.image_pathway\n" +
        "FROM sell_exchange_items sfi\n" +
        "WHERE sfi.s_e_id = " + itemId);
        while(data.next())
        {
            image = data.getString("sfi.image_pathway");
        }
        return image;
    }
    
    /**
     * Getting the card's id 
     * @param cardNo
     * @param dueDate
     * @param cvc
     * @param cardOwner
     * @return int
     * @throws SQLException 
     */
    public int getCardId(String cardNo, String dueDate, int cvc, String cardOwner) throws SQLException
    {
        int cardId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT c.card_id\n" +
        "FROM card c\n" +
        "WHERE c.card_no = '" + cardNo + "' and c.due_date='" + dueDate + "' and c.cvc = " + cvc + " and  c.card_owner ='" + cardOwner + "'\n" +
        "LiMiT 1");
        while(data.next())
        {
            cardId = data.getInt("card_id");
        }
        return cardId;
    }
   /**
     * Getting the location's id
     * @param city
     * @param province
     * @return
     * @throws SQLException 
     */
    public int getLocationId(String city, String province) throws SQLException
    {
        int locationId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT l.location_id\n" +
        "FROM location l\n" +
        "WHERE l.province = '" + province + "' and l.city='" + city + "'\n" +
        "LiMiT 1");
        while(data.next())
        {
            locationId = data.getInt("location_id");
        }
        return locationId;
    }
    /**
     * Creating a corporation
     * @param infoMessage
     * @param userName
     * @throws SQLException 
     */
   private void addOneToCorporation(String infoMessage, String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO corporation(info_message,user_name)\n" +
        "VALUES('" + infoMessage + "','" + userName + "')");
    }
    /**
     * Helper method for adding wish list method with donation item's information and with the corporation's id 
     * @param c_id 
     * @param info
     * @param category
     * @param count
     * @throws SQLException 
     */
    private void addWishList2( int c_id, String info, String category,int count) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO donation_items(c_id,info,category,count)\n" +
        "VALUES('" + c_id + "','" + info + "','" + category + "','" + count + "')");
    }
    /**
     * Creating a wish list with the item's information
     * @param userName
     * @param info
     * @param category
     * @param count
     * @throws SQLException 
     */
    public void addWishList1( String userName, String info, String category, int count ) throws SQLException
    {
        int c_id = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT c_id\n" +
        "FROM corporation\n" +
        "WHERE user_name ='" + userName + "'");
        while(data.next())
        {
            c_id = data.getInt("c_id");
        }
        addWishList2(c_id,info,category,count);
        
    }
    /**
     * Searching for a donation item while using category part and the search bar
     * @param inputcat
     * @param input
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> listDonationSearchBar(String inputcat,String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery("SELECT di.d_item_id,di.info,di.category,u.address \n" +
        "FROM donation_items di\n" +
        "JOiN corporation c\n" +
        "	ON c.c_id = di.c_id \n" +
        "JOiN User u\n" +
        "	ON u.user_name = c.user_name \n" +
        "WHERE\n" +
        "    di.count > 0  AND\n" +
        "    (di.category = '" + inputcat + "'AND di.info REGEXP '" + input + "')");
        
        ArrayList<String> results = new ArrayList<>();
        while(rs.next())
        {
            String first = rs.getString("info");
            String second = rs.getString("category");
            String third = rs.getString("address");
            String fourth = rs.getString("di.d_item_id");
            results.add(second);
            results.add(first);
            results.add(third);  
            results.add(fourth);
        }
        return results;
    }
    /**
     * Searching for a donation item while using the search bar only
     * @param input
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> listDonationOnlySearchBar(String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet rs = stm.executeQuery("SELECT di.d_item_id, di.info, di.category,u.address FROM donation_items di JOiN corporation c ON c.c_id = di.c_id JOiN User u ON u.user_name = c.user_name\n" + 
        " WHERE (di.count > 0) AND (di.info REGEXP '" + input + "')");
        
        ArrayList<String> results = new ArrayList<>();
        while(rs.next())
        {
            String first = rs.getString("category");
            String second = rs.getString("info");
            String third = rs.getString("address");
            String fourth = rs.getString("di.d_item_id");
            results.add(second);
            results.add(first);
            results.add(third);   
            results.add(fourth);
        }
        return results;
    }
    /**
     * Getting the donation item's details while using donation item's id
     * @param donationItemId
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> donationItemDetail(int donationItemId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.image_pathway, u.address, di.info, di.count\n" +
        "FROM corporation c\n" +
        "JOiN donation_items di\n" +
        "	ON c.c_id = di.c_id \n" +
        "JOiN User u\n" +
        "		ON u.user_name = c.user_name\n" +
        "WHERE di.d_item_id = " + donationItemId);
        ArrayList<String> result = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.image_pathway");
            String second = st.getString("u.address");
            String third = st.getString("di.info");
            String fourth = st.getString("di.count");
            result.add(first);
            result.add(second);
            result.add(third);
            result.add(fourth);
        }
        return result;
        
    }
    /**
     * Combining two methods in one; addToUserDonations and updateCount
     * @param donationItemId
     * @param userName
     * @param count
     * @throws SQLException 
     */
    public void donate(int donationItemId,String userName, int count) throws SQLException
    {
        addToUserDonations(userName,donationItemId,count);
        updateCount(donationItemId); 
    }
    /**
     * Updating the donation item's count after someone's donation
     * @param donationItemId
     * @throws SQLException 
     */
    private void updateCount(int donationItemId) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("UPDATE donation_items di\n" +
        "SET di.count = di.count -  (\n" +
        "				SELECT ud.count\n" +
        "				FROM user_donation ud\n" +
        "                WHERE ud.d_item_id = " + donationItemId + "\n" +
        "                ORDER BY ud.donation_id desc\n" +
        "                LiMiT 1\n" +
        "                )\n" +
        "WHERE di.d_item_id = " + donationItemId);
    }
    /**
     * Adding the made donation to user_donations
     * @param userName
     * @param d_item_id
     * @param count
     * @throws SQLException 
     */
    private void addToUserDonations(String userName, int d_item_id, int count) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO user_donation(user_name,d_item_id,count)\n" +
        "VALUES('" + userName + "'," + d_item_id + "," + count + ")");
    }
    /**
     * After clicking on the donate button, next page will show the basic info of the donation and the corporation
     * @param donationItemId
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> afterDonation(int donationItemId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.image_pathway, u.address, c.info_message, u.e_mail, u.phone\n" +
        "FROM corporation c\n" +
        "JOiN donation_items di\n" +
        "	ON c.c_id = di.c_id \n" +
        "JOiN User u\n" +
        "		ON u.user_name = c.user_name\n" +
        "WHERE di.d_item_id = " + donationItemId);
        ArrayList<String> itemInfo = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.image_pathway");
            String second = st.getString("u.address");
            String third = st.getString("c.info_message");
            String fourth = st.getString("u.e_mail");
            String fifth = st.getString("u.phone");
            itemInfo.add(first);
            itemInfo.add(second);
            itemInfo.add(third);
            itemInfo.add(fourth);
            itemInfo.add(fifth);
        }
        return itemInfo; 
    }
    /**
     * To see corporation info 
     * @param userName
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> seeCorporationInfo(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT user_name, name, e_mail,address,phone, image_pathway\n" +
        "FROM User u \n" +
        "WHERE u.user_name = '" + userName + "'");
        ArrayList<String> corpInfo = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("user_name");
            String second = st.getString("name");
            String third = st.getString("e_mail");
            String fourth = st.getString("address");
            String fifth = st.getString("phone");
            String sixth = st.getString("image_pathway");
            corpInfo.add(first);
            corpInfo.add(second);
            corpInfo.add(third);
            corpInfo.add(fourth);
            corpInfo.add(fifth);
            corpInfo.add(sixth);
        }
        return corpInfo; 
    }
    /**
     * This method returns an ArrayList that contains the corporation's donations that other corporations made to them
     * @param userName
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> donationsIGet1(String userName) throws SQLException
    {
        int cId = 0;
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT c.c_id\n" +
        "FROM corporation c\n" +
        "JOiN User u\n" +
        "	ON u.user_name = c.user_name\n" +
        "WHERE u.user_name = '" + userName + "'");
        while(st.next())
        {
            cId = st.getInt("c.c_id");
        }
        return donationsIGet2(cId); 
    }
    /**
     * A helper method for the method called donationsIGet while getting the corporation's id
     * @param corpId
     * @return ArrayList<String>
     * @throws SQLException 
     */
    private ArrayList<String> donationsIGet2(int corpId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT ud.user_name, di.info,ud.count\n" +
        "FROM user_donation ud\n" +
        "JOiN donation_items di\n" +
        "	ON ud.d_item_id = di.d_item_id\n" +
        "WHERE di.c_id = " + corpId);
        ArrayList<String> donationsIGet = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("ud.user_name");
            String second = st.getString("di.info");
            String third = st.getString("ud.count");
            donationsIGet.add(first);
            donationsIGet.add(second);
            donationsIGet.add(third);
        }
        return donationsIGet; 
    }
    /**
     * This method will show the donations that the corporation made
     * @param corpId
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> myDonations(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.name, di.info, ud.count\n" +
        "FROM user_donation ud\n" +
        "JOiN donation_items di \n" +
        "	ON ud.d_item_id = di.d_item_id\n" +
        "JOiN corporation c\n" +
        "	ON c.c_id = di.c_id\n" +
        "JOiN User u\n" +
        "	ON u.user_name = c.user_name\n" +
        "WHERE ud.user_name = '" + userName + "'");
        ArrayList<String> myDonations = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.name");
            String second = st.getString("di.info");
            String third = st.getString("ud.count");
            myDonations.add(first);
            myDonations.add(second);
            myDonations.add(third);
        }
        return myDonations; 
    }
    /**
     * This method will return the current user's message receivers (who the user sent message
     * @param sender
     * @param receiver
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> getReceivers(String sender) throws SQLException{
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("Select receiver\n" +
                "from message \n" +
                "where sender ='" + sender + "'");
        ArrayList<String> receivers = new ArrayList<>();
        while(data.next()){
            String receive = data.getString("receiver");
            if(!receivers.contains(receive)){
               receivers.add(receive); 
            }
        }
        return receivers;
    }
    /**
     * This method will show the user's messages
     * @param sender
     * @param receiver
     * @return
     * @throws SQLException 
     */
    public ArrayList<String> showMessages(String sender, String receiver) throws SQLException {
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("select *\n" +
        "from message m\n" +
        "	where (m.sender = '"+sender+"' AND m.receiver = '" + receiver + "') OR (m.sender = '" + receiver + "' AND m.receiver = '" + sender + "') \n" +
        "    order by m_id");
        ArrayList<String> messages = new ArrayList<>();
        while(data.next()){
            String message = data.getString("m.messages");
            String send = data.getString("m.sender");
            String receive = data.getString("m.receiver");
            messages.add(send);
            messages.add(receive);
            messages.add(message);
        }
        return messages;
    }
    /**
     * This method will send a message from the current user to another user
     * @param sender
     * @param receiver
     * @param messages
     * @throws SQLException 
     */
    public void sendMessage(String sender, String receiver, String messages) throws SQLException {
        Statement stm = connection.createStatement();
        stm.executeUpdate("INSERT INTO  message ( sender, receiver, messages)\n" +
                "VALUES ('" + sender + "','" + receiver + "','" + messages + "')");
    }
    /**
     * This method will show the user whose type is person's information
     * @param userName
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> seePersonInfo(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.user_name, name, e_mail,address,phone, image_pathway\n" +
        "FROM User u \n" +
        "WHERE u.user_name = '" + userName + "'");
        ArrayList<String> personInfo = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.user_name");
            String second = st.getString("name");
            String third = st.getString("e_mail");
            String fourth = st.getString("address");
            String fifth = st.getString("phone");
            String sixth = st.getString("image_pathway");
            personInfo.add(first);
            personInfo.add(second);
            personInfo.add(third);
            personInfo.add(fourth);
            personInfo.add(fifth);
            personInfo.add(sixth);
        }
        return personInfo; 
    }
    /**
     * This mwthod will show user's uploaded items
     * @param userName
     * @return ArrayList<String>
     * @throws SQLException 
     */
    public ArrayList<String> myUploads1(String userName) throws SQLException
    {
        int pId = 0;
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT p.person_id\n" +
        "FROM person p\n" +
        "JOiN User u\n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE p.user_name = '" + userName + "'");
        while(st.next())
        {
            pId = st.getInt("p.person_id");
        }
        return myUploads2(pId); 
    }
    /**
     * This is a helper method for printing the myUploads ArrayList
     * @param personId
     * @return ArrayList<String>
     * @throws SQLException 
     */
    private ArrayList<String> myUploads2(int personId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT name, selection,details,price\n" +
        "FROM sell_exchange_items\n" +
        "WHERE person_id = " + personId);
        ArrayList<String> myUploads = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("name");
            String second = st.getString("selection");
            String third = st.getString("details");
            String fourth = st.getString("price");
            myUploads.add(first);
            myUploads.add(second);
            myUploads.add(third);
            myUploads.add(fourth);
        }
        return myUploads; 
    }
    /** This method will add the properties that user bought previously
     * @param userName
     * @return arraylist string that includes the attributes of properties
     * @throws SQLException 
     */
    public ArrayList<String> myProperties(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.name, sei.selection,sei.details,sei.price\n" +
        "FROM user_fav_and_properties ufp\n" +
        "JOiN sell_exchange_items sei\n" +
        "	ON sei.s_e_id = ufp.s_e_id\n" +
        "JOiN person p\n" +
        "	ON p.person_id = ufp.person_id\n" +
        "JOiN User u\n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE u.user_name = '" + userName + "' and ufp.fav_or_pro = 'pro'");
        ArrayList<String> myProperties = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.name");
            String second = st.getString("sei.selection");
            String third = st.getString("sei.details");
            String fourth = st.getString("sei.price");
            myProperties.add(first);
            myProperties.add(second);
            myProperties.add(third);
            myProperties.add(fourth);
        }
        return myProperties;    
    } 
    /** This method will add items which are selected as fav by user
     * @param userName
     * @return arraylist string which includes the attributes of fav items
     * @throws SQLException 
     */
    public ArrayList<String> myFavorites(String userName) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.name, sei.selection,sei.details,sei.price\n" +
        "FROM user_fav_and_properties ufp\n" +
        "JOiN sell_exchange_items sei\n" +
        "	ON sei.s_e_id = ufp.s_e_id\n" +
        "JOiN person p\n" +
        "	ON p.person_id = ufp.person_id\n" +
        "JOiN User u\n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE u.user_name = '" + userName + "' and ufp.fav_or_pro = 'fav'");
        ArrayList<String> myFavorites = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.name");
            String second = st.getString("sei.selection");
            String third = st.getString("sei.details");
            String fourth = st.getString("sei.price");
            myFavorites.add(first);
            myFavorites.add(second);
            myFavorites.add(third);
            myFavorites.add(fourth);
        }
        return myFavorites; 
    }
    /** This method enable to search sell items by using search bar and categories that are selected before
     * @param input
     * @param category
     * @return array list as the attributes of listed items
     * @throws SQLException 
     */
    public ArrayList<String> sellListBuySearchCat(String input, String category) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details, sei.price,sei.name,sei.image_pathway\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.selection='sell' AND sei.category = '" + category + "' AND sei.details REGEXP'" + input + "' AND sei.price>0 \n" + "LIMIT 4");
        ArrayList<String> sellSearchCat = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.details");
            String second = st.getString("sei.price");
            String third = st.getString("sei.name");
            String fourth = st.getString("sei.image_pathway");
            sellSearchCat.add(first);
            sellSearchCat.add(second);
            sellSearchCat.add(third);
            sellSearchCat.add(fourth);
        }
        return sellSearchCat; 
    }
    /** This method enable to search sell items by using only search bar 
     * @param input
     * @return string array list as the attributes of the listed items
     * @throws SQLException 
     */
    public ArrayList<String> sellListBuySearch(String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details, sei.price,sei.name,sei.image_pathway\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.selection='sell'  AND sei.details REGEXP'" + input + "' AND sei.price>0 \n" + "LIMIT 4");
        ArrayList<String> sellSearch= new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.details");
            String second = st.getString("sei.price");
            String third = st.getString("sei.name");
            String fourth = st.getString("sei.image_pathway");
            sellSearch.add(first);
            sellSearch.add(second);
            sellSearch.add(third);
            sellSearch.add(fourth);
        }
        return sellSearch;
    }
    /** This method enable to search exchange items by using search bar and categories that are selected before
     * @param input
     * @param category
     * @return string array list as the attributes of the listed items
     * @throws SQLException 
     */
    public ArrayList<String> exchangeListBuySearchCat(String input, String category) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details,sei.name,sei.image_pathway\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.selection='exchange' AND sei.category = '" + category + "'\n" +
        "AND sei.details REGEXP'" + input + "'\n" +
        "AND sei.price is NULL \n" + "LIMIT 4");
        ArrayList<String> exchangeSearchCat = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.details");
            String second = st.getString("sei.name");
            String third = st.getString("sei.image_pathway");
            exchangeSearchCat.add(first);
            exchangeSearchCat.add(second);
            exchangeSearchCat.add(third);
        }
        return exchangeSearchCat;
    }
    /**This method enable to search exchange items by using only search bar 
     * @param input
     * @return string array list as the attributes of the listed items
     * @throws SQLException 
     */
    public ArrayList<String> exchangeListBuySearch(String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details,sei.name,sei.image_pathway\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.selection='exchange'" +
        "AND sei.details REGEXP'" + input + "'\n" +
        "AND sei.price is NULL \n" + "LIMIT 4");
        ArrayList<String> exchangeSearch = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.details");
            String second = st.getString("sei.name");
            String third = st.getString("sei.image_pathway");
            exchangeSearch.add(first);
            exchangeSearch.add(second);
            exchangeSearch.add(third);
        }
        return exchangeSearch;
    }
    /** This method will enable to get the item info by using sell exchange item id
     * @param seId
     * @return string array list as the attributes of the item
     * @throws SQLException 
     */
    private ArrayList<String> itemInfo2(int seId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.name,sei.image_pathway, sei.details, sei.category,sei.price\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.s_e_id = " + seId);
        ArrayList<String> itemInformation = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("sei.name");
            String second = st.getString("sei.image_pathway");
            String third = st.getString("sei.details");
            String fourth = st.getString("sei.category");
            String fifth = st.getString("sei.price");
            itemInformation.add(first);
            itemInformation.add(second);
            itemInformation.add(third);
            itemInformation.add(fourth);
            itemInformation.add(fifth);
        }
        return itemInformation;
    }
    /** This method will use the image pathway to get the sell exchange item and then use iteminfo2 method
     * @param image
     * @return string array list as the attributes of the item
     * @throws SQLException 
     */
     public ArrayList<String> itemInfo1(String image) throws SQLException
    {
        int first = 0;
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.s_e_id\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.image_pathway ='"+ image +"'");
       
        while(st.next())
        {
            first = st.getInt("sei.s_e_id");
        }
      return itemInfo2(first);
    }

    /** This method will get the person information by using sell and exchange item id
     * @param seId
     * @return string array that includes the attributes of person
     * @throws SQLException 
     */
    private ArrayList<String> personInfo2(int seId) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT u.name, u.image_pathway\n" +
        "FROM User u\n" +
        "JOiN person p \n" +
        "	ON p.user_name = u.user_name\n" +
        "WHERE p.person_id =\n" +
        "	(SELECT person_id\n" +
        "	FROM  sell_exchange_items sei\n" +
        "	WHERE sei.s_e_id =" + seId + ")");
        ArrayList<String> personInformation = new ArrayList<>();
        while(st.next())
        {
            String first = st.getString("u.name");
            String second = st.getString("u.image_pathway");
            personInformation.add(first);
            personInformation.add(second);
        }
        return personInformation;
    }
    /** This method will get the person information by using image pathway and personInfo2 method
     * @param image
     * @return string array list that includes the attributes of person
     * @throws SQLException 
     */
    public ArrayList<String> personInfo1(String image) throws SQLException
    {
              int first = 0;
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.s_e_id\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.image_pathway ='"+ image +"'");
       
        while(st.next())
        {
            first = st.getInt("sei.s_e_id");
        }
        return personInfo2(first);
    }
    /** This method will upload the sell item by using method uploadsellitem2
     * @param personId
     * @param name
     * @param image
     * @param details
     * @param category
     * @param price
     * @throws SQLException 
     */
    public void uploadSellItem1(String userName,String name, String image, String details, String category, String price) throws SQLException
    {
        int pId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT  p.person_id\n" +
        "FROM person p\n" +
        "JOiN User u \n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE u.user_name = '" + userName + "'");
        while(data.next())
        {
            pId = data.getInt("p.person_id");
        }
        uploadSellItem2(pId, name, image, details, category, price);
    }
    /**This method will uplad the sell item 
     * @param personId
     * @param name
     * @param image
     * @param details
     * @param category
     * @param price
     * @throws SQLException 
     */
    private void uploadSellItem2(int personId, String name, String image, String details, String category, String price) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO sell_exchange_items(person_id,name,image_pathway,selection,details,category,price,location_id)\n" +
        "VALUES (" + personId + ",'" + name + "','" + image + "','sell','" + details + "','" + category + "'," + price + ",\n" +
        "		(SELECT location_id\n" +
        "        FROM User u\n" +
        "	    JOiN person p\n" +
        "			ON u.user_name = p.user_name\n" +
        "		WHERE p.person_id = " + personId + ")\n" +
        "        )");
    }
    /**This method will upload the exchange item by using uploadExchangeItem2 method
     * @param userName
     * @param name
     * @param image
     * @param details
     * @param category
     * @throws SQLException 
     */
    public void uploadExchangeItem1(String userName,String name, String image, String details, String category) throws SQLException
    {
        int pId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT  p.person_id\n" +
        "FROM person p\n" +
        "JOiN User u \n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE u.user_name = '" + userName + "'");
        while(data.next())
        {
            pId = data.getInt("p.person_id");
        }
        uploadExchangeItem2(pId, name, image, details, category);
    }
    /** This method will upload the exchange item
     * @param personId
     * @param name
     * @param image
     * @param details
     * @param category
     * @throws SQLException 
     */
    private void uploadExchangeItem2(int personId, String name, String image, String details, String category) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO sell_exchange_items(person_id,name,image_pathway,selection,details,category,location_id)\n" +
        "VALUES (" + personId + ",'" + name + "','" + image + "','exchange','" + details + "','" + category + "',\n" +
        "		(SELECT location_id\n" +
        "        FROM User u\n" +
        "	    JOiN person p\n" +
        "			ON u.user_name = p.user_name\n" +
        "		WHERE p.person_id = " + personId + ")\n" +
        "        )");
    }
/**This method will get the person id method by using userName information that is given
 * @param userName
 * @return int as pId (person id)
 * @throws SQLException 
 */
    public int getPersonId(String userName) throws SQLException
    {
      int pId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT p.person_id\n" +
        "FROM person p\n" +
        "JOiN User u\n" +
        "	ON u.user_name = p.user_name\n" +
        "WHERE u.user_name ='"+ userName +"'");
        while(data.next())
        {
            pId = data.getInt("p.person_id");
    }
        return pId;
    }
    /**This method will get the sell-exchange item id by using image pathway information that is given 
     * @param image
     * @return int as the get sell-exchange item id
     * @throws SQLException 
     */
    public int getseId(String image) throws SQLException
    {
          int seId = 0;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT sei.s_e_id\n" +
        "FROM sell_exchange_items sei\n" +
        "WHERE sei.image_pathway ='"+ image +"'");
        while(data.next())
        {
            seId = data.getInt("sei.s_e_id");
    }
        return seId  ;
    }
    
    /**This method will add selected item to favourites
     * @param personId
     * @param seId
     * @throws SQLException 
     */
    public void addToFavorites(String userName, String image) throws SQLException
    {
        int personId = getPersonId(userName);
        int seId = getseId(image);
        
        
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO user_fav_and_properties(person_id,s_e_id,fav_or_pro)\n" +
        "VALUES(" + personId + "," + seId + ",'fav')");
    }
    /** This method will change the current situation of items from fav to property when user bought it
     * @param personId
     * @param seId
     * @throws SQLException 
     */
    private void turnFavoriteToProperty(int personId, int seId) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("UPDATE user_fav_and_properties ufp\n" +
        "		SET ufp.fav_or_pro ='pro'\n" +
        "        WHERE ufp.fav_or_pro = 'fav' and ufp.s_e_id = " + seId + " and ufp.person_id =" + personId);
    }
    /** This method will add item to property when user bought it
     * @param personId
     * @param seId
     * @throws SQLException 
     */
    private void addToProperty(int personId, int seId) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO user_fav_and_properties(person_id,s_e_id,fav_or_pro)\n" +
        "VALUES(" + personId + "," + seId + "," + "'pro')");
    }
    /** This method will enable total buying process by using addToProperty and turnFavouriteToProperty method
     * @param personId
     * @param seId
     * @throws SQLException 
     */
    public void buyAndExchange(String userName, String image) throws SQLException
    {
        int personId = getPersonId(userName);
        int seId = getseId(image);
        
        ArrayList<String> favList = new ArrayList<String>();
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT s_e_id \n" +
        "FROM user_fav_and_properties ufp\n" +
        "WHERE ufp.s_e_id = " + seId + " and ufp.person_id = " + personId + " and ufp.fav_or_pro = 'fav'");
        while(st.next())
        {
            String first = st.getString("s_e_id");
            favList.add(first);
        }
        //If arraylist is empty, add item as property
        if(favList.size() == 0)
        {
            addToProperty(personId, seId);
        }
        else
        {
            turnFavoriteToProperty(personId, seId);
        }
        removeFromItems(seId);
    }
    
    /**This method will change the price of the items that are bought, so in searching they cannot be listed
     * @param seId
     * @throws SQLException 
     */
    private void removeFromItems(int seId) throws SQLException
    {
        Statement stm = connection.createStatement();
        stm.executeUpdate("UPDATE sell_exchange_items sei\n" +
                          "SET sei.price = -20\n" +
                          "WHERE s_e_id ="+ seId);
    }
    /**This method will control whether the password that is entered in login page is true or not
     * @param userName
     * @param passWord
     * @return the boolean values
     * @throws SQLException 
     */
    public boolean logIn(String userName, String passWord) throws SQLException
    {
        if(getPassword(userName).equals(passWord))
            return true;
        else
            return false;
    }
    /** This method will get the password by using user name information that are given
     * @return String password
     * @throws SQLException 
     */
    public String getPassword(String userName) throws SQLException
    {
        String password = null;
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("SELECT password\n" +
        "FROM User\n" +
        "WHERE user_name ='" + userName + "'\n" +
        "LiMiT 1");
        while(data.next())
        {
            password = data.getString("password");
        }
        return password;
    }
    /**This method will get the user name by using donation id information that is given
     * @param donationId
     * @return String userName
     * @throws SQLException 
     */
    public String getUserNameFromDId(int donationId) throws SQLException
    {
        String userName = "";
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("Select user_name\n" +
        "from corporation c\n" +
        "Join donation_items d\n" +
        "on c.c_id = d.c_id\n" +
        "where d.d_item_id = " + donationId + "\n" +
        "limit 1");
        while(data.next())
        {
            userName = data.getString("user_name");
        }
        return userName;
    }
    /**This method will get user name by using sell exchange item id that is given
     * @param seId
     * @return String userName
     * @throws SQLException 
     */
    public String getUserNameFromSEId(int seId) throws SQLException
    {
        String userName = "";
        Statement stm = connection.createStatement();
        ResultSet data = stm.executeQuery("Select user_name\n" +
        "from person p\n" +
        "Join sell_exchange_items se\n" +
        "on p.person_id = se.person_id\n" +
        "where se.s_e_id = " + seId + "\n" +
        "limit 1");
        while(data.next())
        {
            userName = data.getString("user_name");
        }
        return userName;
    }
  }
            
            
            