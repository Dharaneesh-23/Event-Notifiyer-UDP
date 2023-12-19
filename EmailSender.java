/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package npl_project_test;

/**
 *
 * @author Dell
 */
import javax.mail.*;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListLabelsResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Set;
public class EmailSender {

    /*private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT,GsonFactory jsonfactory)
      throws IOException {
    // Load client secrets.
    InputStream in = EmailSender.class.getResourceAsStream("/...json");
    if (in == null) {
      throw new FileNotFoundException("Resource not found: " + "/...json");
    }
    GoogleClientSecrets clientSecrets =
        GoogleClientSecrets.load(jsonfactory, new InputStreamReader(in));

    // Build flow and trigger user authorization request.
    GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
        HTTP_TRANSPORT, jsonfactory, clientSecrets,Set.of(GmailScopes.GMAIL_SEND))
        .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(Paths.get("tokens"))))
        .setAccessType("offline")
        .build();
    LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
    Credential credential = new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    //returns an authorized Credential object.
    return credential;
  }
    
    public void sendmail(String subject,String message){
        
    }*/
    
    public static void main(String[] args) {
        String to = "tiruppurkumar1969@gmail.com";
        String from = "rpddharaneesh@gmail.com";
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.transport.protocol", "smtp");     
        properties.setProperty("mail.host", "smtp.gmail.com");  
        properties.put("mail.smtp.auth", "true");  
        properties.put("mail.smtp.port", "465");  
        properties.put("mail.debug", "true");  
        properties.put("mail.smtp.socketFactory.port", "465");  
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
        properties.put("mail.smtp.socketFactory.fallback", "false");
        properties.put("mail.smtp.ssl.protocols","TLSv1.2");
        Session session = Session.getInstance(properties,new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication("rpddharaneesh@gmail.com","fgurqdxeurlismxd");
           }
            
        });
        session.setDebug(true);
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("This is a java notification");
            message.setText("this gmail is sent via using java. you can modify the code re send the gmail");
            System.out.println("Sending");
            Transport.send(message);
            System.out.println("Message sent successfully");
        }catch(MessagingException mex){
            mex.printStackTrace();
        }
    }
}