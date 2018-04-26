package project;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javafx.scene.paint.Color;
public class Project extends Application {
      Stage window;
      Scene scene0,scene1,scene2,forauthor3,othfunc4;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //GridPane for welcome page
        GridPane hb0 = new GridPane(); 
		hb0.setPadding(new Insets(10));
		hb0.setHgap(20);
		hb0.setVgap(20);
        window.setOnCloseRequest((WindowEvent we) -> {
            we.consume();
            closeProgram();
        });
        hb0.setId("background");
        Label lbl1 = new Label();
        lbl1.setText(" WELCOME");
        lbl1.setTextFill(Color.web("#d6c742"));
        lbl1.setMinWidth(120);
        lbl1.setPrefHeight(40);
        lbl1.setStyle("-fx-font-size: 25px");
        hb0.add(lbl1,11,0);
        Button continuebut = new Button("Continue");
        continuebut.setId("butstyle");
        continuebut.setPrefHeight(50);
        continuebut.setPrefWidth(120);
        continuebut.setStyle("-fx-font-size: 15px");
        hb0.add(continuebut,11,12);
        continuebut.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                window.setScene(scene1);
            }
	    });
        
        //GridPane for second scene
        GridPane hb = new GridPane();
                hb.setId("background2");
		hb.setPadding(new Insets(10));
		hb.setHgap(20);
		hb.setVgap(20);
        window.setOnCloseRequest((WindowEvent we) -> {
            we.consume();
            closeProgram();
        });
        
        Button firstbut = new Button("Lets go to Periodic Table");
        firstbut.setId("butstyle");
        firstbut.setPrefHeight(30);
        firstbut.setMinWidth(100);
        hb.add(firstbut,2,0);
        firstbut.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                window.setScene(scene2);
            }
	    });
        
        Button infbut = new Button("Infotmation about program");
        infbut.setId("butstyle");
        infbut.setPrefHeight(30);
        infbut.setMinWidth(100);
        hb.add(infbut,2,2); 
        infbut.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                window.setScene(forauthor3);
            }
	    });
        Button othfunc = new Button("Other function");
        othfunc.setId("butstyle");
        othfunc.setPrefHeight(30);
        othfunc.setMinWidth(100);
        hb.add(othfunc,2,4); 
        othfunc.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting a scene TWO ...");
                window.setScene(othfunc4);
            }
	    });
              
        GridPane hb1 = new GridPane();
        hb1.setId("background3");
	hb1.setPadding(new Insets(20));
	hb1.setHgap(5);
	hb1.setVgap(5);
        Button button2 = new Button("<-");
        button2.setMinWidth(50);
        button2.setPrefHeight(50);
        button2.setStyle("-fx-background-color: #36f7f4");
        hb1.add(button2,0,10);
        button2.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting the scene ONE ...");
                window.setScene(scene1);
            }
	});
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        
        //1 katar
        Button elem1 = new Button("H");
        elem1.setMinWidth(50);
        elem1.setPrefHeight(50);
        GridPane.setHalignment(elem1, HPos.RIGHT);
        hb1.add(elem1, 0, 0);
        elem1.setStyle("-fx-background-color: #7fd863;"); 
        elem1.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\1.jpg");
            message("Hydrogen is a chemical element with symbol H and atomic number 1. With a standard atomic weight of 1.008,\n" +
            " hydrogen is the lightest element on the periodic table. Its monatomic form (H) is the most abundant chemical\n" +
            " substance in the Universe, constituting roughly 75% of all baryonic mass.[7][note 1] Non-remnant stars are mainly composed of hydrogen in the plasma state. \n" +
            "The most common isotope of hydrogen, termed protium (name rarely used, symbol 1H), has one proton and no neutrons.", "Hydrogen",icon);   
            }
	    });
        Button elem2 = new Button("Li");
        elem2.setMinWidth(50);
        elem2.setPrefHeight(50);
        elem2.setId("1rowbutt");
        GridPane.setHalignment(elem2, HPos.RIGHT);
        hb1.add(elem2, 0, 1);
        elem2.setStyle("-fx-background-color: #ba3030;");
        elem2.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\3.png");
            message("Lithium  is a chemical element with symbol Li and atomic number 3. It is a soft, silvery-\n" +
"white alkali metal. Under standard conditions, it is the lightest metal and the lightest solid element. Like all alkali metals, lithium is \n" +
"highly reactive and flammable, and is stored in mineral oil. When cut open, it exhibits a metallic luster, but moist air corrodes it quickly\n" +
" to a dull silvery gray, then black tarnish. It never occurs freely in nature, but only in (usually ionic) compounds, such as pegmatitic \n" +
"minerals which were once the main source of lithium. Due to its solubility as an ion, it is present in ocean water and is commonly obtained\n" +
" from brines. Lithium metal is isolated electrolytically from a mixture of lithium chloride and potassium chloride.", "Lithium",icon);   
            }
	    });
        Button elem3 = new Button("Na");
        elem3.setMinWidth(50);
        elem3.setPrefHeight(50);
        GridPane.setHalignment(elem3, HPos.RIGHT);
        hb1.add(elem3, 0, 2);
        elem3.setStyle("-fx-background-color: #ba3030;");
        elem3.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\44.png");
            message("Sodium is a chemical element with symbol Na (from Latin natrium) and atomic number 11. It is a soft, silvery-white, highly reactive \n" +
"metal. Sodium is an alkali metal, being in group 1 of the periodic table, because it has a single electron in its outer shell that it readily\n" +
"donates, creating a positively charged ion—the Na+ cation. Its only stable isotope is 23Na. The free metal does not occur in nature,\n" +
"but must be prepared from compounds. Sodium is the sixth most abundant element in the Earth's crust, and exists in numerous minerals \n" +
"such as feldspars, sodalite, and rock salt (NaCl). Many salts of sodium are highly water-soluble: sodium ions have been leached by \n" +
"the action of water from the Earth's minerals over eons, and thus sodium and chlorine are the most common dissolved elements by \n" +
"weight in the oceans.", "Sodium",icon);   
            }
	    });
        Button elem4 = new Button("K");
        elem4.setMinWidth(50);
        elem4.setPrefHeight(50);
        GridPane.setHalignment(elem4, HPos.RIGHT);
        hb1.add(elem4, 0, 3);
        elem4.setStyle("-fx-background-color: #ba3030;");
        elem4.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\5.jpg");
            message("Potassium is a chemical element with symbol K (from Neo-Latin kalium) and atomic number 19. It was first isolated from potash, the ashes\n" +
" of plants, from which its name derives. In the periodic table, potassium is one of the alkali metals. All of the alkali metals have a \n" +
"single valence electron in the outer electron shell, which is easily removed to create an ion with a positive charge – a cation, which\n" +
" combines with anions to form salts. Potassium in nature occurs only in ionic salts. Elemental potassium is a soft silvery-white alkali\n" +
" metal that oxidizes rapidly in air and reacts vigorously with water, generating sufficient heat to ignite hydrogen emitted in the \n" +
"reaction and burning with a lilac-colored flame. It is found dissolved in sea water (which is 0.04% potassium by weight[5][6]), and \n" +
"is part of many minerals.", "Potassium",icon);   
            }
	    });
        Button elem5 = new Button("Rb");
        elem5.setMinWidth(50);
        elem5.setPrefHeight(50);
        GridPane.setHalignment(elem5, HPos.RIGHT);
        hb1.add(elem5, 0, 4);
        elem5.setStyle("-fx-background-color: #ba3030;");
        Button elem6 = new Button("Cs");
        elem5.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\6.jpg");
            message("Rubidium is a chemical element with symbol Rb and atomic number 37. Rubidium is a soft, silvery-white metallic element of the alkali \n" +
"metal group, with a standard atomic weight of 85.4678. Elemental rubidium is highly reactive, with properties similar to those of \n" +
"other alkali metals, including rapid oxidation in air. On Earth, natural rubidium comprises two isotopes: 72% is the stable isotope, \n" +
"85Rb; 28% is the slightly radioactive 87Rb, with a half-life of 49 billion years—more than three times longer than the estimated age \n" +
"of the universe.", "Rubidium",icon);   
            }
	    });
        elem6.setMinWidth(50);
        elem6.setPrefHeight(50);
        GridPane.setHalignment(elem6, HPos.RIGHT);
        hb1.add(elem6, 0, 5);
        elem6.setStyle("-fx-background-color: #ba3030;");
        elem6.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\7.jpg");
            message("Caesium  is a chemical element with symbol Cs and atomic number 55. It is a soft, silvery-gold alkali metal with a melting point of 28.5 °C\n" +
" (83.3 °F), which makes it one of only five elemental metals that are liquid at or near room temperature.[note 2] Caesium has physical and \n" +
"chemical properties similar to those of rubidium and potassium. The most reactive of all metals, it is pyrophoric and reacts with water\n" +
" even at −116 °C (−177 °F). It is the least electronegative element, with a value of 0.79 on the Pauling scale. It has only one stable \n" +
"isotope, caesium-133. Caesium is mined mostly from pollucite, while the radioisotopes, especially caesium-137, a fission product, are \n" +
"extracted from waste produced by nuclear reactors.", "Caesium",icon);   
            }
	    });
        Button elem7 = new Button("Fr");
        elem7.setMinWidth(50);
        elem7.setPrefHeight(50);
        GridPane.setHalignment(elem7, HPos.RIGHT);
        hb1.add(elem7, 0, 6);
        elem7.setStyle("-fx-background-color: #ba3030;");
        elem7.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\8.jpg");
            message("Francium is a chemical element with symbol Fr and atomic number 87. It used to be known as eka-caesium. It is extremely radioactive; \n" +
"its most stable isotope, francium-223 (originally called actinium K after the natural decay chain it appears in), has a half-life of \n" +
"only 22 minutes. It is the second-least electronegative element, behind only caesium, and is the second rarest naturally occurring \n" +
"element (after astatine). The isotopes of francium decay quickly into astatine, radium, and radon. As an alkali metal, it has one \n" +
"valence electron.", "Francium",icon);   
            }
	    });
        
        //2 katar
        Button elem8 = new Button("Be");
        elem8.setMinWidth(50);
        elem8.setPrefHeight(50);
        GridPane.setHalignment(elem8, HPos.RIGHT);
        hb1.add(elem8, 1, 1);
        elem8.setStyle("-fx-background-color: #db5a2b;");
        elem8.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\9.jpg");
            message("Beryllium is a chemical element with symbol Be and atomic number 4. It is a relatively rare element in the universe, usually occurring \n" +
"as a product of the spallation of larger atomic nuclei that have collided with cosmic rays. Within the cores of stars beryllium is \n" +
"depleted as it is fused and creates larger elements. It is a divalent element which occurs naturally only in combination with other\n" +
" elements in minerals. Notable gemstones which contain beryllium include beryl (aquamarine, emerald) and chrysoberyl. As a free \n" +
"element it is a steel-gray, strong, lightweight and brittle alkaline earth metal", "Beryllium",icon);   
            }
	    });
        Button elem9 = new Button("Mg");
        elem9.setMinWidth(50);
        elem9.setPrefHeight(50);
        GridPane.setHalignment(elem9, HPos.RIGHT);
        hb1.add(elem9, 1, 2);
        elem9.setStyle("-fx-background-color: #db5a2b;");
        elem9.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\99.jpg");
            message("Magnesium is a chemical element with symbol Mg and atomic number 12. It is a shiny gray solid which bears a close physical\n" +
" resemblance to the other five elements in the second column (group 2, or alkaline earth metals) of the periodic table: all\n" +
" group 2 elements have the same electron configuration in the outer electron shell and a similar crystal structure.", "Magnesium",icon);   
            }
	    });
        Button elem10 = new Button("Ca");
        elem10.setMinWidth(50);
        elem10.setPrefHeight(50);
        GridPane.setHalignment(elem10, HPos.RIGHT);
        hb1.add(elem10, 1, 3);
        elem10.setStyle("-fx-background-color: #db5a2b;");
        elem10.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\10.jpg");
            message("Calcium is a chemical element with symbol Ca and atomic number 20. An alkaline earth metal, calcium is a reactive pale yellow \n" +
"metal that forms a dark oxide-nitride layer when exposed to air. Its physical and chemical properties are most similar to its \n" +
"heavier homologues strontium and barium. It is the fifth most abundant element in Earth's crust and the third most abundant \n" +
"metal, after iron and aluminium. The most common calcium compound on Earth is calcium carbonate, found in limestone and the \n" +
"fossilised remnants of early sea life; gypsum, anhydrite, fluorite, and apatite are also sources of calcium.", "Calcium",icon);   
            }
	    });
        Button elem11 = new Button("Sr");
        elem11.setMinWidth(50);
        elem11.setPrefHeight(50);
        GridPane.setHalignment(elem11, HPos.RIGHT);
        hb1.add(elem11, 1, 4);
        elem11.setStyle("-fx-background-color: #db5a2b;");
        elem11.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
            ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\11.png");
            message("Strontium is the chemical element with symbol Sr and atomic number 38. An alkaline earth metal, strontium is a soft silver-white \n" +
"yellowish metallic element that is highly reactive chemically. The metal forms a dark oxide layer when it is exposed to air.\n" +
" Strontium has physical and chemical properties similar to those of its two vertical neighbors in the periodic table, calcium \n" +
"and barium. It occurs naturally mainly in the minerals celestine, strontianite and is mined mostly from the first two of these.\n" +
" While natural strontium is stable, the synthetic 90Sr isotope is radioactive and is one of the most dangerous components of \n" +
"nuclear fallout, as strontium is absorbed by the body in a similar manner to calcium. Natural stable strontium, on the other \n" +
"hand, is not hazardous to health.", "Strontium",icon);   
            }
	    });
        Button elem12 = new Button("Ba");
        elem12.setMinWidth(50);
        elem12.setPrefHeight(50);
        GridPane.setHalignment(elem12, HPos.RIGHT);
        hb1.add(elem12, 1, 5);
        elem12.setStyle("-fx-background-color: #db5a2b;");
        Button elem13 = new Button("Ra");
        elem13.setMinWidth(50);
        elem13.setPrefHeight(50);
        GridPane.setHalignment(elem13, HPos.RIGHT);
        hb1.add(elem13, 1, 6);
        elem13.setStyle("-fx-background-color: #db5a2b;");
        
        // 3 katar
        Button elem14 = new Button("Sc");
        elem14.setMinWidth(50);
        elem14.setPrefHeight(50);
        GridPane.setHalignment(elem14, HPos.RIGHT);
        hb1.add(elem14, 2, 3);
        elem14.setStyle("-fx-background-color: #f94857;");
        Button elem15 = new Button("Y");
        elem15.setMinWidth(50);
        elem15.setPrefHeight(50);
        GridPane.setHalignment(elem15, HPos.RIGHT);
        hb1.add(elem15, 2, 4);
        elem15.setStyle("-fx-background-color: #f94857;");
        Button elem16 = new Button("La");
        elem16.setMinWidth(50);
        elem16.setPrefHeight(50);
        GridPane.setHalignment(elem16, HPos.RIGHT);
        hb1.add(elem16, 2, 5);
        elem16.setStyle("-fx-background-color: #f794d3;");
        Button elem17 = new Button("Ac");
        elem17.setMinWidth(50);
        elem17.setPrefHeight(50);
        GridPane.setHalignment(elem17, HPos.RIGHT);
        hb1.add(elem17, 2, 6);
        elem17.setStyle("-fx-background-color: #d6068a;");
        
        //4 katar
        Button elem18 = new Button("Ti");
        elem18.setMinWidth(50);
        elem18.setPrefHeight(50);
        GridPane.setHalignment(elem18, HPos.RIGHT);
        hb1.add(elem18, 4, 3);
        elem18.setStyle("-fx-background-color: #f94857;");
        Button elem19 = new Button("Zr");
        elem19.setMinWidth(50);
        elem19.setPrefHeight(50);
        GridPane.setHalignment(elem19, HPos.RIGHT);
        hb1.add(elem19, 4, 4);
        elem19.setStyle("-fx-background-color: #f94857;");
        Button elem20 = new Button("Hf");
        elem20.setMinWidth(50);
        elem20.setPrefHeight(50);
        GridPane.setHalignment(elem20, HPos.RIGHT);
        hb1.add(elem20, 4, 5);
        elem20.setStyle("-fx-background-color: #f94857;");
        Button elem21 = new Button("Rf");
        elem21.setMinWidth(50);
        elem21.setPrefHeight(50);
        GridPane.setHalignment(elem21, HPos.RIGHT);
        hb1.add(elem21, 4, 6);
        elem21.setStyle("-fx-background-color: #f94857;");
        Button elem22 = new Button("Ce");
        elem22.setMinWidth(50);
        elem22.setPrefHeight(50);
        GridPane.setHalignment(elem22, HPos.RIGHT);
        hb1.add(elem22, 4, 8);
        elem22.setStyle("-fx-background-color: #f794d3;");        
        Button elem23 = new Button("Th");
        elem23.setMinWidth(50);
        elem23.setPrefHeight(50);
        GridPane.setHalignment(elem23, HPos.RIGHT);
        hb1.add(elem23, 4, 9);
        elem23.setStyle("-fx-background-color: #d6068a;");
        
       //5 katar
        Button elem24 = new Button("V");
        elem24.setMinWidth(50);
        elem24.setPrefHeight(50);
        GridPane.setHalignment(elem24, HPos.RIGHT);
        hb1.add(elem24, 5, 3);
        elem24.setStyle("-fx-background-color: #f94857;");
        Button elem25 = new Button("Nb");
        elem25.setMinWidth(50);
        elem25.setPrefHeight(50);
        GridPane.setHalignment(elem25, HPos.RIGHT);
        hb1.add(elem25, 5, 4);
        elem25.setStyle("-fx-background-color: #f94857;");
        Button elem26 = new Button("Ta");
        elem26.setMinWidth(50);
        elem26.setPrefHeight(50);
        GridPane.setHalignment(elem26, HPos.RIGHT);
        hb1.add(elem26, 5, 5);
        elem26.setStyle("-fx-background-color: #f94857;");
        Button elem27 = new Button("Db");
        elem27.setMinWidth(50);
        elem27.setPrefHeight(50);
        GridPane.setHalignment(elem27, HPos.RIGHT);
        hb1.add(elem27, 5, 6);
        elem27.setStyle("-fx-background-color: #f94857;");
        Button elem28 = new Button("Pr");
        elem28.setMinWidth(50);
        elem28.setPrefHeight(50);
        GridPane.setHalignment(elem28, HPos.RIGHT);
        hb1.add(elem28, 5, 8);
        elem28.setStyle("-fx-background-color: #f794d3;"); 
        Button elem29 = new Button("Pa");
        elem29.setMinWidth(50);
        elem29.setPrefHeight(50);
        GridPane.setHalignment(elem29, HPos.RIGHT);
        hb1.add(elem29, 5, 9);
        elem29.setStyle("-fx-background-color: #d6068a;");
        
        //6 katar
        Button elem30 = new Button("Cr");
        elem30.setMinWidth(50);
        elem30.setPrefHeight(50);
        GridPane.setHalignment(elem30, HPos.RIGHT);
        hb1.add(elem30, 6, 3);
        elem30.setStyle("-fx-background-color: #f94857;");
        Button elem31 = new Button("Mo");
        elem31.setMinWidth(50);
        elem31.setPrefHeight(50);
        GridPane.setHalignment(elem31, HPos.RIGHT);
        hb1.add(elem31, 6, 4);
        elem31.setStyle("-fx-background-color: #f94857;");
        Button elem32 = new Button("W");
        elem32.setMinWidth(50);
        elem32.setPrefHeight(50);
        GridPane.setHalignment(elem32, HPos.RIGHT);
        hb1.add(elem32, 6, 5);
        elem32.setStyle("-fx-background-color: #f94857;");
        Button elem33 = new Button("Sg");
        elem33.setMinWidth(50);
        elem33.setPrefHeight(50);
        GridPane.setHalignment(elem33, HPos.RIGHT);
        hb1.add(elem33, 6, 6);
        elem33.setStyle("-fx-background-color: #f94857;");
        Button elem34 = new Button("Nd");
        elem34.setMinWidth(50);
        elem34.setPrefHeight(50);
        GridPane.setHalignment(elem34, HPos.RIGHT);
        hb1.add(elem34, 6, 8);
         elem34.setStyle("-fx-background-color: #f794d3;"); 
        Button elem35 = new Button("U");
        elem35.setMinWidth(50);
        elem35.setPrefHeight(50);
        GridPane.setHalignment(elem35, HPos.RIGHT);
        hb1.add(elem35, 6, 9);
        elem35.setStyle("-fx-background-color: #d6068a;");
        
        //7 katar
        Button elem36 = new Button("Mn");
        elem36.setMinWidth(50);
        elem36.setPrefHeight(50);
        GridPane.setHalignment(elem36, HPos.RIGHT);
        hb1.add(elem36, 7, 3);
        elem36.setStyle("-fx-background-color: #f94857;");
        Button elem37 = new Button("Tc");
        elem37.setMinWidth(50);
        elem37.setPrefHeight(50);
        GridPane.setHalignment(elem37, HPos.RIGHT);
        hb1.add(elem37, 7, 4);
        elem37.setStyle("-fx-background-color: #f94857;");
        Button elem38 = new Button("Re");
        elem38.setMinWidth(50);
        elem38.setPrefHeight(50);
        GridPane.setHalignment(elem38, HPos.RIGHT);
        hb1.add(elem38, 7, 5);
        elem38.setStyle("-fx-background-color: #f94857;");
        Button elem39 = new Button("Bh");
        elem39.setMinWidth(50);
        elem39.setPrefHeight(50);
        GridPane.setHalignment(elem39, HPos.RIGHT);
        hb1.add(elem39, 7, 6);
        elem39.setStyle("-fx-background-color: #f94857;");
        Button elem40 = new Button("Pm");
        elem40.setMinWidth(50);
        elem40.setPrefHeight(50);
        GridPane.setHalignment(elem40, HPos.RIGHT);
        hb1.add(elem40, 7, 8);
        elem40.setStyle("-fx-background-color: #f794d3;"); 
        Button elem41= new Button("Np");
        elem41.setMinWidth(50);
        elem41.setPrefHeight(50);
        GridPane.setHalignment(elem41, HPos.RIGHT);
        hb1.add(elem41, 7, 9);
        elem41.setStyle("-fx-background-color: #d6068a;");
        
        //8 katar
        Button elem42= new Button("Fe");
        elem42.setMinWidth(50);
        elem42.setPrefHeight(50);
        GridPane.setHalignment(elem42, HPos.RIGHT);
        hb1.add(elem42, 8, 3);
        elem42.setStyle("-fx-background-color: #f94857;");
        Button elem43= new Button("Ru");
        elem43.setMinWidth(50);
        elem43.setPrefHeight(50);
        GridPane.setHalignment(elem43, HPos.RIGHT);
        hb1.add(elem43, 8, 4);
        elem43.setStyle("-fx-background-color: #f94857;");
        Button elem44= new Button("Os");
        elem44.setMinWidth(50);
        elem44.setPrefHeight(50);
        GridPane.setHalignment(elem44, HPos.RIGHT);
        hb1.add(elem44, 8, 5);
        elem44.setStyle("-fx-background-color: #f94857;");
        Button elem45= new Button("Hs");
        elem45.setMinWidth(50);
        elem45.setPrefHeight(50);
        GridPane.setHalignment(elem45, HPos.RIGHT);
        hb1.add(elem45, 8 ,6);
        elem45.setStyle("-fx-background-color: #f94857;");
        Button elem46= new Button("Sm");
        elem46.setMinWidth(50);
        elem46.setPrefHeight(50);
        GridPane.setHalignment(elem46, HPos.RIGHT);
        hb1.add(elem46, 8, 8);
        elem46.setStyle("-fx-background-color: #f794d3;"); 
        Button elem47= new Button("Pu");
        elem47.setMinWidth(50);
        elem47.setPrefHeight(50);
        GridPane.setHalignment(elem47, HPos.RIGHT);
        hb1.add(elem47, 8, 9);
        elem47.setStyle("-fx-background-color: #d6068a;");
        
        //9 katar.
        Button elem48= new Button("Co");
        elem48.setMinWidth(50);
        elem48.setPrefHeight(50);
        GridPane.setHalignment(elem48, HPos.RIGHT);
        hb1.add(elem48, 9, 3);
        elem48.setStyle("-fx-background-color: #f94857;");
        Button elem49= new Button("Rh");
        elem49.setMinWidth(50);
        elem49.setPrefHeight(50);
        GridPane.setHalignment(elem49, HPos.RIGHT);
        hb1.add(elem49, 9, 4);
        elem49.setStyle("-fx-background-color: #f94857;");
        Button elem50= new Button("Ir");
        elem50.setMinWidth(50);
        elem50.setPrefHeight(50);
        GridPane.setHalignment(elem50, HPos.RIGHT);
        hb1.add(elem50, 9, 5);
        elem50.setStyle("-fx-background-color: #f94857;");
        Button elem51= new Button("Mt");
        elem51.setMinWidth(50);
        elem51.setPrefHeight(50);
        GridPane.setHalignment(elem51, HPos.RIGHT);
        hb1.add(elem51, 9 ,6);
        elem51.setStyle("-fx-background-color: #c1bfc0;");
        Button elem52= new Button("Eu");
        elem52.setMinWidth(50);
        elem52.setPrefHeight(50);
        GridPane.setHalignment(elem52, HPos.RIGHT);
        hb1.add(elem52, 9, 8);
        elem52.setStyle("-fx-background-color: #f794d3;"); 
        Button elem53= new Button("Am");
        elem53.setMinWidth(50);
        elem53.setPrefHeight(50);
        GridPane.setHalignment(elem53, HPos.RIGHT);
        hb1.add(elem53, 9, 9);
        elem53.setStyle("-fx-background-color: #d6068a;");
        
        //10 katar.
        Button elem54= new Button("Ni");
        elem54.setMinWidth(50);
        elem54.setPrefHeight(50);
        GridPane.setHalignment(elem54, HPos.RIGHT);
        hb1.add(elem54, 10, 3);
        elem54.setStyle("-fx-background-color: #f94857;");
        Button elem55= new Button("Pd");
        elem55.setMinWidth(50);
        elem55.setPrefHeight(50);
        GridPane.setHalignment(elem55, HPos.RIGHT);
        hb1.add(elem55, 10, 4);
        elem55.setStyle("-fx-background-color: #f94857;");
        Button elem56= new Button("Pt");
        elem56.setMinWidth(50);
        elem56.setPrefHeight(50);
        GridPane.setHalignment(elem56, HPos.RIGHT);
        hb1.add(elem56, 10, 5);
        elem56.setStyle("-fx-background-color: #f94857;");
        Button elem57= new Button("Ds");
        elem57.setMinWidth(50);
        elem57.setPrefHeight(50);
        GridPane.setHalignment(elem57, HPos.RIGHT);
        hb1.add(elem57, 10,6);
        elem57.setStyle("-fx-background-color: #c1bfc0;");
        Button elem58= new Button("Gd");
        elem58.setMinWidth(50);
        elem58.setPrefHeight(50);
        GridPane.setHalignment(elem58, HPos.RIGHT);
        hb1.add(elem58, 10, 8);
        elem58.setStyle("-fx-background-color: #f794d3;"); 
        Button elem59= new Button("Cm");
        elem59.setMinWidth(50);
        elem59.setPrefHeight(50);
        GridPane.setHalignment(elem59, HPos.RIGHT);
        hb1.add(elem59, 10, 9);
        elem59.setStyle("-fx-background-color: #d6068a;");
        
        //11 katar
        Button elem60= new Button("Cu");
        elem60.setMinWidth(50);
        elem60.setPrefHeight(50);
        GridPane.setHalignment(elem60, HPos.RIGHT);
        hb1.add(elem60, 11, 3);
        elem60.setStyle("-fx-background-color: #f94857;");
        Button elem61= new Button("Ag");
        elem61.setMinWidth(50);
        elem61.setPrefHeight(50);
        GridPane.setHalignment(elem61, HPos.RIGHT);
        hb1.add(elem61, 11, 4);
        elem61.setStyle("-fx-background-color: #f94857;");
        Button elem62= new Button("Au");
        elem62.setMinWidth(50);
        elem62.setPrefHeight(50);
        GridPane.setHalignment(elem62, HPos.RIGHT);
        hb1.add(elem62, 11, 5);
        elem62.setStyle("-fx-background-color: #f94857;");
        Button elem63= new Button("Rg");
        elem63.setMinWidth(50);
        elem63.setPrefHeight(50);
        GridPane.setHalignment(elem63, HPos.RIGHT);
        hb1.add(elem63, 11,6);
        elem63.setStyle("-fx-background-color: #c1bfc0;");
        Button elem64= new Button("Tb");
        elem64.setMinWidth(50);
        elem64.setPrefHeight(50);
        GridPane.setHalignment(elem64, HPos.RIGHT);
        hb1.add(elem64, 11, 8);
        elem64.setStyle("-fx-background-color: #f794d3;"); 
        Button elem65= new Button("Bk");
        elem65.setMinWidth(50);
        elem65.setPrefHeight(50);
        GridPane.setHalignment(elem65, HPos.RIGHT);
        hb1.add(elem65, 11, 9);
        elem65.setStyle("-fx-background-color: #d6068a;");
        
         //12 katar
        Button elem66= new Button("Zn");
        elem66.setMinWidth(50);
        elem66.setPrefHeight(50);
        GridPane.setHalignment(elem66, HPos.RIGHT);
        hb1.add(elem66, 12, 3);
        elem66.setStyle("-fx-background-color: #84888e;");
        Button elem67= new Button("Cd");
        elem67.setMinWidth(50);
        elem67.setPrefHeight(50);
        GridPane.setHalignment(elem67, HPos.RIGHT);
        hb1.add(elem67, 12, 4);
        elem67.setStyle("-fx-background-color: #84888e;");
        Button elem68= new Button("Hg");
        elem68.setMinWidth(50);
        elem68.setPrefHeight(50);
        GridPane.setHalignment(elem68, HPos.RIGHT);
        hb1.add(elem68, 12, 5);
        elem68.setStyle("-fx-background-color: #84888e;");
        Button elem69= new Button("Cn");
        elem69.setMinWidth(50);
        elem69.setPrefHeight(50);
        GridPane.setHalignment(elem69, HPos.RIGHT);
        hb1.add(elem69, 12,6);
        elem69.setStyle("-fx-background-color: #84888e;");
        Button elem70= new Button("Dy");
        elem70.setMinWidth(50);
        elem70.setPrefHeight(50);
        GridPane.setHalignment(elem70, HPos.RIGHT);
        hb1.add(elem70, 12, 8);
        elem70.setStyle("-fx-background-color: #f794d3;"); 
        Button elem71= new Button("Cf");
        elem71.setMinWidth(50);
        elem71.setPrefHeight(50);
        GridPane.setHalignment(elem71, HPos.RIGHT);
        hb1.add(elem71, 12, 9);
        elem71.setStyle("-fx-background-color: #d6068a;");
        
        //13 katar
        Button elem72= new Button("B");
        elem72.setMinWidth(50);
        elem72.setPrefHeight(50);
        GridPane.setHalignment(elem72, HPos.RIGHT);
        hb1.add(elem72, 13, 1);
        elem72.setStyle("-fx-background-color: #91f29c;");
        Button elem73= new Button("Al");
        elem73.setMinWidth(50);
        elem73.setPrefHeight(50);
        GridPane.setHalignment(elem73, HPos.RIGHT);
        hb1.add(elem73, 13, 2);
        elem73.setStyle("-fx-background-color: #84888e;");
        Button elem74= new Button("Ga");
        elem74.setMinWidth(50);
        elem74.setPrefHeight(50);
        GridPane.setHalignment(elem74, HPos.RIGHT);
        hb1.add(elem74, 13, 3);
        elem74.setStyle("-fx-background-color: #84888e;");
        Button elem75= new Button("In");
        elem75.setMinWidth(50);
        elem75.setPrefHeight(50);
        GridPane.setHalignment(elem75, HPos.RIGHT);
        hb1.add(elem75, 13, 4);
        elem75.setStyle("-fx-background-color: #84888e;");
        Button elem76= new Button("Ti");
        elem76.setMinWidth(50);
        elem76.setPrefHeight(50);
        GridPane.setHalignment(elem76, HPos.RIGHT);
        hb1.add(elem76, 13, 5);
        elem76.setStyle("-fx-background-color: #84888e;");
        Button elem77= new Button("Nh");
        elem77.setMinWidth(50);
        elem77.setPrefHeight(50);
        GridPane.setHalignment(elem77, HPos.RIGHT);
        hb1.add(elem77, 13,6);
        elem77.setStyle("-fx-background-color: #c1bfc0;");
        Button elem78= new Button("Ho");
        elem78.setMinWidth(50);
        elem78.setPrefHeight(50);
        GridPane.setHalignment(elem78, HPos.RIGHT);
        hb1.add(elem78, 13, 8);
        elem78.setStyle("-fx-background-color: #f794d3;"); 
        Button elem79= new Button("Es");
        elem79.setMinWidth(50);
        elem79.setPrefHeight(50);
        GridPane.setHalignment(elem71, HPos.RIGHT);
        hb1.add(elem79, 13, 9);
        elem79.setStyle("-fx-background-color: #d6068a;");
        
        //14 katar
        Button elem80= new Button("C");
        elem80.setMinWidth(50);
        elem80.setPrefHeight(50);
        GridPane.setHalignment(elem80, HPos.RIGHT);
        hb1.add(elem80, 14, 1);
        elem80.setStyle("-fx-background-color: #21eda9;");
        Button elem81= new Button("Si");
        elem81.setMinWidth(50);
        elem81.setPrefHeight(50);
        GridPane.setHalignment(elem81, HPos.RIGHT);
        hb1.add(elem81, 14, 2);
        elem81.setStyle("-fx-background-color: #91f29c;");
        Button elem82= new Button("Ge");
        elem82.setMinWidth(50);
        elem82.setPrefHeight(50);
        GridPane.setHalignment(elem82, HPos.RIGHT);
        hb1.add(elem82, 14, 3);
        elem82.setStyle("-fx-background-color: #91f29c;");
        Button elem83= new Button("Sn");
        elem83.setMinWidth(50);
        elem83.setPrefHeight(50);
        GridPane.setHalignment(elem83, HPos.RIGHT);
        hb1.add(elem83, 14, 4);
        elem83.setStyle("-fx-background-color: #84888e;");
        Button elem84= new Button("Pb");
        elem84.setMinWidth(50);
        elem84.setPrefHeight(50);
        GridPane.setHalignment(elem84, HPos.RIGHT);
        hb1.add(elem84, 14, 5);
        elem84.setStyle("-fx-background-color: #84888e;");
        Button elem85= new Button("Fl");
        elem85.setMinWidth(50);
        elem85.setPrefHeight(50);
        GridPane.setHalignment(elem85, HPos.RIGHT);
        hb1.add(elem85, 14,6);
        elem85.setStyle("-fx-background-color: #c1bfc0;");
        Button elem86= new Button("Er");
        elem86.setMinWidth(50);
        elem86.setPrefHeight(50);
        GridPane.setHalignment(elem86, HPos.RIGHT);
        hb1.add(elem86, 14, 8);
        elem86.setStyle("-fx-background-color: #f794d3;"); 
        Button elem87= new Button("Fm");
        elem87.setMinWidth(50);
        elem87.setPrefHeight(50);
        GridPane.setHalignment(elem87, HPos.RIGHT);
        hb1.add(elem87, 14, 9);
        elem87.setStyle("-fx-background-color: #d6068a;");
        
        //15 katar
        Button elem88= new Button("N");
        elem88.setMinWidth(50);
        elem88.setPrefHeight(50);
        GridPane.setHalignment(elem88, HPos.RIGHT);
        hb1.add(elem88, 15, 1);
        elem88.setStyle("-fx-background-color: #c7f2a2;");
        Button elem89= new Button("P");
        elem89.setMinWidth(50);
        elem89.setPrefHeight(50);
        GridPane.setHalignment(elem89, HPos.RIGHT);
        hb1.add(elem89, 15, 2);
        elem89.setStyle("-fx-background-color: #21eda9;");
        Button elem90= new Button("As");
        elem90.setMinWidth(50);
        elem90.setPrefHeight(50);
        GridPane.setHalignment(elem90, HPos.RIGHT);
        hb1.add(elem90, 15, 3);
        elem90.setStyle("-fx-background-color: #91f29c;");
        Button elem91= new Button("Sb");
        elem91.setMinWidth(50);
        elem91.setPrefHeight(50);
        GridPane.setHalignment(elem91, HPos.RIGHT);
        hb1.add(elem91, 15, 4);
        elem91.setStyle("-fx-background-color: #91f29c;");
        Button elem92= new Button("Bi");
        elem92.setMinWidth(50);
        elem92.setPrefHeight(50);
        GridPane.setHalignment(elem92, HPos.RIGHT);
        hb1.add(elem92, 15, 5);
        elem92.setStyle("-fx-background-color: #84888e;");
        Button elem93= new Button("Mc");
        elem93.setMinWidth(50);
        elem93.setPrefHeight(50);
        GridPane.setHalignment(elem93, HPos.RIGHT);
        hb1.add(elem93, 15,6);
        elem93.setStyle("-fx-background-color: #c1bfc0;");
        Button elem94= new Button("Tm");
        elem94.setMinWidth(50);
        elem94.setPrefHeight(50);
        GridPane.setHalignment(elem94, HPos.RIGHT);
        hb1.add(elem94, 15, 8);
        elem94.setStyle("-fx-background-color: #f794d3;"); 
        Button elem95= new Button("Md");
        elem95.setMinWidth(50);
        elem95.setPrefHeight(50);
        GridPane.setHalignment(elem95, HPos.RIGHT);
        hb1.add(elem95, 15, 9);
        elem95.setStyle("-fx-background-color: #d6068a;");
        
        //16 katar
        Button elem96= new Button("O");
        elem96.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                ImageIcon icon=new ImageIcon("C:\\Users\\Yelnur\\Desktop\\Project\\ozone-128.png");
                    message("Ozon is tyhg  hg\n h gfhf hf h f", "Ozon",icon);   
            }
	    });
        elem96.setMinWidth(50);
        elem96.setPrefHeight(50);
        GridPane.setHalignment(elem96, HPos.RIGHT);
        hb1.add(elem96, 16, 1);
        elem96.setStyle("-fx-background-color: #c7f2a2;");
        Button elem97= new Button("S");
        elem97.setMinWidth(50);
        elem97.setPrefHeight(50);
        GridPane.setHalignment(elem97, HPos.RIGHT);
        hb1.add(elem97, 16, 2);
        elem97.setStyle("-fx-background-color: #21eda9;");
        Button elem98= new Button("Se");
        elem98.setMinWidth(50);
        elem98.setPrefHeight(50);
        GridPane.setHalignment(elem98, HPos.RIGHT);
        hb1.add(elem98, 16, 3);
        elem98.setStyle("-fx-background-color: #21eda9;");
        Button elem99= new Button("Te");
        elem99.setMinWidth(50);
        elem99.setPrefHeight(50);
        GridPane.setHalignment(elem99, HPos.RIGHT);
        hb1.add(elem99, 16, 4);
        elem99.setStyle("-fx-background-color: #91f29c;");
        Button elem100= new Button("Po");
        elem100.setMinWidth(50);
        elem100.setPrefHeight(50);
        GridPane.setHalignment(elem100, HPos.RIGHT);
        hb1.add(elem100, 16, 5);
        elem100.setStyle("-fx-background-color: #84888e;");
        Button elem101= new Button("Lv");
        elem101.setMinWidth(50);
        elem101.setPrefHeight(50);
        GridPane.setHalignment(elem101, HPos.RIGHT);
        hb1.add(elem101, 16,6);
        elem101.setStyle("-fx-background-color: #c1bfc0;");
        Button elem102= new Button("Yb");
        elem102.setMinWidth(50);
        elem102.setPrefHeight(50);
        GridPane.setHalignment(elem102, HPos.RIGHT);
        hb1.add(elem102, 16, 8);
        elem102.setStyle("-fx-background-color: #f794d3;"); 
        Button elem103= new Button("No");
        elem103.setMinWidth(50);
        elem103.setPrefHeight(50);
        GridPane.setHalignment(elem95, HPos.RIGHT);
        hb1.add(elem103, 16, 9);
        elem103.setStyle("-fx-background-color: #d6068a;");
        
        //17katar
        Button elem104= new Button("F");
        elem104.setMinWidth(50);
        elem104.setPrefHeight(50);
        GridPane.setHalignment(elem104, HPos.RIGHT);
        hb1.add(elem104, 17, 1);
        elem104.setStyle("-fx-background-color: #c7f2a2;");
        Button elem105= new Button("Cl");
        elem105.setMinWidth(50);
        elem105.setPrefHeight(50);
        GridPane.setHalignment(elem105, HPos.RIGHT);
        hb1.add(elem105, 17, 2);
        elem105.setStyle("-fx-background-color: #c7f2a2;");
        Button elem106= new Button("Br");
        elem106.setMinWidth(50);
        elem106.setPrefHeight(50);
        GridPane.setHalignment(elem106, HPos.RIGHT);
        hb1.add(elem106, 17, 3);
        elem106.setStyle("-fx-background-color: #c7f2a2;");
        Button elem107= new Button("I");
        elem107.setMinWidth(50);
        elem107.setPrefHeight(50);
        GridPane.setHalignment(elem107, HPos.RIGHT);
        hb1.add(elem107, 17, 4);
        elem107.setStyle("-fx-background-color: #c7f2a2;");
        Button elem108= new Button("At");
        elem108.setMinWidth(50);
        elem108.setPrefHeight(50);
        GridPane.setHalignment(elem108, HPos.RIGHT);
        hb1.add(elem108, 17, 5);
        elem108.setStyle("-fx-background-color: #84888e;");
        Button elem109= new Button("Ts");
        elem109.setMinWidth(50);
        elem109.setPrefHeight(50);
        GridPane.setHalignment(elem109, HPos.RIGHT);
        hb1.add(elem109, 17,6);
        elem109.setStyle("-fx-background-color: #c1bfc0;");
        Button elem110= new Button("Lu");
        elem110.setMinWidth(50);
        elem110.setPrefHeight(50);
        GridPane.setHalignment(elem110, HPos.RIGHT);
        hb1.add(elem110, 17, 8);
        elem110.setStyle("-fx-background-color: #f794d3;"); 
        Button elem111= new Button("Lf");
        elem111.setMinWidth(50);
        elem111.setPrefHeight(50);
        GridPane.setHalignment(elem111, HPos.RIGHT);
        hb1.add(elem111, 17, 9);
        elem111.setStyle("-fx-background-color: #d6068a;");
        
        //18 katar
        Button elem112 = new Button("He");
        elem112.setMinWidth(50);
        elem112.setPrefHeight(50);
        GridPane.setHalignment(elem112, HPos.RIGHT);
        hb1.add(elem112, 18, 0);
        elem112.setStyle("-fx-background-color: #c4fcf9;"); 
        Button elem113 = new Button("Ne");
        elem113.setMinWidth(50);
        elem113.setPrefHeight(50);
        GridPane.setHalignment(elem113, HPos.RIGHT);
        hb1.add(elem113, 18, 1);
        elem113.setStyle("-fx-background-color: #c4fcf9;");
        Button elem114 = new Button("Ar");
        elem114.setMinWidth(50);
        elem114.setPrefHeight(50);
        GridPane.setHalignment(elem114, HPos.RIGHT);
        hb1.add(elem114, 18, 2);
        elem114.setStyle("-fx-background-color: #c4fcf9;");
        Button elem115 = new Button("Kr");
        elem115.setMinWidth(50);
        elem115.setPrefHeight(50);
        GridPane.setHalignment(elem115, HPos.RIGHT);
        hb1.add(elem115, 18, 3);
        elem115.setStyle("-fx-background-color: #c4fcf9;");
        Button elem116 = new Button("Xe");
        elem116.setMinWidth(50);
        elem116.setPrefHeight(50);
        GridPane.setHalignment(elem116, HPos.RIGHT);
        hb1.add(elem116, 18, 4);
        elem116.setStyle("-fx-background-color: #c4fcf9;");
        Button elem117 = new Button("Rn");
        elem117.setMinWidth(50);
        elem117.setPrefHeight(50);
        GridPane.setHalignment(elem117, HPos.RIGHT);
        hb1.add(elem117, 18, 5);
        elem117.setStyle("-fx-background-color: #c4fcf9;");
        Button elem118 = new Button("Og");
        elem118.setMinWidth(50);
        elem118.setPrefHeight(50);
        GridPane.setHalignment(elem118, HPos.RIGHT);
        hb1.add(elem118, 18, 6);
        elem118.setStyle("-fx-background-color: #c1bfc0;");
        
        
        GridPane othfunc1 = new GridPane();
        othfunc1.setId("background5"); 
        othfunc1.setPadding(new Insets(20));
	othfunc1.setHgap(5);
	othfunc1.setVgap(5);
        othfunc4 = new Scene(othfunc1,600,400);
        scene0 = new Scene(hb0,600, 400);
        scene1 = new Scene(hb, 600, 400); 
        scene2 = new Scene(hb1, 1030, 600);
        scene0.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        scene1.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        scene2.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        othfunc4.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        
        GridPane hb2 = new GridPane(); 
        hb2.setId("background4");
	hb2.setPadding(new Insets(20));
	hb2.setHgap(5);
	hb2.setVgap(5);
        Label label11 = new Label("The main goal of this program is to help students and teachers who are involved\n"+
                                  " with chemistry or physics. this program was created to help. The idea\n"+
                                   " was borrowed from my friends and implemented in a short time.");
        label11.setTextFill(Color.web("#d6c742"));
        label11.setStyle("-fx-font-size: 15px");
        hb2.add(label11,0,0);
        Button button3 = new Button("<-");
        button3.setStyle("-fx-background-color: #36f7f4");
        button3.setMinWidth(50);
        button3.setPrefHeight(50);
        hb2.add(button3,0,10);
        button3.setOnAction(new EventHandler<ActionEvent>() {
	    	@Override
            public void handle(ActionEvent event) {
                System.out.println("Setting the scene ONE ...");
                window.setScene(scene1);
            }
	});
        forauthor3 = new Scene(hb2,600,400);
        forauthor3.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());

        //Display scene 1 at first
        window.setScene(scene0);
        window.setTitle("MY JAVA PROJECT");
        window.show();
    }
    private void message(String text, String title,ImageIcon icon){
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
    private void closeProgram(){
    	byte response = ConfirmBox.display("Close Program", "Are you really want to close ?");
    	if(response==1) {
    		System.out.println("Information stored to the FILE ...");
    		window.close();
    	}
        else{
            window.show();
        }
    }
    public static void main(String[] args) {
        Application.launch(args);
    }   
}