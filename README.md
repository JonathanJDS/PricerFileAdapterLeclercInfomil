#### **Pricer adaper Leclerc infomil XML format**

la liste des pfi autorisés est referencée dans le preference.ini

exemple : 
[PFIs]
\# code article pour update ou creation

MDA_ARTS_MART_art               = 	300

\# libellé

MDA_ARTS_MART_lib               =   301

\# code article pour suppression

MDA_ARTS_SART_art               = 	302


le nom de la variable contient chaque balise xml
pour desactiver la balise il suffit de la mettre en commentaire 
\#



fichier en entrée ficWLST006.xml
`
<MDA MONNAIE="978" VERSION="1.1" CR="O">
   <COMMENTAIRE>Envoi journalier 000137607 prepare le 14/06/17 09:33</COMMENTAIRE>
   <ARTS>
     <MART ART="2000000883281" LIB="PULPE TOMATE EN DES NJ  3X400GR" VCR="0">
       <TAX TVA="1" />
       <PXQT>
         <PRXU PUTTC="00001.76">
           <QTEU />
         </PRXU>
       </PXQT>
       <STM CN="R" CE="01" />
       <STM CN="F" CE="221" />
       <STM CN="SF" CE="0213" />
       <DCOG CIA="1618511" CLEC="142102010" LIBS="PULPE TOMATE EN DES NJ  3X400GR" MARQ="NOTRE JARDIN" NF="SCAMARK GT1" PROM="N" APAR="LEG1 - 132">
         <IUM PUM="00001.47" LIBU="kg" />
         <CONT CONTV="001.200" LIBU="kg" CONTT="3 x 400g" />
       </DCOG>
       <DCOT LMRG="I">
         <TAS>00001.47100000.00000000.00013x400g      00000.00SCAMARK GT1             I       </TAS>
       </DCOT>
     </MART>`
