//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.docuware.dev.settings.common.DWRectangle;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.docuware.dev.schema._public.services.platform package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory  {

    private final static QName _Roles_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Roles");
    private final static QName _StampFormFieldValues_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues");
    private final static QName _DocumentLink_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentLink");
    private final static QName _DocumentApplicationProperty_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperty");
    private final static QName _DocumentLinks_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentLinks");
    private final static QName _SaveTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SaveTemplateResult");
    private final static QName _UploadTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UploadTemplateResult");
    private final static QName _CreateFormsFileResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CreateFormsFileResult");
    private final static QName _RequestDialogQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery");
    private final static QName _FormInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FormInfo");
    private final static QName _DocumentsQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsQuery");
    private final static QName _XmlSchemas_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "XmlSchemas");
    private final static QName _SequenceRequest_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest");
    private final static QName _FileCabinet_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinet");
    private final static QName _WordSearchResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "WordSearchResult");
    private final static QName _LockInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo");
    private final static QName _TokenDescription_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription");
    private final static QName _Notifications_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications");
    private final static QName _Pages_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Pages");
    private final static QName _Role_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Role");
    private final static QName _DocumentIndexFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields");
    private final static QName _WebSettings_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings");
    private final static QName _AdhocRenderingFiles_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingFiles");
    private final static QName _Page_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Page");
    private final static QName _DocumentsQueryResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsQueryResult");
    private final static QName _Users_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Users");
    private final static QName _Document_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Document");
    private final static QName _DocumentWordSearchResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentWordSearchResult");
    private final static QName _AssignmentOperation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation");
    private final static QName _Stamps_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Stamps");
    private final static QName _PagesBlockQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery");
    private final static QName _ContentMergeOperationInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo");
    private final static QName _DialogFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DialogFields");
    private final static QName _GetTemplateImageInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "GetTemplateImageInput");
    private final static QName _DocumentApplicationProperties_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties");
    private final static QName _DocumentsTransferInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo");
    private final static QName _GetTemplateImageResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "GetTemplateImageResult");
    private final static QName _Sections_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Sections");
    private final static QName _FileDownload_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload");
    private final static QName _Dialog_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Dialog");
    private final static QName _SelectListResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListResult");
    private final static QName _CopyTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CopyTemplateInput");
    private final static QName _DeleteTemplatesInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DeleteTemplatesInput");
    private final static QName _StampPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement");
    private final static QName _FileCabinets_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinets");
    private final static QName _BatchUpdateProcess_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess");
    private final static QName _Section_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Section");
    private final static QName _Annotation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation");
    private final static QName _ContentDivideOperationInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo");
    private final static QName _UserValidation_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation");
    private final static QName _ServiceDescription_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ServiceDescription");
    private final static QName _FieldValueStatisticsResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsResult");
    private final static QName _FieldValueStatisticsExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression");
    private final static QName _FormsInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FormsInput");
    private final static QName _AdhocRenderingQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery");
    private final static QName _BatchUpdateProcessData_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData");
    private final static QName _FileDownloadPage_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage");
    private final static QName _DocumentAnnotationsPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement");
    private final static QName _UploadTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UploadTemplateInput");
    private final static QName _SaveTemplateInput_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SaveTemplateInput");
    private final static QName _SelectListExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression");
    private final static QName _AnnotationsPlacement_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement");
    private final static QName _Organizations_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Organizations");
    private final static QName _SearchPositionQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery");
    private final static QName _Group_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Group");
    private final static QName _ResultListQuery_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery");
    private final static QName _DocumentActionInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo");
    private final static QName _User_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "User");
    private final static QName _Organization_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Organization");
    private final static QName _DocumentAnnotations_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotations");
    private final static QName _DialogExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression");
    private final static QName _AdhocRenderingFile_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingFile");
    private final static QName _IntegerList_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList");
    private final static QName _FileCabinetTransferInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo");
    private final static QName _CheckOutToFileSystemInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo");
    private final static QName _SequenceResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceResult");
    private final static QName _BatchUpdateIndexFieldsResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateIndexFieldsResult");
    private final static QName _CountExpression_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CountExpression");
    private final static QName _CFSStatistic_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CFSStatistic");
    private final static QName _UserDefinedSearchInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo");
    private final static QName _UpdateIndexFieldsInfo_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo");
    private final static QName _StampFormFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields");
    private final static QName _CopyTemplateResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "CopyTemplateResult");
    private final static QName _DeleteTemplatesResult_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "DeleteTemplatesResult");
    private final static QName _Dialogs_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Dialogs");
    private final static QName _SuggestionFields_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "SuggestionFields");
    private final static QName _Groups_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "Groups");
    private final static QName _PageDataContentArea_QNAME = new QName("http://dev.docuware.com/schema/public/services/platform", "ContentArea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev.schema._public.services.platform
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewerPreferences }
     * 
     */
    public ViewerPreferences createViewerPreferences() {
        return new ViewerPreferences();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult }
     * 
     */
    public DocumentsQueryTableResult createDocumentsQueryTableResult() {
        return new DocumentsQueryTableResult();
    }

    /**
     * Create an instance of {@link ViewerToolbar }
     * 
     */
    public ViewerToolbar createViewerToolbar() {
        return new ViewerToolbar();
    }

    /**
     * Create an instance of {@link DocumentsTransferInfo }
     * 
     */
    public DocumentsTransferInfo createDocumentsTransferInfo() {
        return new DocumentsTransferInfo();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link DocumentsQueryResult }
     * 
     */
    public DocumentsQueryResult createDocumentsQueryResult() {
        return new DocumentsQueryResult();
    }

    /**
     * Create an instance of {@link DocumentWordSearchResult }
     * 
     */
    public DocumentWordSearchResult createDocumentWordSearchResult() {
        return new DocumentWordSearchResult();
    }

    /**
     * Create an instance of {@link AssignmentOperation }
     * 
     */
    public AssignmentOperation createAssignmentOperation() {
        return new AssignmentOperation();
    }

    /**
     * Create an instance of {@link Stamps }
     * 
     */
    public Stamps createStamps() {
        return new Stamps();
    }

    /**
     * Create an instance of {@link AdhocRenderingFiles }
     * 
     */
    public AdhocRenderingFiles createAdhocRenderingFiles() {
        return new AdhocRenderingFiles();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link DocumentApplicationProperties }
     * 
     */
    public DocumentApplicationProperties createDocumentApplicationProperties() {
        return new DocumentApplicationProperties();
    }

    /**
     * Create an instance of {@link GetTemplateImageResult }
     * 
     */
    public GetTemplateImageResult createGetTemplateImageResult() {
        return new GetTemplateImageResult();
    }

    /**
     * Create an instance of {@link Sections }
     * 
     */
    public Sections createSections() {
        return new Sections();
    }

    /**
     * Create an instance of {@link FileDownload }
     * 
     */
    public FileDownload createFileDownload() {
        return new FileDownload();
    }

    /**
     * Create an instance of {@link Dialog }
     * 
     */
    public Dialog createDialog() {
        return new Dialog();
    }

    /**
     * Create an instance of {@link PagesBlockQuery }
     * 
     */
    public PagesBlockQuery createPagesBlockQuery() {
        return new PagesBlockQuery();
    }

    /**
     * Create an instance of {@link ContentMergeOperationInfo }
     * 
     */
    public ContentMergeOperationInfo createContentMergeOperationInfo() {
        return new ContentMergeOperationInfo();
    }

    /**
     * Create an instance of {@link DialogFields }
     * 
     */
    public DialogFields createDialogFields() {
        return new DialogFields();
    }

    /**
     * Create an instance of {@link GetTemplateImageInput }
     * 
     */
    public GetTemplateImageInput createGetTemplateImageInput() {
        return new GetTemplateImageInput();
    }

    /**
     * Create an instance of {@link CreateFormsFileResult }
     * 
     */
    public CreateFormsFileResult createCreateFormsFileResult() {
        return new CreateFormsFileResult();
    }

    /**
     * Create an instance of {@link RequestDialogQuery }
     * 
     */
    public RequestDialogQuery createRequestDialogQuery() {
        return new RequestDialogQuery();
    }

    /**
     * Create an instance of {@link FormInfo }
     * 
     */
    public FormInfo createFormInfo() {
        return new FormInfo();
    }

    /**
     * Create an instance of {@link DocumentsQuery }
     * 
     */
    public DocumentsQuery createDocumentsQuery() {
        return new DocumentsQuery();
    }

    /**
     * Create an instance of {@link XmlSchemas }
     * 
     */
    public XmlSchemas createXmlSchemas() {
        return new XmlSchemas();
    }

    /**
     * Create an instance of {@link SequenceRequest }
     * 
     */
    public SequenceRequest createSequenceRequest() {
        return new SequenceRequest();
    }

    /**
     * Create an instance of {@link FileCabinet }
     * 
     */
    public FileCabinet createFileCabinet() {
        return new FileCabinet();
    }

    /**
     * Create an instance of {@link Roles }
     * 
     */
    public Roles createRoles() {
        return new Roles();
    }

    /**
     * Create an instance of {@link StampFormFieldValues }
     * 
     */
    public StampFormFieldValues createStampFormFieldValues() {
        return new StampFormFieldValues();
    }

    /**
     * Create an instance of {@link DocumentLink }
     * 
     */
    public DocumentLink createDocumentLink() {
        return new DocumentLink();
    }

    /**
     * Create an instance of {@link DocumentApplicationProperty }
     * 
     */
    public DocumentApplicationProperty createDocumentApplicationProperty() {
        return new DocumentApplicationProperty();
    }

    /**
     * Create an instance of {@link DocumentLinks }
     * 
     */
    public DocumentLinks createDocumentLinks() {
        return new DocumentLinks();
    }

    /**
     * Create an instance of {@link SaveTemplateResult }
     * 
     */
    public SaveTemplateResult createSaveTemplateResult() {
        return new SaveTemplateResult();
    }

    /**
     * Create an instance of {@link UploadTemplateResult }
     * 
     */
    public UploadTemplateResult createUploadTemplateResult() {
        return new UploadTemplateResult();
    }

    /**
     * Create an instance of {@link Pages }
     * 
     */
    public Pages createPages() {
        return new Pages();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link DocumentIndexFields }
     * 
     */
    public DocumentIndexFields createDocumentIndexFields() {
        return new DocumentIndexFields();
    }

    /**
     * Create an instance of {@link WebSettings }
     * 
     */
    public WebSettings createWebSettings() {
        return new WebSettings();
    }

    /**
     * Create an instance of {@link WordSearchResult }
     * 
     */
    public WordSearchResult createWordSearchResult() {
        return new WordSearchResult();
    }

    /**
     * Create an instance of {@link LockInfo }
     * 
     */
    public LockInfo createLockInfo() {
        return new LockInfo();
    }

    /**
     * Create an instance of {@link TokenDescription }
     * 
     */
    public TokenDescription createTokenDescription() {
        return new TokenDescription();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link ResultListQuery }
     * 
     */
    public ResultListQuery createResultListQuery() {
        return new ResultListQuery();
    }

    /**
     * Create an instance of {@link DocumentActionInfo }
     * 
     */
    public DocumentActionInfo createDocumentActionInfo() {
        return new DocumentActionInfo();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link DocumentAnnotations }
     * 
     */
    public DocumentAnnotations createDocumentAnnotations() {
        return new DocumentAnnotations();
    }

    /**
     * Create an instance of {@link DialogExpression }
     * 
     */
    public DialogExpression createDialogExpression() {
        return new DialogExpression();
    }

    /**
     * Create an instance of {@link AdhocRenderingFile }
     * 
     */
    public AdhocRenderingFile createAdhocRenderingFile() {
        return new AdhocRenderingFile();
    }

    /**
     * Create an instance of {@link SearchPositionQuery }
     * 
     */
    public SearchPositionQuery createSearchPositionQuery() {
        return new SearchPositionQuery();
    }

    /**
     * Create an instance of {@link UpdateIndexFieldsInfo }
     * 
     */
    public UpdateIndexFieldsInfo createUpdateIndexFieldsInfo() {
        return new UpdateIndexFieldsInfo();
    }

    /**
     * Create an instance of {@link FormFieldValues }
     * 
     */
    public FormFieldValues createFormFieldValues() {
        return new FormFieldValues();
    }

    /**
     * Create an instance of {@link CopyTemplateResult }
     * 
     */
    public CopyTemplateResult createCopyTemplateResult() {
        return new CopyTemplateResult();
    }

    /**
     * Create an instance of {@link DeleteTemplatesResult }
     * 
     */
    public DeleteTemplatesResult createDeleteTemplatesResult() {
        return new DeleteTemplatesResult();
    }

    /**
     * Create an instance of {@link DialogInfos }
     * 
     */
    public DialogInfos createDialogInfos() {
        return new DialogInfos();
    }

    /**
     * Create an instance of {@link SuggestionFields }
     * 
     */
    public SuggestionFields createSuggestionFields() {
        return new SuggestionFields();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link IntegerList }
     * 
     */
    public IntegerList createIntegerList() {
        return new IntegerList();
    }

    /**
     * Create an instance of {@link FileCabinetTransferInfo }
     * 
     */
    public FileCabinetTransferInfo createFileCabinetTransferInfo() {
        return new FileCabinetTransferInfo();
    }

    /**
     * Create an instance of {@link CheckOutToFileSystemInfo }
     * 
     */
    public CheckOutToFileSystemInfo createCheckOutToFileSystemInfo() {
        return new CheckOutToFileSystemInfo();
    }

    /**
     * Create an instance of {@link SequenceResult }
     * 
     */
    public SequenceResult createSequenceResult() {
        return new SequenceResult();
    }

    /**
     * Create an instance of {@link BatchUpdateIndexFieldsResult }
     * 
     */
    public BatchUpdateIndexFieldsResult createBatchUpdateIndexFieldsResult() {
        return new BatchUpdateIndexFieldsResult();
    }

    /**
     * Create an instance of {@link CountExpression }
     * 
     */
    public CountExpression createCountExpression() {
        return new CountExpression();
    }

    /**
     * Create an instance of {@link CFSStatisticGeneral }
     * 
     */
    public CFSStatisticGeneral createCFSStatisticGeneral() {
        return new CFSStatisticGeneral();
    }

    /**
     * Create an instance of {@link UserDefinedSearchInfo }
     * 
     */
    public UserDefinedSearchInfo createUserDefinedSearchInfo() {
        return new UserDefinedSearchInfo();
    }

    /**
     * Create an instance of {@link UserValidation }
     * 
     */
    public UserValidation createUserValidation() {
        return new UserValidation();
    }

    /**
     * Create an instance of {@link ServiceDescription }
     * 
     */
    public ServiceDescription createServiceDescription() {
        return new ServiceDescription();
    }

    /**
     * Create an instance of {@link SelectListResult }
     * 
     */
    public SelectListResult createSelectListResult() {
        return new SelectListResult();
    }

    /**
     * Create an instance of {@link CopyTemplateInput }
     * 
     */
    public CopyTemplateInput createCopyTemplateInput() {
        return new CopyTemplateInput();
    }

    /**
     * Create an instance of {@link DeleteTemplatesInput }
     * 
     */
    public DeleteTemplatesInput createDeleteTemplatesInput() {
        return new DeleteTemplatesInput();
    }

    /**
     * Create an instance of {@link StampPlacement }
     * 
     */
    public StampPlacement createStampPlacement() {
        return new StampPlacement();
    }

    /**
     * Create an instance of {@link FileCabinets }
     * 
     */
    public FileCabinets createFileCabinets() {
        return new FileCabinets();
    }

    /**
     * Create an instance of {@link BatchUpdateProcess }
     * 
     */
    public BatchUpdateProcess createBatchUpdateProcess() {
        return new BatchUpdateProcess();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link ContentDivideOperationInfo }
     * 
     */
    public ContentDivideOperationInfo createContentDivideOperationInfo() {
        return new ContentDivideOperationInfo();
    }

    /**
     * Create an instance of {@link UploadTemplateInput }
     * 
     */
    public UploadTemplateInput createUploadTemplateInput() {
        return new UploadTemplateInput();
    }

    /**
     * Create an instance of {@link SaveTemplateInput }
     * 
     */
    public SaveTemplateInput createSaveTemplateInput() {
        return new SaveTemplateInput();
    }

    /**
     * Create an instance of {@link SelectListExpression }
     * 
     */
    public SelectListExpression createSelectListExpression() {
        return new SelectListExpression();
    }

    /**
     * Create an instance of {@link AnnotationsPlacement }
     * 
     */
    public AnnotationsPlacement createAnnotationsPlacement() {
        return new AnnotationsPlacement();
    }

    /**
     * Create an instance of {@link Organizations }
     * 
     */
    public Organizations createOrganizations() {
        return new Organizations();
    }

    /**
     * Create an instance of {@link FieldValueStatisticsResult }
     * 
     */
    public FieldValueStatisticsResult createFieldValueStatisticsResult() {
        return new FieldValueStatisticsResult();
    }

    /**
     * Create an instance of {@link FieldValueStatisticsExpression }
     * 
     */
    public FieldValueStatisticsExpression createFieldValueStatisticsExpression() {
        return new FieldValueStatisticsExpression();
    }

    /**
     * Create an instance of {@link FormsInput }
     * 
     */
    public FormsInput createFormsInput() {
        return new FormsInput();
    }

    /**
     * Create an instance of {@link AdhocRenderingQuery }
     * 
     */
    public AdhocRenderingQuery createAdhocRenderingQuery() {
        return new AdhocRenderingQuery();
    }

    /**
     * Create an instance of {@link BatchUpdateProcessData }
     * 
     */
    public BatchUpdateProcessData createBatchUpdateProcessData() {
        return new BatchUpdateProcessData();
    }

    /**
     * Create an instance of {@link FileDownloadPage }
     * 
     */
    public FileDownloadPage createFileDownloadPage() {
        return new FileDownloadPage();
    }

    /**
     * Create an instance of {@link DocumentAnnotationsPlacement }
     * 
     */
    public DocumentAnnotationsPlacement createDocumentAnnotationsPlacement() {
        return new DocumentAnnotationsPlacement();
    }

    /**
     * Create an instance of {@link RadioGroup }
     * 
     */
    public RadioGroup createRadioGroup() {
        return new RadioGroup();
    }

    /**
     * Create an instance of {@link FormFieldValue }
     * 
     */
    public FormFieldValue createFormFieldValue() {
        return new FormFieldValue();
    }

    /**
     * Create an instance of {@link DialogInfo }
     * 
     */
    public DialogInfo createDialogInfo() {
        return new DialogInfo();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldKeywords }
     * 
     */
    public DocumentIndexFieldKeywords createDocumentIndexFieldKeywords() {
        return new DocumentIndexFieldKeywords();
    }

    /**
     * Create an instance of {@link Rights }
     * 
     */
    public Rights createRights() {
        return new Rights();
    }

    /**
     * Create an instance of {@link CFSSpecificValue }
     * 
     */
    public CFSSpecificValue createCFSSpecificValue() {
        return new CFSSpecificValue();
    }

    /**
     * Create an instance of {@link SuggestionValue }
     * 
     */
    public SuggestionValue createSuggestionValue() {
        return new SuggestionValue();
    }

    /**
     * Create an instance of {@link SortedField }
     * 
     */
    public SortedField createSortedField() {
        return new SortedField();
    }

    /**
     * Create an instance of {@link FontSettings }
     * 
     */
    public FontSettings createFontSettings() {
        return new FontSettings();
    }

    /**
     * Create an instance of {@link CountResult }
     * 
     */
    public CountResult createCountResult() {
        return new CountResult();
    }

    /**
     * Create an instance of {@link WorkInstance }
     * 
     */
    public WorkInstance createWorkInstance() {
        return new WorkInstance();
    }

    /**
     * Create an instance of {@link StampFormField }
     * 
     */
    public StampFormField createStampFormField() {
        return new StampFormField();
    }

    /**
     * Create an instance of {@link TextStampEntry }
     * 
     */
    public TextStampEntry createTextStampEntry() {
        return new TextStampEntry();
    }

    /**
     * Create an instance of {@link DocumentIndexFieldValue }
     * 
     */
    public DocumentIndexFieldValue createDocumentIndexFieldValue() {
        return new DocumentIndexFieldValue();
    }

    /**
     * Create an instance of {@link SelectListInfos }
     * 
     */
    public SelectListInfos createSelectListInfos() {
        return new SelectListInfos();
    }

    /**
     * Create an instance of {@link BatchUpdateResultItem }
     * 
     */
    public BatchUpdateResultItem createBatchUpdateResultItem() {
        return new BatchUpdateResultItem();
    }

    /**
     * Create an instance of {@link FormTemplates }
     * 
     */
    public FormTemplates createFormTemplates() {
        return new FormTemplates();
    }

    /**
     * Create an instance of {@link AnnotationRectangle }
     * 
     */
    public AnnotationRectangle createAnnotationRectangle() {
        return new AnnotationRectangle();
    }

    /**
     * Create an instance of {@link ExportSettings }
     * 
     */
    public ExportSettings createExportSettings() {
        return new ExportSettings();
    }

    /**
     * Create an instance of {@link DialogPropertiesTreeView }
     * 
     */
    public DialogPropertiesTreeView createDialogPropertiesTreeView() {
        return new DialogPropertiesTreeView();
    }

    /**
     * Create an instance of {@link LineEntry }
     * 
     */
    public LineEntry createLineEntry() {
        return new LineEntry();
    }

    /**
     * Create an instance of {@link SignatureField }
     * 
     */
    public SignatureField createSignatureField() {
        return new SignatureField();
    }

    /**
     * Create an instance of {@link Font }
     * 
     */
    public Font createFont() {
        return new Font();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link ApplicationPreferences }
     * 
     */
    public ApplicationPreferences createApplicationPreferences() {
        return new ApplicationPreferences();
    }

    /**
     * Create an instance of {@link AppendActionDocuments }
     * 
     */
    public AppendActionDocuments createAppendActionDocuments() {
        return new AppendActionDocuments();
    }

    /**
     * Create an instance of {@link NewUser }
     * 
     */
    public NewUser createNewUser() {
        return new NewUser();
    }

    /**
     * Create an instance of {@link Stroke }
     * 
     */
    public Stroke createStroke() {
        return new Stroke();
    }

    /**
     * Create an instance of {@link SubstitutionLists }
     * 
     */
    public SubstitutionLists createSubstitutionLists() {
        return new SubstitutionLists();
    }

    /**
     * Create an instance of {@link ViewerToolbarControl }
     * 
     */
    public ViewerToolbarControl createViewerToolbarControl() {
        return new ViewerToolbarControl();
    }

    /**
     * Create an instance of {@link AnnotationToolSettings }
     * 
     */
    public AnnotationToolSettings createAnnotationToolSettings() {
        return new AnnotationToolSettings();
    }

    /**
     * Create an instance of {@link TextAnnotationToolSettings }
     * 
     */
    public TextAnnotationToolSettings createTextAnnotationToolSettings() {
        return new TextAnnotationToolSettings();
    }

    /**
     * Create an instance of {@link RectEntry }
     * 
     */
    public RectEntry createRectEntry() {
        return new RectEntry();
    }

    /**
     * Create an instance of {@link DeleteEntry }
     * 
     */
    public DeleteEntry createDeleteEntry() {
        return new DeleteEntry();
    }

    /**
     * Create an instance of {@link DialogPropertiesSearch }
     * 
     */
    public DialogPropertiesSearch createDialogPropertiesSearch() {
        return new DialogPropertiesSearch();
    }

    /**
     * Create an instance of {@link TextStamp }
     * 
     */
    public TextStamp createTextStamp() {
        return new TextStamp();
    }

    /**
     * Create an instance of {@link ServiceDescriptionDocumentation }
     * 
     */
    public ServiceDescriptionDocumentation createServiceDescriptionDocumentation() {
        return new ServiceDescriptionDocumentation();
    }

    /**
     * Create an instance of {@link SelectListValues }
     * 
     */
    public SelectListValues createSelectListValues() {
        return new SelectListValues();
    }

    /**
     * Create an instance of {@link SortedFieldsList }
     * 
     */
    public SortedFieldsList createSortedFieldsList() {
        return new SortedFieldsList();
    }

    /**
     * Create an instance of {@link CheckOutResult }
     * 
     */
    public CheckOutResult createCheckOutResult() {
        return new CheckOutResult();
    }

    /**
     * Create an instance of {@link SelectListInfo }
     * 
     */
    public SelectListInfo createSelectListInfo() {
        return new SelectListInfo();
    }

    /**
     * Create an instance of {@link EntryBase }
     * 
     */
    public EntryBase createEntryBase() {
        return new EntryBase();
    }

    /**
     * Create an instance of {@link BitmapStampEntry }
     * 
     */
    public BitmapStampEntry createBitmapStampEntry() {
        return new BitmapStampEntry();
    }

    /**
     * Create an instance of {@link Headline }
     * 
     */
    public Headline createHeadline() {
        return new Headline();
    }

    /**
     * Create an instance of {@link ExportQuery }
     * 
     */
    public ExportQuery createExportQuery() {
        return new ExportQuery();
    }

    /**
     * Create an instance of {@link RotatePageParameters }
     * 
     */
    public RotatePageParameters createRotatePageParameters() {
        return new RotatePageParameters();
    }

    /**
     * Create an instance of {@link ContentAreaPreferences }
     * 
     */
    public ContentAreaPreferences createContentAreaPreferences() {
        return new ContentAreaPreferences();
    }

    /**
     * Create an instance of {@link FormProperties }
     * 
     */
    public FormProperties createFormProperties() {
        return new FormProperties();
    }

    /**
     * Create an instance of {@link WordSearchResultWordHits }
     * 
     */
    public WordSearchResultWordHits createWordSearchResultWordHits() {
        return new WordSearchResultWordHits();
    }

    /**
     * Create an instance of {@link StampBase }
     * 
     */
    public StampBase createStampBase() {
        return new StampBase();
    }

    /**
     * Create an instance of {@link GeneralSettings }
     * 
     */
    public GeneralSettings createGeneralSettings() {
        return new GeneralSettings();
    }

    /**
     * Create an instance of {@link MergeAnnotationsParameters }
     * 
     */
    public MergeAnnotationsParameters createMergeAnnotationsParameters() {
        return new MergeAnnotationsParameters();
    }

    /**
     * Create an instance of {@link TableResultRow }
     * 
     */
    public TableResultRow createTableResultRow() {
        return new TableResultRow();
    }

    /**
     * Create an instance of {@link DocumentFlags }
     * 
     */
    public DocumentFlags createDocumentFlags() {
        return new DocumentFlags();
    }

    /**
     * Create an instance of {@link WorkflowAreaPreferences }
     * 
     */
    public WorkflowAreaPreferences createWorkflowAreaPreferences() {
        return new WorkflowAreaPreferences();
    }

    /**
     * Create an instance of {@link EnhanceImageParameters }
     * 
     */
    public EnhanceImageParameters createEnhanceImageParameters() {
        return new EnhanceImageParameters();
    }

    /**
     * Create an instance of {@link CFSStatisticSpecific }
     * 
     */
    public CFSStatisticSpecific createCFSStatisticSpecific() {
        return new CFSStatisticSpecific();
    }

    /**
     * Create an instance of {@link XmlSchema }
     * 
     */
    public XmlSchema createXmlSchema() {
        return new XmlSchema();
    }

    /**
     * Create an instance of {@link ViewerDialog }
     * 
     */
    public ViewerDialog createViewerDialog() {
        return new ViewerDialog();
    }

    /**
     * Create an instance of {@link DocumentIndexField }
     * 
     */
    public DocumentIndexField createDocumentIndexField() {
        return new DocumentIndexField();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link WebFormOption }
     * 
     */
    public WebFormOption createWebFormOption() {
        return new WebFormOption();
    }

    /**
     * Create an instance of {@link CheckOutActionParameters }
     * 
     */
    public CheckOutActionParameters createCheckOutActionParameters() {
        return new CheckOutActionParameters();
    }

    /**
     * Create an instance of {@link SingleColumnSelectListValues }
     * 
     */
    public SingleColumnSelectListValues createSingleColumnSelectListValues() {
        return new SingleColumnSelectListValues();
    }

    /**
     * Create an instance of {@link ImportResultEntry }
     * 
     */
    public ImportResultEntry createImportResultEntry() {
        return new ImportResultEntry();
    }

    /**
     * Create an instance of {@link DialogPropertiesResultList }
     * 
     */
    public DialogPropertiesResultList createDialogPropertiesResultList() {
        return new DialogPropertiesResultList();
    }

    /**
     * Create an instance of {@link SynchronizationSettings }
     * 
     */
    public SynchronizationSettings createSynchronizationSettings() {
        return new SynchronizationSettings();
    }

    /**
     * Create an instance of {@link UploadedFileChunk }
     * 
     */
    public UploadedFileChunk createUploadedFileChunk() {
        return new UploadedFileChunk();
    }

    /**
     * Create an instance of {@link ImportEntryVersion }
     * 
     */
    public ImportEntryVersion createImportEntryVersion() {
        return new ImportEntryVersion();
    }

    /**
     * Create an instance of {@link NumberField }
     * 
     */
    public NumberField createNumberField() {
        return new NumberField();
    }

    /**
     * Create an instance of {@link CheckGroup }
     * 
     */
    public CheckGroup createCheckGroup() {
        return new CheckGroup();
    }

    /**
     * Create an instance of {@link FlagConditions }
     * 
     */
    public FlagConditions createFlagConditions() {
        return new FlagConditions();
    }

    /**
     * Create an instance of {@link ImportSettings }
     * 
     */
    public ImportSettings createImportSettings() {
        return new ImportSettings();
    }

    /**
     * Create an instance of {@link WebFormListOptions }
     * 
     */
    public WebFormListOptions createWebFormListOptions() {
        return new WebFormListOptions();
    }

    /**
     * Create an instance of {@link DateField }
     * 
     */
    public DateField createDateField() {
        return new DateField();
    }

    /**
     * Create an instance of {@link ServiceDescriptionTests }
     * 
     */
    public ServiceDescriptionTests createServiceDescriptionTests() {
        return new ServiceDescriptionTests();
    }

    /**
     * Create an instance of {@link DecisionStampPlacement }
     * 
     */
    public DecisionStampPlacement createDecisionStampPlacement() {
        return new DecisionStampPlacement();
    }

    /**
     * Create an instance of {@link WebClientPreferences }
     * 
     */
    public WebClientPreferences createWebClientPreferences() {
        return new WebClientPreferences();
    }

    /**
     * Create an instance of {@link MultiLineTextField }
     * 
     */
    public MultiLineTextField createMultiLineTextField() {
        return new MultiLineTextField();
    }

    /**
     * Create an instance of {@link BatchUpdateDocumentsSource }
     * 
     */
    public BatchUpdateDocumentsSource createBatchUpdateDocumentsSource() {
        return new BatchUpdateDocumentsSource();
    }

    /**
     * Create an instance of {@link TextEntry }
     * 
     */
    public TextEntry createTextEntry() {
        return new TextEntry();
    }

    /**
     * Create an instance of {@link DialogProperties }
     * 
     */
    public DialogProperties createDialogProperties() {
        return new DialogProperties();
    }

    /**
     * Create an instance of {@link Zones }
     * 
     */
    public Zones createZones() {
        return new Zones();
    }

    /**
     * Create an instance of {@link ImageField }
     * 
     */
    public ImageField createImageField() {
        return new ImageField();
    }

    /**
     * Create an instance of {@link TemplateGUIDS }
     * 
     */
    public TemplateGUIDS createTemplateGUIDS() {
        return new TemplateGUIDS();
    }

    /**
     * Create an instance of {@link SubstitutionList }
     * 
     */
    public SubstitutionList createSubstitutionList() {
        return new SubstitutionList();
    }

    /**
     * Create an instance of {@link DialogField }
     * 
     */
    public DialogField createDialogField() {
        return new DialogField();
    }

    /**
     * Create an instance of {@link RegionalSettings }
     * 
     */
    public RegionalSettings createRegionalSettings() {
        return new RegionalSettings();
    }

    /**
     * Create an instance of {@link FieldsList }
     * 
     */
    public FieldsList createFieldsList() {
        return new FieldsList();
    }

    /**
     * Create an instance of {@link SubmissionOptions }
     * 
     */
    public SubmissionOptions createSubmissionOptions() {
        return new SubmissionOptions();
    }

    /**
     * Create an instance of {@link WebFormControls }
     * 
     */
    public WebFormControls createWebFormControls() {
        return new WebFormControls();
    }

    /**
     * Create an instance of {@link FileCabinetField }
     * 
     */
    public FileCabinetField createFileCabinetField() {
        return new FileCabinetField();
    }

    /**
     * Create an instance of {@link DecisionFormFieldValue }
     * 
     */
    public DecisionFormFieldValue createDecisionFormFieldValue() {
        return new DecisionFormFieldValue();
    }

    /**
     * Create an instance of {@link DropDownList }
     * 
     */
    public DropDownList createDropDownList() {
        return new DropDownList();
    }

    /**
     * Create an instance of {@link CountResultItem }
     * 
     */
    public CountResultItem createCountResultItem() {
        return new CountResultItem();
    }

    /**
     * Create an instance of {@link OutOfOffice }
     * 
     */
    public OutOfOffice createOutOfOffice() {
        return new OutOfOffice();
    }

    /**
     * Create an instance of {@link AttachFileField }
     * 
     */
    public AttachFileField createAttachFileField() {
        return new AttachFileField();
    }

    /**
     * Create an instance of {@link Favorites }
     * 
     */
    public Favorites createFavorites() {
        return new Favorites();
    }

    /**
     * Create an instance of {@link StampField }
     * 
     */
    public StampField createStampField() {
        return new StampField();
    }

    /**
     * Create an instance of {@link FavoriteItems }
     * 
     */
    public FavoriteItems createFavoriteItems() {
        return new FavoriteItems();
    }

    /**
     * Create an instance of {@link ApplicationPreferencesHolder }
     * 
     */
    public ApplicationPreferencesHolder createApplicationPreferencesHolder() {
        return new ApplicationPreferencesHolder();
    }

    /**
     * Create an instance of {@link TableResultHeader }
     * 
     */
    public TableResultHeader createTableResultHeader() {
        return new TableResultHeader();
    }

    /**
     * Create an instance of {@link FieldMappings }
     * 
     */
    public FieldMappings createFieldMappings() {
        return new FieldMappings();
    }

    /**
     * Create an instance of {@link PolyLineEntry }
     * 
     */
    public PolyLineEntry createPolyLineEntry() {
        return new PolyLineEntry();
    }

    /**
     * Create an instance of {@link ServiceDescriptionStatistics }
     * 
     */
    public ServiceDescriptionStatistics createServiceDescriptionStatistics() {
        return new ServiceDescriptionStatistics();
    }

    /**
     * Create an instance of {@link DocumentVersion }
     * 
     */
    public DocumentVersion createDocumentVersion() {
        return new DocumentVersion();
    }

    /**
     * Create an instance of {@link FixedText }
     * 
     */
    public FixedText createFixedText() {
        return new FixedText();
    }

    /**
     * Create an instance of {@link ImportResult }
     * 
     */
    public ImportResult createImportResult() {
        return new ImportResult();
    }

    /**
     * Create an instance of {@link PolyLineStampEntry }
     * 
     */
    public PolyLineStampEntry createPolyLineStampEntry() {
        return new PolyLineStampEntry();
    }

    /**
     * Create an instance of {@link Stamp }
     * 
     */
    public Stamp createStamp() {
        return new Stamp();
    }

    /**
     * Create an instance of {@link LoginInfo }
     * 
     */
    public LoginInfo createLoginInfo() {
        return new LoginInfo();
    }

    /**
     * Create an instance of {@link WordSearchResultWordHit }
     * 
     */
    public WordSearchResultWordHit createWordSearchResultWordHit() {
        return new WordSearchResultWordHit();
    }

    /**
     * Create an instance of {@link BatchUpdateDialogExpressionSource }
     * 
     */
    public BatchUpdateDialogExpressionSource createBatchUpdateDialogExpressionSource() {
        return new BatchUpdateDialogExpressionSource();
    }

    /**
     * Create an instance of {@link FileCabinetFields }
     * 
     */
    public FileCabinetFields createFileCabinetFields() {
        return new FileCabinetFields();
    }

    /**
     * Create an instance of {@link Layer }
     * 
     */
    public Layer createLayer() {
        return new Layer();
    }

    /**
     * Create an instance of {@link OrganizationUser }
     * 
     */
    public OrganizationUser createOrganizationUser() {
        return new OrganizationUser();
    }

    /**
     * Create an instance of {@link PageHits }
     * 
     */
    public PageHits createPageHits() {
        return new PageHits();
    }

    /**
     * Create an instance of {@link BasketAreaPreferences }
     * 
     */
    public BasketAreaPreferences createBasketAreaPreferences() {
        return new BasketAreaPreferences();
    }

    /**
     * Create an instance of {@link WordSearchResultPageHit }
     * 
     */
    public WordSearchResultPageHit createWordSearchResultPageHit() {
        return new WordSearchResultPageHit();
    }

    /**
     * Create an instance of {@link AdditionalOrganizationInfo }
     * 
     */
    public AdditionalOrganizationInfo createAdditionalOrganizationInfo() {
        return new AdditionalOrganizationInfo();
    }

    /**
     * Create an instance of {@link WebClientLayout }
     * 
     */
    public WebClientLayout createWebClientLayout() {
        return new WebClientLayout();
    }

    /**
     * Create an instance of {@link CountPlusValue }
     * 
     */
    public CountPlusValue createCountPlusValue() {
        return new CountPlusValue();
    }

    /**
     * Create an instance of {@link TextField }
     * 
     */
    public TextField createTextField() {
        return new TextField();
    }

    /**
     * Create an instance of {@link PointAndShootInfo }
     * 
     */
    public PointAndShootInfo createPointAndShootInfo() {
        return new PointAndShootInfo();
    }

    /**
     * Create an instance of {@link AppendActionParameters }
     * 
     */
    public AppendActionParameters createAppendActionParameters() {
        return new AppendActionParameters();
    }

    /**
     * Create an instance of {@link CreatedInfo }
     * 
     */
    public CreatedInfo createCreatedInfo() {
        return new CreatedInfo();
    }

    /**
     * Create an instance of {@link LogicalOperator }
     * 
     */
    public LogicalOperator createLogicalOperator() {
        return new LogicalOperator();
    }

    /**
     * Create an instance of {@link SectionAnnotationsPlacement }
     * 
     */
    public SectionAnnotationsPlacement createSectionAnnotationsPlacement() {
        return new SectionAnnotationsPlacement();
    }

    /**
     * Create an instance of {@link DialogExpressionCondition }
     * 
     */
    public DialogExpressionCondition createDialogExpressionCondition() {
        return new DialogExpressionCondition();
    }

    /**
     * Create an instance of {@link CheckInActionParameters }
     * 
     */
    public CheckInActionParameters createCheckInActionParameters() {
        return new CheckInActionParameters();
    }

    /**
     * Create an instance of {@link BitmapStamp }
     * 
     */
    public BitmapStamp createBitmapStamp() {
        return new BitmapStamp();
    }

    /**
     * Create an instance of {@link StrokeStamp }
     * 
     */
    public StrokeStamp createStrokeStamp() {
        return new StrokeStamp();
    }

    /**
     * Create an instance of {@link SubstitutionRules }
     * 
     */
    public SubstitutionRules createSubstitutionRules() {
        return new SubstitutionRules();
    }

    /**
     * Create an instance of {@link MultiFCSearches }
     * 
     */
    public MultiFCSearches createMultiFCSearches() {
        return new MultiFCSearches();
    }

    /**
     * Create an instance of {@link SelectListValuesQuery }
     * 
     */
    public SelectListValuesQuery createSelectListValuesQuery() {
        return new SelectListValuesQuery();
    }

    /**
     * Create an instance of {@link FieldMapping }
     * 
     */
    public FieldMapping createFieldMapping() {
        return new FieldMapping();
    }

    /**
     * Create an instance of {@link MultiFCSearchConfiguration }
     * 
     */
    public MultiFCSearchConfiguration createMultiFCSearchConfiguration() {
        return new MultiFCSearchConfiguration();
    }

    /**
     * Create an instance of {@link AttachFileInfo }
     * 
     */
    public AttachFileInfo createAttachFileInfo() {
        return new AttachFileInfo();
    }

    /**
     * Create an instance of {@link AnnotationPoint }
     * 
     */
    public AnnotationPoint createAnnotationPoint() {
        return new AnnotationPoint();
    }

    /**
     * Create an instance of {@link FieldValueStatistics }
     * 
     */
    public FieldValueStatistics createFieldValueStatistics() {
        return new FieldValueStatistics();
    }

    /**
     * Create an instance of {@link FormTemplate }
     * 
     */
    public FormTemplate createFormTemplate() {
        return new FormTemplate();
    }

    /**
     * Create an instance of {@link Zone }
     * 
     */
    public Zone createZone() {
        return new Zone();
    }

    /**
     * Create an instance of {@link SuggestionField }
     * 
     */
    public SuggestionField createSuggestionField() {
        return new SuggestionField();
    }

    /**
     * Create an instance of {@link NullTableResultValue }
     * 
     */
    public NullTableResultValue createNullTableResultValue() {
        return new NullTableResultValue();
    }

    /**
     * Create an instance of {@link XmlDSigContentType }
     * 
     */
    public XmlDSigContentType createXmlDSigContentType() {
        return new XmlDSigContentType();
    }

    /**
     * Create an instance of {@link WebFormOptions }
     * 
     */
    public WebFormOptions createWebFormOptions() {
        return new WebFormOptions();
    }

    /**
     * Create an instance of {@link ConfigurationRights }
     * 
     */
    public ConfigurationRights createConfigurationRights() {
        return new ConfigurationRights();
    }

    /**
     * Create an instance of {@link ResultDialogFunction }
     * 
     */
    public ResultDialogFunction createResultDialogFunction() {
        return new ResultDialogFunction();
    }

    /**
     * Create an instance of {@link DocumentActionParameters }
     * 
     */
    public DocumentActionParameters createDocumentActionParameters() {
        return new DocumentActionParameters();
    }

    /**
     * Create an instance of {@link PageData }
     * 
     */
    public PageData createPageData() {
        return new PageData();
    }

    /**
     * Create an instance of {@link DialogPropertiesTaskList }
     * 
     */
    public DialogPropertiesTaskList createDialogPropertiesTaskList() {
        return new DialogPropertiesTaskList();
    }

    /**
     * Create an instance of {@link SectionAnnotation }
     * 
     */
    public SectionAnnotation createSectionAnnotation() {
        return new SectionAnnotation();
    }

    /**
     * Create an instance of {@link SubstitutionRule }
     * 
     */
    public SubstitutionRule createSubstitutionRule() {
        return new SubstitutionRule();
    }

    /**
     * Create an instance of {@link SizedAnnotationToolSettings }
     * 
     */
    public SizedAnnotationToolSettings createSizedAnnotationToolSettings() {
        return new SizedAnnotationToolSettings();
    }

    /**
     * Create an instance of {@link WorkAreaPreferences }
     * 
     */
    public WorkAreaPreferences createWorkAreaPreferences() {
        return new WorkAreaPreferences();
    }

    /**
     * Create an instance of {@link ViewerPreferences.Annotations }
     * 
     */
    public ViewerPreferences.Annotations createViewerPreferencesAnnotations() {
        return new ViewerPreferences.Annotations();
    }

    /**
     * Create an instance of {@link ViewerPreferences.Toolbars }
     * 
     */
    public ViewerPreferences.Toolbars createViewerPreferencesToolbars() {
        return new ViewerPreferences.Toolbars();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult.Headers }
     * 
     */
    public DocumentsQueryTableResult.Headers createDocumentsQueryTableResultHeaders() {
        return new DocumentsQueryTableResult.Headers();
    }

    /**
     * Create an instance of {@link DocumentsQueryTableResult.Rows }
     * 
     */
    public DocumentsQueryTableResult.Rows createDocumentsQueryTableResultRows() {
        return new DocumentsQueryTableResult.Rows();
    }

    /**
     * Create an instance of {@link ViewerToolbar.Controls }
     * 
     */
    public ViewerToolbar.Controls createViewerToolbarControls() {
        return new ViewerToolbar.Controls();
    }

    /**
     * Create an instance of {@link DocumentsTransferInfo.Documents }
     * 
     */
    public DocumentsTransferInfo.Documents createDocumentsTransferInfoDocuments() {
        return new DocumentsTransferInfo.Documents();
    }

    /**
     * Create an instance of {@link Document.Preview }
     * 
     */
    public Document.Preview createDocumentPreview() {
        return new Document.Preview();
    }

    /**
     * Create an instance of {@link DocumentsQueryResult.Items }
     * 
     */
    public DocumentsQueryResult.Items createDocumentsQueryResultItems() {
        return new DocumentsQueryResult.Items();
    }

    /**
     * Create an instance of {@link DocumentWordSearchResult.SectionHits }
     * 
     */
    public DocumentWordSearchResult.SectionHits createDocumentWordSearchResultSectionHits() {
        return new DocumentWordSearchResult.SectionHits();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Roles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Roles")
    public JAXBElement<Roles> createRoles(Roles value) {
        return new JAXBElement<Roles>(_Roles_QNAME, Roles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampFormFieldValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFieldValues")
    public JAXBElement<StampFormFieldValues> createStampFormFieldValues(StampFormFieldValues value) {
        return new JAXBElement<StampFormFieldValues>(_StampFormFieldValues_QNAME, StampFormFieldValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLink")
    public JAXBElement<DocumentLink> createDocumentLink(DocumentLink value) {
        return new JAXBElement<DocumentLink>(_DocumentLink_QNAME, DocumentLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperty")
    public JAXBElement<DocumentApplicationProperty> createDocumentApplicationProperty(DocumentApplicationProperty value) {
        return new JAXBElement<DocumentApplicationProperty>(_DocumentApplicationProperty_QNAME, DocumentApplicationProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentLinks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLinks")
    public JAXBElement<DocumentLinks> createDocumentLinks(DocumentLinks value) {
        return new JAXBElement<DocumentLinks>(_DocumentLinks_QNAME, DocumentLinks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateResult")
    public JAXBElement<SaveTemplateResult> createSaveTemplateResult(SaveTemplateResult value) {
        return new JAXBElement<SaveTemplateResult>(_SaveTemplateResult_QNAME, SaveTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTemplateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateResult")
    public JAXBElement<UploadTemplateResult> createUploadTemplateResult(UploadTemplateResult value) {
        return new JAXBElement<UploadTemplateResult>(_UploadTemplateResult_QNAME, UploadTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFormsFileResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CreateFormsFileResult")
    public JAXBElement<CreateFormsFileResult> createCreateFormsFileResult(CreateFormsFileResult value) {
        return new JAXBElement<CreateFormsFileResult>(_CreateFormsFileResult_QNAME, CreateFormsFileResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDialogQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "RequestDialogQuery")
    public JAXBElement<RequestDialogQuery> createRequestDialogQuery(RequestDialogQuery value) {
        return new JAXBElement<RequestDialogQuery>(_RequestDialogQuery_QNAME, RequestDialogQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormInfo")
    public JAXBElement<FormInfo> createFormInfo(FormInfo value) {
        return new JAXBElement<FormInfo>(_FormInfo_QNAME, FormInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQuery")
    public JAXBElement<DocumentsQuery> createDocumentsQuery(DocumentsQuery value) {
        return new JAXBElement<DocumentsQuery>(_DocumentsQuery_QNAME, DocumentsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlSchemas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "XmlSchemas")
    public JAXBElement<XmlSchemas> createXmlSchemas(XmlSchemas value) {
        return new JAXBElement<XmlSchemas>(_XmlSchemas_QNAME, XmlSchemas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceRequest")
    public JAXBElement<SequenceRequest> createSequenceRequest(SequenceRequest value) {
        return new JAXBElement<SequenceRequest>(_SequenceRequest_QNAME, SequenceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinet")
    public JAXBElement<FileCabinet> createFileCabinet(FileCabinet value) {
        return new JAXBElement<FileCabinet>(_FileCabinet_QNAME, FileCabinet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WordSearchResult")
    public JAXBElement<WordSearchResult> createWordSearchResult(WordSearchResult value) {
        return new JAXBElement<WordSearchResult>(_WordSearchResult_QNAME, WordSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "LockInfo")
    public JAXBElement<LockInfo> createLockInfo(LockInfo value) {
        return new JAXBElement<LockInfo>(_LockInfo_QNAME, LockInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "TokenDescription")
    public JAXBElement<TokenDescription> createTokenDescription(TokenDescription value) {
        return new JAXBElement<TokenDescription>(_TokenDescription_QNAME, TokenDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Notifications")
    public JAXBElement<Notifications> createNotifications(Notifications value) {
        return new JAXBElement<Notifications>(_Notifications_QNAME, Notifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Pages")
    public JAXBElement<Pages> createPages(Pages value) {
        return new JAXBElement<Pages>(_Pages_QNAME, Pages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIndexFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentIndexFields")
    public JAXBElement<DocumentIndexFields> createDocumentIndexFields(DocumentIndexFields value) {
        return new JAXBElement<DocumentIndexFields>(_DocumentIndexFields_QNAME, DocumentIndexFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WebSettings")
    public JAXBElement<WebSettings> createWebSettings(WebSettings value) {
        return new JAXBElement<WebSettings>(_WebSettings_QNAME, WebSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFiles")
    public JAXBElement<AdhocRenderingFiles> createAdhocRenderingFiles(AdhocRenderingFiles value) {
        return new JAXBElement<AdhocRenderingFiles>(_AdhocRenderingFiles_QNAME, AdhocRenderingFiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Page }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Page")
    public JAXBElement<Page> createPage(Page value) {
        return new JAXBElement<Page>(_Page_QNAME, Page.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQueryResult")
    public JAXBElement<DocumentsQueryResult> createDocumentsQueryResult(DocumentsQueryResult value) {
        return new JAXBElement<DocumentsQueryResult>(_DocumentsQueryResult_QNAME, DocumentsQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentWordSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentWordSearchResult")
    public JAXBElement<DocumentWordSearchResult> createDocumentWordSearchResult(DocumentWordSearchResult value) {
        return new JAXBElement<DocumentWordSearchResult>(_DocumentWordSearchResult_QNAME, DocumentWordSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AssignmentOperation")
    public JAXBElement<AssignmentOperation> createAssignmentOperation(AssignmentOperation value) {
        return new JAXBElement<AssignmentOperation>(_AssignmentOperation_QNAME, AssignmentOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stamps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Stamps")
    public JAXBElement<Stamps> createStamps(Stamps value) {
        return new JAXBElement<Stamps>(_Stamps_QNAME, Stamps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagesBlockQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "PagesBlockQuery")
    public JAXBElement<PagesBlockQuery> createPagesBlockQuery(PagesBlockQuery value) {
        return new JAXBElement<PagesBlockQuery>(_PagesBlockQuery_QNAME, PagesBlockQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentMergeOperationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentMergeOperationInfo")
    public JAXBElement<ContentMergeOperationInfo> createContentMergeOperationInfo(ContentMergeOperationInfo value) {
        return new JAXBElement<ContentMergeOperationInfo>(_ContentMergeOperationInfo_QNAME, ContentMergeOperationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogFields")
    public JAXBElement<DialogFields> createDialogFields(DialogFields value) {
        return new JAXBElement<DialogFields>(_DialogFields_QNAME, DialogFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateImageInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageInput")
    public JAXBElement<GetTemplateImageInput> createGetTemplateImageInput(GetTemplateImageInput value) {
        return new JAXBElement<GetTemplateImageInput>(_GetTemplateImageInput_QNAME, GetTemplateImageInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentApplicationProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperties")
    public JAXBElement<DocumentApplicationProperties> createDocumentApplicationProperties(DocumentApplicationProperties value) {
        return new JAXBElement<DocumentApplicationProperties>(_DocumentApplicationProperties_QNAME, DocumentApplicationProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsTransferInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsTransferInfo")
    public JAXBElement<DocumentsTransferInfo> createDocumentsTransferInfo(DocumentsTransferInfo value) {
        return new JAXBElement<DocumentsTransferInfo>(_DocumentsTransferInfo_QNAME, DocumentsTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplateImageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageResult")
    public JAXBElement<GetTemplateImageResult> createGetTemplateImageResult(GetTemplateImageResult value) {
        return new JAXBElement<GetTemplateImageResult>(_GetTemplateImageResult_QNAME, GetTemplateImageResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Sections")
    public JAXBElement<Sections> createSections(Sections value) {
        return new JAXBElement<Sections>(_Sections_QNAME, Sections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileDownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownload")
    public JAXBElement<FileDownload> createFileDownload(FileDownload value) {
        return new JAXBElement<FileDownload>(_FileDownload_QNAME, FileDownload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dialog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialog")
    public JAXBElement<Dialog> createDialog(Dialog value) {
        return new JAXBElement<Dialog>(_Dialog_QNAME, Dialog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListResult")
    public JAXBElement<SelectListResult> createSelectListResult(SelectListResult value) {
        return new JAXBElement<SelectListResult>(_SelectListResult_QNAME, SelectListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateInput")
    public JAXBElement<CopyTemplateInput> createCopyTemplateInput(CopyTemplateInput value) {
        return new JAXBElement<CopyTemplateInput>(_CopyTemplateInput_QNAME, CopyTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesInput")
    public JAXBElement<DeleteTemplatesInput> createDeleteTemplatesInput(DeleteTemplatesInput value) {
        return new JAXBElement<DeleteTemplatesInput>(_DeleteTemplatesInput_QNAME, DeleteTemplatesInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampPlacement")
    public JAXBElement<StampPlacement> createStampPlacement(StampPlacement value) {
        return new JAXBElement<StampPlacement>(_StampPlacement_QNAME, StampPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinets")
    public JAXBElement<FileCabinets> createFileCabinets(FileCabinets value) {
        return new JAXBElement<FileCabinets>(_FileCabinets_QNAME, FileCabinets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcess")
    public JAXBElement<BatchUpdateProcess> createBatchUpdateProcess(BatchUpdateProcess value) {
        return new JAXBElement<BatchUpdateProcess>(_BatchUpdateProcess_QNAME, BatchUpdateProcess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Section }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Section")
    public JAXBElement<Section> createSection(Section value) {
        return new JAXBElement<Section>(_Section_QNAME, Section.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Annotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Annotation")
    public JAXBElement<Annotation> createAnnotation(Annotation value) {
        return new JAXBElement<Annotation>(_Annotation_QNAME, Annotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentDivideOperationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentDivideOperationInfo")
    public JAXBElement<ContentDivideOperationInfo> createContentDivideOperationInfo(ContentDivideOperationInfo value) {
        return new JAXBElement<ContentDivideOperationInfo>(_ContentDivideOperationInfo_QNAME, ContentDivideOperationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserValidation")
    public JAXBElement<UserValidation> createUserValidation(UserValidation value) {
        return new JAXBElement<UserValidation>(_UserValidation_QNAME, UserValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ServiceDescription")
    public JAXBElement<ServiceDescription> createServiceDescription(ServiceDescription value) {
        return new JAXBElement<ServiceDescription>(_ServiceDescription_QNAME, ServiceDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsResult")
    public JAXBElement<FieldValueStatisticsResult> createFieldValueStatisticsResult(FieldValueStatisticsResult value) {
        return new JAXBElement<FieldValueStatisticsResult>(_FieldValueStatisticsResult_QNAME, FieldValueStatisticsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldValueStatisticsExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsExpression")
    public JAXBElement<FieldValueStatisticsExpression> createFieldValueStatisticsExpression(FieldValueStatisticsExpression value) {
        return new JAXBElement<FieldValueStatisticsExpression>(_FieldValueStatisticsExpression_QNAME, FieldValueStatisticsExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormsInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormsInput")
    public JAXBElement<FormsInput> createFormsInput(FormsInput value) {
        return new JAXBElement<FormsInput>(_FormsInput_QNAME, FormsInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingQuery")
    public JAXBElement<AdhocRenderingQuery> createAdhocRenderingQuery(AdhocRenderingQuery value) {
        return new JAXBElement<AdhocRenderingQuery>(_AdhocRenderingQuery_QNAME, AdhocRenderingQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateProcessData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcessData")
    public JAXBElement<BatchUpdateProcessData> createBatchUpdateProcessData(BatchUpdateProcessData value) {
        return new JAXBElement<BatchUpdateProcessData>(_BatchUpdateProcessData_QNAME, BatchUpdateProcessData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileDownloadPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownloadPage")
    public JAXBElement<FileDownloadPage> createFileDownloadPage(FileDownloadPage value) {
        return new JAXBElement<FileDownloadPage>(_FileDownloadPage_QNAME, FileDownloadPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAnnotationsPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotationsPlacement")
    public JAXBElement<DocumentAnnotationsPlacement> createDocumentAnnotationsPlacement(DocumentAnnotationsPlacement value) {
        return new JAXBElement<DocumentAnnotationsPlacement>(_DocumentAnnotationsPlacement_QNAME, DocumentAnnotationsPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateInput")
    public JAXBElement<UploadTemplateInput> createUploadTemplateInput(UploadTemplateInput value) {
        return new JAXBElement<UploadTemplateInput>(_UploadTemplateInput_QNAME, UploadTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTemplateInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateInput")
    public JAXBElement<SaveTemplateInput> createSaveTemplateInput(SaveTemplateInput value) {
        return new JAXBElement<SaveTemplateInput>(_SaveTemplateInput_QNAME, SaveTemplateInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectListExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListExpression")
    public JAXBElement<SelectListExpression> createSelectListExpression(SelectListExpression value) {
        return new JAXBElement<SelectListExpression>(_SelectListExpression_QNAME, SelectListExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationsPlacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AnnotationsPlacement")
    public JAXBElement<AnnotationsPlacement> createAnnotationsPlacement(AnnotationsPlacement value) {
        return new JAXBElement<AnnotationsPlacement>(_AnnotationsPlacement_QNAME, AnnotationsPlacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organizations")
    public JAXBElement<Organizations> createOrganizations(Organizations value) {
        return new JAXBElement<Organizations>(_Organizations_QNAME, Organizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPositionQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SearchPositionQuery")
    public JAXBElement<SearchPositionQuery> createSearchPositionQuery(SearchPositionQuery value) {
        return new JAXBElement<SearchPositionQuery>(_SearchPositionQuery_QNAME, SearchPositionQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultListQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ResultListQuery")
    public JAXBElement<ResultListQuery> createResultListQuery(ResultListQuery value) {
        return new JAXBElement<ResultListQuery>(_ResultListQuery_QNAME, ResultListQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentActionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentActionInfo")
    public JAXBElement<DocumentActionInfo> createDocumentActionInfo(DocumentActionInfo value) {
        return new JAXBElement<DocumentActionInfo>(_DocumentActionInfo_QNAME, DocumentActionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentAnnotations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotations")
    public JAXBElement<DocumentAnnotations> createDocumentAnnotations(DocumentAnnotations value) {
        return new JAXBElement<DocumentAnnotations>(_DocumentAnnotations_QNAME, DocumentAnnotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogExpression")
    public JAXBElement<DialogExpression> createDialogExpression(DialogExpression value) {
        return new JAXBElement<DialogExpression>(_DialogExpression_QNAME, DialogExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocRenderingFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFile")
    public JAXBElement<AdhocRenderingFile> createAdhocRenderingFile(AdhocRenderingFile value) {
        return new JAXBElement<AdhocRenderingFile>(_AdhocRenderingFile_QNAME, AdhocRenderingFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "IntegerList")
    public JAXBElement<IntegerList> createIntegerList(IntegerList value) {
        return new JAXBElement<IntegerList>(_IntegerList_QNAME, IntegerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileCabinetTransferInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinetTransferInfo")
    public JAXBElement<FileCabinetTransferInfo> createFileCabinetTransferInfo(FileCabinetTransferInfo value) {
        return new JAXBElement<FileCabinetTransferInfo>(_FileCabinetTransferInfo_QNAME, FileCabinetTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutToFileSystemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CheckOutToFileSystemInfo")
    public JAXBElement<CheckOutToFileSystemInfo> createCheckOutToFileSystemInfo(CheckOutToFileSystemInfo value) {
        return new JAXBElement<CheckOutToFileSystemInfo>(_CheckOutToFileSystemInfo_QNAME, CheckOutToFileSystemInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceResult")
    public JAXBElement<SequenceResult> createSequenceResult(SequenceResult value) {
        return new JAXBElement<SequenceResult>(_SequenceResult_QNAME, SequenceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchUpdateIndexFieldsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateIndexFieldsResult")
    public JAXBElement<BatchUpdateIndexFieldsResult> createBatchUpdateIndexFieldsResult(BatchUpdateIndexFieldsResult value) {
        return new JAXBElement<BatchUpdateIndexFieldsResult>(_BatchUpdateIndexFieldsResult_QNAME, BatchUpdateIndexFieldsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CountExpression")
    public JAXBElement<CountExpression> createCountExpression(CountExpression value) {
        return new JAXBElement<CountExpression>(_CountExpression_QNAME, CountExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CFSStatisticGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CFSStatistic")
    public JAXBElement<CFSStatisticGeneral> createCFSStatistic(CFSStatisticGeneral value) {
        return new JAXBElement<CFSStatisticGeneral>(_CFSStatistic_QNAME, CFSStatisticGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedSearchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserDefinedSearchInfo")
    public JAXBElement<UserDefinedSearchInfo> createUserDefinedSearchInfo(UserDefinedSearchInfo value) {
        return new JAXBElement<UserDefinedSearchInfo>(_UserDefinedSearchInfo_QNAME, UserDefinedSearchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndexFieldsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UpdateIndexFieldsInfo")
    public JAXBElement<UpdateIndexFieldsInfo> createUpdateIndexFieldsInfo(UpdateIndexFieldsInfo value) {
        return new JAXBElement<UpdateIndexFieldsInfo>(_UpdateIndexFieldsInfo_QNAME, UpdateIndexFieldsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormFieldValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFields")
    public JAXBElement<FormFieldValues> createStampFormFields(FormFieldValues value) {
        return new JAXBElement<FormFieldValues>(_StampFormFields_QNAME, FormFieldValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyTemplateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateResult")
    public JAXBElement<CopyTemplateResult> createCopyTemplateResult(CopyTemplateResult value) {
        return new JAXBElement<CopyTemplateResult>(_CopyTemplateResult_QNAME, CopyTemplateResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTemplatesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesResult")
    public JAXBElement<DeleteTemplatesResult> createDeleteTemplatesResult(DeleteTemplatesResult value) {
        return new JAXBElement<DeleteTemplatesResult>(_DeleteTemplatesResult_QNAME, DeleteTemplatesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DialogInfos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialogs")
    public JAXBElement<DialogInfos> createDialogs(DialogInfos value) {
        return new JAXBElement<DialogInfos>(_Dialogs_QNAME, DialogInfos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuggestionFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SuggestionFields")
    public JAXBElement<SuggestionFields> createSuggestionFields(SuggestionFields value) {
        return new JAXBElement<SuggestionFields>(_SuggestionFields_QNAME, SuggestionFields.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Groups")
    public JAXBElement<Groups> createGroups(Groups value) {
        return new JAXBElement<Groups>(_Groups_QNAME, Groups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentArea", scope = PageData.class)
    public JAXBElement<DWRectangle> createPageDataContentArea(DWRectangle value) {
        return new JAXBElement<DWRectangle>(_PageDataContentArea_QNAME, DWRectangle.class, PageData.class, value);
    }



}
