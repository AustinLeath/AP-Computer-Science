import java.awt.*;
import java.applet.*;
import java.net.*;
import java.io.*;

public class ToDoList extends Applet {

    void getToDoList () {

       try {

           URL                url;
           URLConnection      urlConn;
           DataInputStream    dis;

           statusTextField.setText("calling server ...");

           url = new URL(CGI_URL);
           urlConn = url.openConnection();
           urlConn.setDoInput(true);
           urlConn.setUseCaches(false);

           dis = new DataInputStream(urlConn.getInputStream());
           String s;

           toDoList.clear();

           while ((s = dis.readLine()) != null) {
              toDoList.addItem(s);
           }
           statusTextField.setText("retrieved To-Do List data");
           dis.close();
       }
       catch (MalformedURLException mue) { }
       catch (IOException ioe) { }
    }

    void addItem () {

       try {

           URL                url;
           URLConnection      urlConn;
           DataOutputStream   dos;
           DataInputStream    dis;

           String itemToAdd = addTextField.getText();
           if (itemToAdd.trim().equals("")) {
              statusTextField.setText("nothing to add");
              return;
           }

           statusTextField.setText("calling server ...");

           String itemEncoded = URLEncoder.encode(itemToAdd);
           url = new URL(CGI_URL + "?COMMAND=add&VALUE=" + itemEncoded);
           urlConn = url.openConnection();
           urlConn.setDoInput(true);
           urlConn.setDoOutput(true);
           urlConn.setUseCaches(false);
           urlConn.setRequestProperty ("Content-Type", "application/x-www-form-urlencoded");

           dis = new DataInputStream(urlConn.getInputStream());
           String s = dis.readLine();
           dis.close();

           if (s.equals("SUCCESS")) {
              getToDoList();
              addTextField.setText("");
              statusTextField.setText("item was added to list");
           } else {
              statusTextField.setText(s);
           }

       }
       catch (MalformedURLException mue) {
          statusTextField.setText("mue error");
       }
       catch (IOException ioe) {
          statusTextField.setText("IO Exception");
       }
    }

	void refreshButtonClicked(Event e) {
	    getToDoList();
	}

	void addButtonClicked(Event e) {
	    addItem();
	}

	public void init() {
		super.init();

		setLayout(null);
		addNotify();
		resize(383,350);
		setBackground(new Color(16777215));
		addButton = new java.awt.Button("Add to List");
		addButton.reshape(289,211,71,23);
		addButton.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(addButton);
		newLabel = new java.awt.Label("New To-Do Item");
		newLabel.reshape(24,191,115,22);
		newLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		add(newLabel);
		addTextField = new java.awt.TextField();
		addTextField.reshape(24,214,243,21);
		addTextField.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(addTextField);
		toDoLabel = new java.awt.Label("To-Do List");
		toDoLabel.reshape(24,24,84,22);
		toDoLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		add(toDoLabel);
		toDoList = new java.awt.List(0,false);
		add(toDoList);
		toDoList.reshape(24,48,238,123);
		toDoList.setFont(new Font("Dialog", Font.PLAIN, 12));
		refreshButton = new java.awt.Button("Refresh");
		refreshButton.reshape(287,49,71,23);
		refreshButton.setFont(new Font("Dialog", Font.PLAIN, 12));
		add(refreshButton);
		statusTextField = new java.awt.TextField();
		statusTextField.setEditable(false);
		statusTextField.reshape(24,316,243,21);
		statusTextField.setFont(new Font("Dialog", Font.PLAIN, 12));
		statusTextField.setForeground(new Color(8421504));
		statusTextField.setBackground(new Color(16777215));
		add(statusTextField);
		statusLabel = new java.awt.Label("Status of Last Request");
		statusLabel.reshape(24,293,163,22);
		statusLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		statusLabel.setForeground(new Color(0));
		add(statusLabel);
		label1 = new java.awt.Label("(Note: for this demo, your message won't really be added.)");
		label1.reshape(24,245,334,22);
		label1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label1.setForeground(new Color(12632256));
		add(label1);

		getToDoList();
	}

	public boolean handleEvent(Event event) {
		if (event.target == refreshButton && event.id == Event.ACTION_EVENT) {
			refreshButtonClicked(event);
			return true;
		}
		if (event.target == addButton && event.id == Event.ACTION_EVENT) {
			addButtonClicked(event);
			return true;
		}
		return super.handleEvent(event);
	}

	java.awt.Button addButton;
	java.awt.Label newLabel;
	java.awt.TextField addTextField;
	java.awt.Label toDoLabel;
	java.awt.List toDoList;
	java.awt.Button refreshButton;
	java.awt.TextField statusTextField;
	java.awt.Label statusLabel;
	java.awt.Label label1;

	String dataFile = "ToDoList.dat";
	String CGI_URL = "http://www.devdaily.com/cgi-bin/ToDoList.cgi";
}
