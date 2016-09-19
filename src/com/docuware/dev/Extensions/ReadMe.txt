This is the ReadMe.txt explaining the workarounds and differences between the JavaPlatformClient and the .NetPlatformClient

1. The Programmer's Api stayed almost completely equal. The differences are in the way the Client is working.
2. The JavaClient is based on the JerseyClient. To make this client work, you need to include several jar-files to the project
3. The JerseyClient and JAXB does a lot of serialization and deserialization by itself, there are no classes except the
XElementWrapper dealing with this. Be aware that the JAXB-binding annotations are important to make the client work.
4. Since the JerseyClient is used, all requests are performed through it. Almost all requests are delegated to the LinkResolver class,
which builds a working Request and sends this to the client.
5. To reach asynchronity the CompletableFuture class is used. This is similiar to the .Net Task-class, but not equivalent. It is 
mostly used the supplyAsync-Method, but for other Delta-Functions (Java differs between number of input/output parameters) another
Method has to be used. 
6. To Generate the client you need the xjc, the plcc, the base schemas getting compiled by the xjc, the compound schema and 
an update.xml to patch the compiled classes. You also need the extension classes which are written manually. In the update.xml
the additional methods and attributes are added to client classes, not mentioned in the base schemas (e.g. .Net Extension-Methods
are added in the classes with static method calls to there definitions). The base idea behind this is, to have one incommon 
xml file, which defines the most of the client, and a second xml file, to make specific changes needed for the java client

