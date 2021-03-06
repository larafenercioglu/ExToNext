package extonextgroup.extonext_v2;
import java.sql.*;
import java.util.*;
public class DBConnector {
    //VARIABLES
    private static Connection connection;
    //CONSTRUCTOR
    //Creating a connection
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
    //CREATING A PERSON ACCOUNT
    /** It is only available for person
     * Creating a card and then inserting to the card table in the database
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
    /** It is only available for person
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
   * It is usable for both corporation and person
   * Creating a location
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
    /**It is usable for both corporation and person
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
     * @param cardNo
     * @param dueDate
     * @param cvc
     * @param cardOwner
     * @return
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
    //ADDING A CORPORATION ACCOUNT
    /**It is available for only corporation
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
     * Adding wish list with donation item's information
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
    //????l?? ????l?? al, ve onlar?? listelerken donationlar?? bast??r
    /**
     * Searching for a donation item
     * @param inputcat
     * @param input
     * @return
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
    
    //Donation Page
    //1.Showing corporation's donation_item's info and corporation's address and corporation's image
    //ArrayList(0) = image, ArrayList(1) = address, ArrayList(2) = donation item info, ArrayList(3) = donation item count
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
    //2.Donating item while adding the donated item to user_donations
    /**
     * Combining two methods in one
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
    
    //ArrayList(0) = image, ArrayList(1) = address, ArrayList(2) = info message, ArrayList(3) = e mail, ArrayList(4) = phone
    /**
     * After clicking on the donate button, next page will show the basic info 
     * @param donationItemId
     * @return
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
    //ArrayList(0) = username, ArrayList(1) = name, ArrayList(2) = e mail, ArrayList(3) = address, 
    //ArrayList(4) = phone ArrayList(5) = image
    /**
     * To see corporation info 
     * @param userName
     * @return
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
     * Showing donations that the corporation got, it will print who made the donation to the corporation, what did user donated 
     * and how much did the user donated
     * @param corpId
     * @return
     * @throws SQLException 
     */
    //3l?? 3l?? ay??r!!!!!!!!!!!!! pop upda g??stermek i??in 3 l?? 3 l?? alt alta yaz
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
    /**3l?? 3l?? b??l 
     * Donations that the corporation made, it will print who the corporation donated, what did the corporation donated and how much
     * the corporation donated
     * @param corpId
     * @return
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
     * 3L?? 3L?? BAK!!!! ??lk k??s??m o anki user ise sa?? taraf??nda olsun, 
     * @param sender
     * @param receiver
     * @return
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
    //Person Pages...
    //ArrayList(0) = user name, ArrayList(1) = name, ArrayList(2) = email,ArrayList(3) = address,
    //ArrayList(4) = phone, ArrayList(5) = image
    /**
     * @param userName
     * @return
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
     * 4L?? 4L?? AYIR!!!!
     * @param personId
     * @return
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
    /**
     * 4L?? 4L?? AYIR!!!!
     * @param userName
     * @return
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
        
    //4L?? 4L?? AYIR
    /**
     * @param userName
     * @return
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
    //4L?? 4L?? AYIR!!!
     //ArrayList(0) = details, ArrayList(1) = price, ArrayList(2) = name, ArrayList(3) = image
    /**
     * @param input
     * @param category
     * @return
     * @throws SQLException 
     */
    public ArrayList<String> sellListBuySearchCat(String input, String category) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details, sei.price,sei.name,sei.image_pathway\n" +
"FROM sell_exchange_items sei\n" +
"WHERE sei.selection='sell' AND sei.category = '" + category + "' AND sei.details REGEXP'" + input + "' AND sei.price>0 ");
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
    //4L?? 4L?? AYIR!!!
    //ArrayList(0) = details, ArrayList(1) = price, ArrayList(2) = name, ArrayList(3) = image
    /**
     * @param input
     * @return
     * @throws SQLException 
     */
    public ArrayList<String> sellListBuySearch(String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details, sei.price,sei.name,sei.image_pathway\n" +
"FROM sell_exchange_items sei\n" +
"WHERE sei.selection='sell'  AND sei.details REGEXP'" + input + "' AND sei.price>0");
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
    //3L?? 3L?? AYIR!!!!
    //ArrayList(0) = details, ArrayList(1) = name, ArrayList(2) = image
    /**
     * @param input
     * @param category
     * @return
     * @throws SQLException 
     */
    public ArrayList<String> exchangeListBuySearchCat(String input, String category) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details,sei.name,sei.image_pathway\n" +
"FROM sell_exchange_items sei\n" +
"WHERE sei.selection='exchange' AND sei.category = '" + category + "' AND sei.details REGEXP'" + input + "' AND sei.price != -20");
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
    //3L?? 3L?? AYIR!!!
    //ArrayList(0) = details, ArrayList(1) = name, ArrayList(2) = image
    /**
     * @param input
     * @return
     * @throws SQLException 
     */
    public ArrayList<String> exchangeListBuySearch(String input) throws SQLException
    {
        Statement stm = connection.createStatement();
        ResultSet st = stm.executeQuery("SELECT sei.details, sei.price,sei.name,sei.image_pathway\n" +
"FROM sell_exchange_items sei\n" +
"WHERE sei.selection='exchange' AND sei.details REGEXP'" + input + "' AND sei.price != -20");
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
    //5li 5li ay??r
    //ArrayList(0) = name, ArrayList(1) = image, ArrayList(2) = detail, ArrayList(3) = category, ArrayList(4) = price
    /**
     * @param seId
     * @return
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

    //2L?? AYIR
    //ArrayList(0) = name, ArrayList(1) = image
    /**
     * @param seId
     * @return
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
    /**
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
    /**
     * @param personId
     * @param name
     * @param image
     * @param details
     * @param category
     * @throws SQLException 
     */
    //getPersonId() metodunu kullan!!!
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
   //from here
    //get person id from user_name
    //works
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
    //get seId from image_pathway
    //works
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
    
    /**
     * @param personId
     * @param seId
     * @throws SQLException 
     */
    //works
    public void addToFavorites(String userName, String image) throws SQLException
    {
        int personId = getPersonId(userName);
        int seId = getseId(image);
        
        
        Statement stm = connection.createStatement();
        stm.executeUpdate("iNSERT iNTO user_fav_and_properties(person_id,s_e_id,fav_or_pro)\n" +
"VALUES(" + personId + "," + seId + ",'fav')");
    }
    /**
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
    /**
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
    /**
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
    
    
    /**
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
    /**
     * @param userName
     * @param passWord
     * @return
     * @throws SQLException 
     */
    public boolean logIn(String userName, String passWord) throws SQLException
    {
        if(getPassword(userName).equals(passWord))
            return true;
        else
            return false;
    }
    /**
     * @param userName
     * @return
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
    
    
  
  }