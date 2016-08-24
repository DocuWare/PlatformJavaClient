

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    public ObjectFactory() {
    }

    public ViewerPreferences createViewerPreferences() {
        return new ViewerPreferences();
    }

    public DocumentsQueryTableResult createDocumentsQueryTableResult() {
        return new DocumentsQueryTableResult();
    }

    public ViewerToolbar createViewerToolbar() {
        return new ViewerToolbar();
    }

    public DocumentsTransferInfo createDocumentsTransferInfo() {
        return new DocumentsTransferInfo();
    }

    public Document createDocument() {
        return new Document();
    }

    public DocumentsQueryResult createDocumentsQueryResult() {
        return new DocumentsQueryResult();
    }

    public DocumentWordSearchResult createDocumentWordSearchResult() {
        return new DocumentWordSearchResult();
    }

    public AssignmentOperation createAssignmentOperation() {
        return new AssignmentOperation();
    }

    public Stamps createStamps() {
        return new Stamps();
    }

    public AdhocRenderingFiles createAdhocRenderingFiles() {
        return new AdhocRenderingFiles();
    }

    public Page createPage() {
        return new Page();
    }

    public Users createUsers() {
        return new Users();
    }

    public DocumentApplicationProperties createDocumentApplicationProperties() {
        return new DocumentApplicationProperties();
    }

    public GetTemplateImageResult createGetTemplateImageResult() {
        return new GetTemplateImageResult();
    }

    public Sections createSections() {
        return new Sections();
    }

    public FileDownload createFileDownload() {
        return new FileDownload();
    }

    public Dialog createDialog() {
        return new Dialog();
    }

    public PagesBlockQuery createPagesBlockQuery() {
        return new PagesBlockQuery();
    }

    public ContentMergeOperationInfo createContentMergeOperationInfo() {
        return new ContentMergeOperationInfo();
    }

    public DialogFields createDialogFields() {
        return new DialogFields();
    }

    public GetTemplateImageInput createGetTemplateImageInput() {
        return new GetTemplateImageInput();
    }

    public CreateFormsFileResult createCreateFormsFileResult() {
        return new CreateFormsFileResult();
    }

    public RequestDialogQuery createRequestDialogQuery() {
        return new RequestDialogQuery();
    }

    public FormInfo createFormInfo() {
        return new FormInfo();
    }

    public DocumentsQuery createDocumentsQuery() {
        return new DocumentsQuery();
    }

    public XmlSchemas createXmlSchemas() {
        return new XmlSchemas();
    }

    public SequenceRequest createSequenceRequest() {
        return new SequenceRequest();
    }

    public FileCabinet createFileCabinet() {
        return new FileCabinet();
    }

    public Roles createRoles() {
        return new Roles();
    }

    public StampFormFieldValues createStampFormFieldValues() {
        return new StampFormFieldValues();
    }

    public DocumentLink createDocumentLink() {
        return new DocumentLink();
    }

    public DocumentApplicationProperty createDocumentApplicationProperty() {
        return new DocumentApplicationProperty();
    }

    public DocumentLinks createDocumentLinks() {
        return new DocumentLinks();
    }

    public SaveTemplateResult createSaveTemplateResult() {
        return new SaveTemplateResult();
    }

    public UploadTemplateResult createUploadTemplateResult() {
        return new UploadTemplateResult();
    }

    public Pages createPages() {
        return new Pages();
    }

    public Role createRole() {
        return new Role();
    }

    public DocumentIndexFields createDocumentIndexFields() {
        return new DocumentIndexFields();
    }

    public WebSettings createWebSettings() {
        return new WebSettings();
    }

    public WordSearchResult createWordSearchResult() {
        return new WordSearchResult();
    }

    public LockInfo createLockInfo() {
        return new LockInfo();
    }

    public TokenDescription createTokenDescription() {
        return new TokenDescription();
    }

    public Notifications createNotifications() {
        return new Notifications();
    }

    public Group createGroup() {
        return new Group();
    }

    public ResultListQuery createResultListQuery() {
        return new ResultListQuery();
    }

    public DocumentActionInfo createDocumentActionInfo() {
        return new DocumentActionInfo();
    }

    public User createUser() {
        return new User();
    }

    public Organization createOrganization() {
        return new Organization();
    }

    public DocumentAnnotations createDocumentAnnotations() {
        return new DocumentAnnotations();
    }

    public DialogExpression createDialogExpression() {
        return new DialogExpression();
    }

    public AdhocRenderingFile createAdhocRenderingFile() {
        return new AdhocRenderingFile();
    }

    public SearchPositionQuery createSearchPositionQuery() {
        return new SearchPositionQuery();
    }

    public UpdateIndexFieldsInfo createUpdateIndexFieldsInfo() {
        return new UpdateIndexFieldsInfo();
    }

    public FormFieldValues createFormFieldValues() {
        return new FormFieldValues();
    }

    public CopyTemplateResult createCopyTemplateResult() {
        return new CopyTemplateResult();
    }

    public DeleteTemplatesResult createDeleteTemplatesResult() {
        return new DeleteTemplatesResult();
    }

    public DialogInfos createDialogInfos() {
        return new DialogInfos();
    }

    public SuggestionFields createSuggestionFields() {
        return new SuggestionFields();
    }

    public Groups createGroups() {
        return new Groups();
    }

    public IntegerList createIntegerList() {
        return new IntegerList();
    }

    public FileCabinetTransferInfo createFileCabinetTransferInfo() {
        return new FileCabinetTransferInfo();
    }

    public CheckOutToFileSystemInfo createCheckOutToFileSystemInfo() {
        return new CheckOutToFileSystemInfo();
    }

    public SequenceResult createSequenceResult() {
        return new SequenceResult();
    }

    public BatchUpdateIndexFieldsResult createBatchUpdateIndexFieldsResult() {
        return new BatchUpdateIndexFieldsResult();
    }

    public CountExpression createCountExpression() {
        return new CountExpression();
    }

    public CFSStatisticGeneral createCFSStatisticGeneral() {
        return new CFSStatisticGeneral();
    }

    public UserDefinedSearchInfo createUserDefinedSearchInfo() {
        return new UserDefinedSearchInfo();
    }

    public UserValidation createUserValidation() {
        return new UserValidation();
    }

    public ServiceDescription createServiceDescription() {
        return new ServiceDescription();
    }

    public SelectListResult createSelectListResult() {
        return new SelectListResult();
    }

    public CopyTemplateInput createCopyTemplateInput() {
        return new CopyTemplateInput();
    }

    public DeleteTemplatesInput createDeleteTemplatesInput() {
        return new DeleteTemplatesInput();
    }

    public StampPlacement createStampPlacement() {
        return new StampPlacement();
    }

    public FileCabinets createFileCabinets() {
        return new FileCabinets();
    }

    public BatchUpdateProcess createBatchUpdateProcess() {
        return new BatchUpdateProcess();
    }

    public Section createSection() {
        return new Section();
    }

    public Annotation createAnnotation() {
        return new Annotation();
    }

    public ContentDivideOperationInfo createContentDivideOperationInfo() {
        return new ContentDivideOperationInfo();
    }

    public UploadTemplateInput createUploadTemplateInput() {
        return new UploadTemplateInput();
    }

    public SaveTemplateInput createSaveTemplateInput() {
        return new SaveTemplateInput();
    }

    public SelectListExpression createSelectListExpression() {
        return new SelectListExpression();
    }

    public AnnotationsPlacement createAnnotationsPlacement() {
        return new AnnotationsPlacement();
    }

    public Organizations createOrganizations() {
        return new Organizations();
    }

    public FieldValueStatisticsResult createFieldValueStatisticsResult() {
        return new FieldValueStatisticsResult();
    }

    public FieldValueStatisticsExpression createFieldValueStatisticsExpression() {
        return new FieldValueStatisticsExpression();
    }

    public FormsInput createFormsInput() {
        return new FormsInput();
    }

    public AdhocRenderingQuery createAdhocRenderingQuery() {
        return new AdhocRenderingQuery();
    }

    public BatchUpdateProcessData createBatchUpdateProcessData() {
        return new BatchUpdateProcessData();
    }

    public FileDownloadPage createFileDownloadPage() {
        return new FileDownloadPage();
    }

    public DocumentAnnotationsPlacement createDocumentAnnotationsPlacement() {
        return new DocumentAnnotationsPlacement();
    }

    public RadioGroup createRadioGroup() {
        return new RadioGroup();
    }

    public FormFieldValue createFormFieldValue() {
        return new FormFieldValue();
    }

    public DialogInfo createDialogInfo() {
        return new DialogInfo();
    }

    public DocumentIndexFieldKeywords createDocumentIndexFieldKeywords() {
        return new DocumentIndexFieldKeywords();
    }

    public Rights createRights() {
        return new Rights();
    }

    public CFSSpecificValue createCFSSpecificValue() {
        return new CFSSpecificValue();
    }

    public SuggestionValue createSuggestionValue() {
        return new SuggestionValue();
    }

    public SortedField createSortedField() {
        return new SortedField();
    }

    public FontSettings createFontSettings() {
        return new FontSettings();
    }

    public CountResult createCountResult() {
        return new CountResult();
    }

    public WorkInstance createWorkInstance() {
        return new WorkInstance();
    }

    public StampFormField createStampFormField() {
        return new StampFormField();
    }

    public TextStampEntry createTextStampEntry() {
        return new TextStampEntry();
    }

    public DocumentIndexFieldValue createDocumentIndexFieldValue() {
        return new DocumentIndexFieldValue();
    }

    public SelectListInfos createSelectListInfos() {
        return new SelectListInfos();
    }

    public BatchUpdateResultItem createBatchUpdateResultItem() {
        return new BatchUpdateResultItem();
    }

    public FormTemplates createFormTemplates() {
        return new FormTemplates();
    }

    public AnnotationRectangle createAnnotationRectangle() {
        return new AnnotationRectangle();
    }

    public ExportSettings createExportSettings() {
        return new ExportSettings();
    }

    public DialogPropertiesTreeView createDialogPropertiesTreeView() {
        return new DialogPropertiesTreeView();
    }

    public LineEntry createLineEntry() {
        return new LineEntry();
    }

    public SignatureField createSignatureField() {
        return new SignatureField();
    }

    public Font createFont() {
        return new Font();
    }

    public Notification createNotification() {
        return new Notification();
    }

    public ApplicationPreferences createApplicationPreferences() {
        return new ApplicationPreferences();
    }

    public AppendActionDocuments createAppendActionDocuments() {
        return new AppendActionDocuments();
    }

    public NewUser createNewUser() {
        return new NewUser();
    }

    public Stroke createStroke() {
        return new Stroke();
    }

    public SubstitutionLists createSubstitutionLists() {
        return new SubstitutionLists();
    }

    public ViewerToolbarControl createViewerToolbarControl() {
        return new ViewerToolbarControl();
    }

    public AnnotationToolSettings createAnnotationToolSettings() {
        return new AnnotationToolSettings();
    }

    public TextAnnotationToolSettings createTextAnnotationToolSettings() {
        return new TextAnnotationToolSettings();
    }

    public RectEntry createRectEntry() {
        return new RectEntry();
    }

    public DeleteEntry createDeleteEntry() {
        return new DeleteEntry();
    }

    public DialogPropertiesSearch createDialogPropertiesSearch() {
        return new DialogPropertiesSearch();
    }

    public TextStamp createTextStamp() {
        return new TextStamp();
    }

    public ServiceDescriptionDocumentation createServiceDescriptionDocumentation() {
        return new ServiceDescriptionDocumentation();
    }

    public SelectListValues createSelectListValues() {
        return new SelectListValues();
    }

    public SortedFieldsList createSortedFieldsList() {
        return new SortedFieldsList();
    }

    public CheckOutResult createCheckOutResult() {
        return new CheckOutResult();
    }

    public SelectListInfo createSelectListInfo() {
        return new SelectListInfo();
    }

    public EntryBase createEntryBase() {
        return new EntryBase();
    }

    public BitmapStampEntry createBitmapStampEntry() {
        return new BitmapStampEntry();
    }

    public Headline createHeadline() {
        return new Headline();
    }

    public ExportQuery createExportQuery() {
        return new ExportQuery();
    }

    public RotatePageParameters createRotatePageParameters() {
        return new RotatePageParameters();
    }

    public ContentAreaPreferences createContentAreaPreferences() {
        return new ContentAreaPreferences();
    }

    public FormProperties createFormProperties() {
        return new FormProperties();
    }

    public WordSearchResultWordHits createWordSearchResultWordHits() {
        return new WordSearchResultWordHits();
    }

    public StampBase createStampBase() {
        return new StampBase();
    }

    public GeneralSettings createGeneralSettings() {
        return new GeneralSettings();
    }

    public MergeAnnotationsParameters createMergeAnnotationsParameters() {
        return new MergeAnnotationsParameters();
    }

    public TableResultRow createTableResultRow() {
        return new TableResultRow();
    }

    public DocumentFlags createDocumentFlags() {
        return new DocumentFlags();
    }

    public WorkflowAreaPreferences createWorkflowAreaPreferences() {
        return new WorkflowAreaPreferences();
    }

    public EnhanceImageParameters createEnhanceImageParameters() {
        return new EnhanceImageParameters();
    }

    public CFSStatisticSpecific createCFSStatisticSpecific() {
        return new CFSStatisticSpecific();
    }

    public XmlSchema createXmlSchema() {
        return new XmlSchema();
    }

    public ViewerDialog createViewerDialog() {
        return new ViewerDialog();
    }

    public DocumentIndexField createDocumentIndexField() {
        return new DocumentIndexField();
    }

    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    public WebFormOption createWebFormOption() {
        return new WebFormOption();
    }

    public CheckOutActionParameters createCheckOutActionParameters() {
        return new CheckOutActionParameters();
    }

    public SingleColumnSelectListValues createSingleColumnSelectListValues() {
        return new SingleColumnSelectListValues();
    }

    public ImportResultEntry createImportResultEntry() {
        return new ImportResultEntry();
    }

    public DialogPropertiesResultList createDialogPropertiesResultList() {
        return new DialogPropertiesResultList();
    }

    public SynchronizationSettings createSynchronizationSettings() {
        return new SynchronizationSettings();
    }

    public UploadedFileChunk createUploadedFileChunk() {
        return new UploadedFileChunk();
    }

    public ImportEntryVersion createImportEntryVersion() {
        return new ImportEntryVersion();
    }

    public NumberField createNumberField() {
        return new NumberField();
    }

    public CheckGroup createCheckGroup() {
        return new CheckGroup();
    }

    public FlagConditions createFlagConditions() {
        return new FlagConditions();
    }

    public ImportSettings createImportSettings() {
        return new ImportSettings();
    }

    public WebFormListOptions createWebFormListOptions() {
        return new WebFormListOptions();
    }

    public DateField createDateField() {
        return new DateField();
    }

    public ServiceDescriptionTests createServiceDescriptionTests() {
        return new ServiceDescriptionTests();
    }

    public DecisionStampPlacement createDecisionStampPlacement() {
        return new DecisionStampPlacement();
    }

    public WebClientPreferences createWebClientPreferences() {
        return new WebClientPreferences();
    }

    public MultiLineTextField createMultiLineTextField() {
        return new MultiLineTextField();
    }

    public BatchUpdateDocumentsSource createBatchUpdateDocumentsSource() {
        return new BatchUpdateDocumentsSource();
    }

    public TextEntry createTextEntry() {
        return new TextEntry();
    }

    public DialogProperties createDialogProperties() {
        return new DialogProperties();
    }

    public Zones createZones() {
        return new Zones();
    }

    public ImageField createImageField() {
        return new ImageField();
    }

    public TemplateGUIDS createTemplateGUIDS() {
        return new TemplateGUIDS();
    }

    public SubstitutionList createSubstitutionList() {
        return new SubstitutionList();
    }

    public DialogField createDialogField() {
        return new DialogField();
    }

    public RegionalSettings createRegionalSettings() {
        return new RegionalSettings();
    }

    public FieldsList createFieldsList() {
        return new FieldsList();
    }

    public SubmissionOptions createSubmissionOptions() {
        return new SubmissionOptions();
    }

    public WebFormControls createWebFormControls() {
        return new WebFormControls();
    }

    public FileCabinetField createFileCabinetField() {
        return new FileCabinetField();
    }

    public DecisionFormFieldValue createDecisionFormFieldValue() {
        return new DecisionFormFieldValue();
    }

    public DropDownList createDropDownList() {
        return new DropDownList();
    }

    public CountResultItem createCountResultItem() {
        return new CountResultItem();
    }

    public OutOfOffice createOutOfOffice() {
        return new OutOfOffice();
    }

    public AttachFileField createAttachFileField() {
        return new AttachFileField();
    }

    public Favorites createFavorites() {
        return new Favorites();
    }

    public StampField createStampField() {
        return new StampField();
    }

    public FavoriteItems createFavoriteItems() {
        return new FavoriteItems();
    }

    public ApplicationPreferencesHolder createApplicationPreferencesHolder() {
        return new ApplicationPreferencesHolder();
    }

    public TableResultHeader createTableResultHeader() {
        return new TableResultHeader();
    }

    public FieldMappings createFieldMappings() {
        return new FieldMappings();
    }

    public PolyLineEntry createPolyLineEntry() {
        return new PolyLineEntry();
    }

    public ServiceDescriptionStatistics createServiceDescriptionStatistics() {
        return new ServiceDescriptionStatistics();
    }

    public DocumentVersion createDocumentVersion() {
        return new DocumentVersion();
    }

    public FixedText createFixedText() {
        return new FixedText();
    }

    public ImportResult createImportResult() {
        return new ImportResult();
    }

    public PolyLineStampEntry createPolyLineStampEntry() {
        return new PolyLineStampEntry();
    }

    public Stamp createStamp() {
        return new Stamp();
    }

    public LoginInfo createLoginInfo() {
        return new LoginInfo();
    }

    public WordSearchResultWordHit createWordSearchResultWordHit() {
        return new WordSearchResultWordHit();
    }

    public BatchUpdateDialogExpressionSource createBatchUpdateDialogExpressionSource() {
        return new BatchUpdateDialogExpressionSource();
    }

    public FileCabinetFields createFileCabinetFields() {
        return new FileCabinetFields();
    }

    public Layer createLayer() {
        return new Layer();
    }

    public OrganizationUser createOrganizationUser() {
        return new OrganizationUser();
    }

    public PageHits createPageHits() {
        return new PageHits();
    }

    public BasketAreaPreferences createBasketAreaPreferences() {
        return new BasketAreaPreferences();
    }

    public WordSearchResultPageHit createWordSearchResultPageHit() {
        return new WordSearchResultPageHit();
    }

    public AdditionalOrganizationInfo createAdditionalOrganizationInfo() {
        return new AdditionalOrganizationInfo();
    }

    public WebClientLayout createWebClientLayout() {
        return new WebClientLayout();
    }

    public CountPlusValue createCountPlusValue() {
        return new CountPlusValue();
    }

    public TextField createTextField() {
        return new TextField();
    }

    public PointAndShootInfo createPointAndShootInfo() {
        return new PointAndShootInfo();
    }

    public AppendActionParameters createAppendActionParameters() {
        return new AppendActionParameters();
    }

    public CreatedInfo createCreatedInfo() {
        return new CreatedInfo();
    }

    public LogicalOperator createLogicalOperator() {
        return new LogicalOperator();
    }

    public SectionAnnotationsPlacement createSectionAnnotationsPlacement() {
        return new SectionAnnotationsPlacement();
    }

    public DialogExpressionCondition createDialogExpressionCondition() {
        return new DialogExpressionCondition();
    }

    public CheckInActionParameters createCheckInActionParameters() {
        return new CheckInActionParameters();
    }

    public BitmapStamp createBitmapStamp() {
        return new BitmapStamp();
    }

    public StrokeStamp createStrokeStamp() {
        return new StrokeStamp();
    }

    public SubstitutionRules createSubstitutionRules() {
        return new SubstitutionRules();
    }

    public MultiFCSearches createMultiFCSearches() {
        return new MultiFCSearches();
    }

    public SelectListValuesQuery createSelectListValuesQuery() {
        return new SelectListValuesQuery();
    }

    public FieldMapping createFieldMapping() {
        return new FieldMapping();
    }

    public MultiFCSearchConfiguration createMultiFCSearchConfiguration() {
        return new MultiFCSearchConfiguration();
    }

    public AttachFileInfo createAttachFileInfo() {
        return new AttachFileInfo();
    }

    public AnnotationPoint createAnnotationPoint() {
        return new AnnotationPoint();
    }

    public FieldValueStatistics createFieldValueStatistics() {
        return new FieldValueStatistics();
    }

    public FormTemplate createFormTemplate() {
        return new FormTemplate();
    }

    public Zone createZone() {
        return new Zone();
    }

    public SuggestionField createSuggestionField() {
        return new SuggestionField();
    }

    public NullTableResultValue createNullTableResultValue() {
        return new NullTableResultValue();
    }

    public XmlDSigContentType createXmlDSigContentType() {
        return new XmlDSigContentType();
    }

    public WebFormOptions createWebFormOptions() {
        return new WebFormOptions();
    }

    public ConfigurationRights createConfigurationRights() {
        return new ConfigurationRights();
    }

    public ResultDialogFunction createResultDialogFunction() {
        return new ResultDialogFunction();
    }

    public DocumentActionParameters createDocumentActionParameters() {
        return new DocumentActionParameters();
    }

    public PageData createPageData() {
        return new PageData();
    }

    public DialogPropertiesTaskList createDialogPropertiesTaskList() {
        return new DialogPropertiesTaskList();
    }

    public SectionAnnotation createSectionAnnotation() {
        return new SectionAnnotation();
    }

    public SubstitutionRule createSubstitutionRule() {
        return new SubstitutionRule();
    }

    public SizedAnnotationToolSettings createSizedAnnotationToolSettings() {
        return new SizedAnnotationToolSettings();
    }

    public WorkAreaPreferences createWorkAreaPreferences() {
        return new WorkAreaPreferences();
    }

    public ViewerPreferences.Annotations createViewerPreferencesAnnotations() {
        return new ViewerPreferences.Annotations();
    }

    public ViewerPreferences.Toolbars createViewerPreferencesToolbars() {
        return new ViewerPreferences.Toolbars();
    }

    public DocumentsQueryTableResult.Headers createDocumentsQueryTableResultHeaders() {
        return new DocumentsQueryTableResult.Headers();
    }

    public DocumentsQueryTableResult.Rows createDocumentsQueryTableResultRows() {
        return new DocumentsQueryTableResult.Rows();
    }

    public ViewerToolbar.Controls createViewerToolbarControls() {
        return new ViewerToolbar.Controls();
    }

    public DocumentsTransferInfo.Documents createDocumentsTransferInfoDocuments() {
        return new DocumentsTransferInfo.Documents();
    }

    public Document.Preview createDocumentPreview() {
        return new Document.Preview();
    }

    public DocumentsQueryResult.Items createDocumentsQueryResultItems() {
        return new DocumentsQueryResult.Items();
    }

    public DocumentWordSearchResult.SectionHits createDocumentWordSearchResultSectionHits() {
        return new DocumentWordSearchResult.SectionHits();
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Roles")
    public JAXBElement<Roles> createRoles(Roles value) {
        return new JAXBElement<Roles>(_Roles_QNAME, Roles.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFieldValues")
    public JAXBElement<StampFormFieldValues> createStampFormFieldValues(StampFormFieldValues value) {
        return new JAXBElement<StampFormFieldValues>(_StampFormFieldValues_QNAME, StampFormFieldValues.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLink")
    public JAXBElement<DocumentLink> createDocumentLink(DocumentLink value) {
        return new JAXBElement<DocumentLink>(_DocumentLink_QNAME, DocumentLink.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperty")
    public JAXBElement<DocumentApplicationProperty> createDocumentApplicationProperty(DocumentApplicationProperty value) {
        return new JAXBElement<DocumentApplicationProperty>(_DocumentApplicationProperty_QNAME, DocumentApplicationProperty.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentLinks")
    public JAXBElement<DocumentLinks> createDocumentLinks(DocumentLinks value) {
        return new JAXBElement<DocumentLinks>(_DocumentLinks_QNAME, DocumentLinks.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateResult")
    public JAXBElement<SaveTemplateResult> createSaveTemplateResult(SaveTemplateResult value) {
        return new JAXBElement<SaveTemplateResult>(_SaveTemplateResult_QNAME, SaveTemplateResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateResult")
    public JAXBElement<UploadTemplateResult> createUploadTemplateResult(UploadTemplateResult value) {
        return new JAXBElement<UploadTemplateResult>(_UploadTemplateResult_QNAME, UploadTemplateResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CreateFormsFileResult")
    public JAXBElement<CreateFormsFileResult> createCreateFormsFileResult(CreateFormsFileResult value) {
        return new JAXBElement<CreateFormsFileResult>(_CreateFormsFileResult_QNAME, CreateFormsFileResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "RequestDialogQuery")
    public JAXBElement<RequestDialogQuery> createRequestDialogQuery(RequestDialogQuery value) {
        return new JAXBElement<RequestDialogQuery>(_RequestDialogQuery_QNAME, RequestDialogQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormInfo")
    public JAXBElement<FormInfo> createFormInfo(FormInfo value) {
        return new JAXBElement<FormInfo>(_FormInfo_QNAME, FormInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQuery")
    public JAXBElement<DocumentsQuery> createDocumentsQuery(DocumentsQuery value) {
        return new JAXBElement<DocumentsQuery>(_DocumentsQuery_QNAME, DocumentsQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "XmlSchemas")
    public JAXBElement<XmlSchemas> createXmlSchemas(XmlSchemas value) {
        return new JAXBElement<XmlSchemas>(_XmlSchemas_QNAME, XmlSchemas.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceRequest")
    public JAXBElement<SequenceRequest> createSequenceRequest(SequenceRequest value) {
        return new JAXBElement<SequenceRequest>(_SequenceRequest_QNAME, SequenceRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinet")
    public JAXBElement<FileCabinet> createFileCabinet(FileCabinet value) {
        return new JAXBElement<FileCabinet>(_FileCabinet_QNAME, FileCabinet.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WordSearchResult")
    public JAXBElement<WordSearchResult> createWordSearchResult(WordSearchResult value) {
        return new JAXBElement<WordSearchResult>(_WordSearchResult_QNAME, WordSearchResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "LockInfo")
    public JAXBElement<LockInfo> createLockInfo(LockInfo value) {
        return new JAXBElement<LockInfo>(_LockInfo_QNAME, LockInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "TokenDescription")
    public JAXBElement<TokenDescription> createTokenDescription(TokenDescription value) {
        return new JAXBElement<TokenDescription>(_TokenDescription_QNAME, TokenDescription.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Notifications")
    public JAXBElement<Notifications> createNotifications(Notifications value) {
        return new JAXBElement<Notifications>(_Notifications_QNAME, Notifications.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Pages")
    public JAXBElement<Pages> createPages(Pages value) {
        return new JAXBElement<Pages>(_Pages_QNAME, Pages.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentIndexFields")
    public JAXBElement<DocumentIndexFields> createDocumentIndexFields(DocumentIndexFields value) {
        return new JAXBElement<DocumentIndexFields>(_DocumentIndexFields_QNAME, DocumentIndexFields.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "WebSettings")
    public JAXBElement<WebSettings> createWebSettings(WebSettings value) {
        return new JAXBElement<WebSettings>(_WebSettings_QNAME, WebSettings.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFiles")
    public JAXBElement<AdhocRenderingFiles> createAdhocRenderingFiles(AdhocRenderingFiles value) {
        return new JAXBElement<AdhocRenderingFiles>(_AdhocRenderingFiles_QNAME, AdhocRenderingFiles.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Page")
    public JAXBElement<Page> createPage(Page value) {
        return new JAXBElement<Page>(_Page_QNAME, Page.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsQueryResult")
    public JAXBElement<DocumentsQueryResult> createDocumentsQueryResult(DocumentsQueryResult value) {
        return new JAXBElement<DocumentsQueryResult>(_DocumentsQueryResult_QNAME, DocumentsQueryResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentWordSearchResult")
    public JAXBElement<DocumentWordSearchResult> createDocumentWordSearchResult(DocumentWordSearchResult value) {
        return new JAXBElement<DocumentWordSearchResult>(_DocumentWordSearchResult_QNAME, DocumentWordSearchResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AssignmentOperation")
    public JAXBElement<AssignmentOperation> createAssignmentOperation(AssignmentOperation value) {
        return new JAXBElement<AssignmentOperation>(_AssignmentOperation_QNAME, AssignmentOperation.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Stamps")
    public JAXBElement<Stamps> createStamps(Stamps value) {
        return new JAXBElement<Stamps>(_Stamps_QNAME, Stamps.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "PagesBlockQuery")
    public JAXBElement<PagesBlockQuery> createPagesBlockQuery(PagesBlockQuery value) {
        return new JAXBElement<PagesBlockQuery>(_PagesBlockQuery_QNAME, PagesBlockQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentMergeOperationInfo")
    public JAXBElement<ContentMergeOperationInfo> createContentMergeOperationInfo(ContentMergeOperationInfo value) {
        return new JAXBElement<ContentMergeOperationInfo>(_ContentMergeOperationInfo_QNAME, ContentMergeOperationInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogFields")
    public JAXBElement<DialogFields> createDialogFields(DialogFields value) {
        return new JAXBElement<DialogFields>(_DialogFields_QNAME, DialogFields.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageInput")
    public JAXBElement<GetTemplateImageInput> createGetTemplateImageInput(GetTemplateImageInput value) {
        return new JAXBElement<GetTemplateImageInput>(_GetTemplateImageInput_QNAME, GetTemplateImageInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentApplicationProperties")
    public JAXBElement<DocumentApplicationProperties> createDocumentApplicationProperties(DocumentApplicationProperties value) {
        return new JAXBElement<DocumentApplicationProperties>(_DocumentApplicationProperties_QNAME, DocumentApplicationProperties.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentsTransferInfo")
    public JAXBElement<DocumentsTransferInfo> createDocumentsTransferInfo(DocumentsTransferInfo value) {
        return new JAXBElement<DocumentsTransferInfo>(_DocumentsTransferInfo_QNAME, DocumentsTransferInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "GetTemplateImageResult")
    public JAXBElement<GetTemplateImageResult> createGetTemplateImageResult(GetTemplateImageResult value) {
        return new JAXBElement<GetTemplateImageResult>(_GetTemplateImageResult_QNAME, GetTemplateImageResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Sections")
    public JAXBElement<Sections> createSections(Sections value) {
        return new JAXBElement<Sections>(_Sections_QNAME, Sections.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownload")
    public JAXBElement<FileDownload> createFileDownload(FileDownload value) {
        return new JAXBElement<FileDownload>(_FileDownload_QNAME, FileDownload.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialog")
    public JAXBElement<Dialog> createDialog(Dialog value) {
        return new JAXBElement<Dialog>(_Dialog_QNAME, Dialog.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListResult")
    public JAXBElement<SelectListResult> createSelectListResult(SelectListResult value) {
        return new JAXBElement<SelectListResult>(_SelectListResult_QNAME, SelectListResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateInput")
    public JAXBElement<CopyTemplateInput> createCopyTemplateInput(CopyTemplateInput value) {
        return new JAXBElement<CopyTemplateInput>(_CopyTemplateInput_QNAME, CopyTemplateInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesInput")
    public JAXBElement<DeleteTemplatesInput> createDeleteTemplatesInput(DeleteTemplatesInput value) {
        return new JAXBElement<DeleteTemplatesInput>(_DeleteTemplatesInput_QNAME, DeleteTemplatesInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampPlacement")
    public JAXBElement<StampPlacement> createStampPlacement(StampPlacement value) {
        return new JAXBElement<StampPlacement>(_StampPlacement_QNAME, StampPlacement.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinets")
    public JAXBElement<FileCabinets> createFileCabinets(FileCabinets value) {
        return new JAXBElement<FileCabinets>(_FileCabinets_QNAME, FileCabinets.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcess")
    public JAXBElement<BatchUpdateProcess> createBatchUpdateProcess(BatchUpdateProcess value) {
        return new JAXBElement<BatchUpdateProcess>(_BatchUpdateProcess_QNAME, BatchUpdateProcess.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Section")
    public JAXBElement<Section> createSection(Section value) {
        return new JAXBElement<Section>(_Section_QNAME, Section.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Annotation")
    public JAXBElement<Annotation> createAnnotation(Annotation value) {
        return new JAXBElement<Annotation>(_Annotation_QNAME, Annotation.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ContentDivideOperationInfo")
    public JAXBElement<ContentDivideOperationInfo> createContentDivideOperationInfo(ContentDivideOperationInfo value) {
        return new JAXBElement<ContentDivideOperationInfo>(_ContentDivideOperationInfo_QNAME, ContentDivideOperationInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserValidation")
    public JAXBElement<UserValidation> createUserValidation(UserValidation value) {
        return new JAXBElement<UserValidation>(_UserValidation_QNAME, UserValidation.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ServiceDescription")
    public JAXBElement<ServiceDescription> createServiceDescription(ServiceDescription value) {
        return new JAXBElement<ServiceDescription>(_ServiceDescription_QNAME, ServiceDescription.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsResult")
    public JAXBElement<FieldValueStatisticsResult> createFieldValueStatisticsResult(FieldValueStatisticsResult value) {
        return new JAXBElement<FieldValueStatisticsResult>(_FieldValueStatisticsResult_QNAME, FieldValueStatisticsResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FieldValueStatisticsExpression")
    public JAXBElement<FieldValueStatisticsExpression> createFieldValueStatisticsExpression(FieldValueStatisticsExpression value) {
        return new JAXBElement<FieldValueStatisticsExpression>(_FieldValueStatisticsExpression_QNAME, FieldValueStatisticsExpression.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FormsInput")
    public JAXBElement<FormsInput> createFormsInput(FormsInput value) {
        return new JAXBElement<FormsInput>(_FormsInput_QNAME, FormsInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingQuery")
    public JAXBElement<AdhocRenderingQuery> createAdhocRenderingQuery(AdhocRenderingQuery value) {
        return new JAXBElement<AdhocRenderingQuery>(_AdhocRenderingQuery_QNAME, AdhocRenderingQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateProcessData")
    public JAXBElement<BatchUpdateProcessData> createBatchUpdateProcessData(BatchUpdateProcessData value) {
        return new JAXBElement<BatchUpdateProcessData>(_BatchUpdateProcessData_QNAME, BatchUpdateProcessData.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileDownloadPage")
    public JAXBElement<FileDownloadPage> createFileDownloadPage(FileDownloadPage value) {
        return new JAXBElement<FileDownloadPage>(_FileDownloadPage_QNAME, FileDownloadPage.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotationsPlacement")
    public JAXBElement<DocumentAnnotationsPlacement> createDocumentAnnotationsPlacement(DocumentAnnotationsPlacement value) {
        return new JAXBElement<DocumentAnnotationsPlacement>(_DocumentAnnotationsPlacement_QNAME, DocumentAnnotationsPlacement.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UploadTemplateInput")
    public JAXBElement<UploadTemplateInput> createUploadTemplateInput(UploadTemplateInput value) {
        return new JAXBElement<UploadTemplateInput>(_UploadTemplateInput_QNAME, UploadTemplateInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SaveTemplateInput")
    public JAXBElement<SaveTemplateInput> createSaveTemplateInput(SaveTemplateInput value) {
        return new JAXBElement<SaveTemplateInput>(_SaveTemplateInput_QNAME, SaveTemplateInput.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SelectListExpression")
    public JAXBElement<SelectListExpression> createSelectListExpression(SelectListExpression value) {
        return new JAXBElement<SelectListExpression>(_SelectListExpression_QNAME, SelectListExpression.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AnnotationsPlacement")
    public JAXBElement<AnnotationsPlacement> createAnnotationsPlacement(AnnotationsPlacement value) {
        return new JAXBElement<AnnotationsPlacement>(_AnnotationsPlacement_QNAME, AnnotationsPlacement.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organizations")
    public JAXBElement<Organizations> createOrganizations(Organizations value) {
        return new JAXBElement<Organizations>(_Organizations_QNAME, Organizations.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SearchPositionQuery")
    public JAXBElement<SearchPositionQuery> createSearchPositionQuery(SearchPositionQuery value) {
        return new JAXBElement<SearchPositionQuery>(_SearchPositionQuery_QNAME, SearchPositionQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "ResultListQuery")
    public JAXBElement<ResultListQuery> createResultListQuery(ResultListQuery value) {
        return new JAXBElement<ResultListQuery>(_ResultListQuery_QNAME, ResultListQuery.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentActionInfo")
    public JAXBElement<DocumentActionInfo> createDocumentActionInfo(DocumentActionInfo value) {
        return new JAXBElement<DocumentActionInfo>(_DocumentActionInfo_QNAME, DocumentActionInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DocumentAnnotations")
    public JAXBElement<DocumentAnnotations> createDocumentAnnotations(DocumentAnnotations value) {
        return new JAXBElement<DocumentAnnotations>(_DocumentAnnotations_QNAME, DocumentAnnotations.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DialogExpression")
    public JAXBElement<DialogExpression> createDialogExpression(DialogExpression value) {
        return new JAXBElement<DialogExpression>(_DialogExpression_QNAME, DialogExpression.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "AdhocRenderingFile")
    public JAXBElement<AdhocRenderingFile> createAdhocRenderingFile(AdhocRenderingFile value) {
        return new JAXBElement<AdhocRenderingFile>(_AdhocRenderingFile_QNAME, AdhocRenderingFile.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "IntegerList")
    public JAXBElement<IntegerList> createIntegerList(IntegerList value) {
        return new JAXBElement<IntegerList>(_IntegerList_QNAME, IntegerList.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "FileCabinetTransferInfo")
    public JAXBElement<FileCabinetTransferInfo> createFileCabinetTransferInfo(FileCabinetTransferInfo value) {
        return new JAXBElement<FileCabinetTransferInfo>(_FileCabinetTransferInfo_QNAME, FileCabinetTransferInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CheckOutToFileSystemInfo")
    public JAXBElement<CheckOutToFileSystemInfo> createCheckOutToFileSystemInfo(CheckOutToFileSystemInfo value) {
        return new JAXBElement<CheckOutToFileSystemInfo>(_CheckOutToFileSystemInfo_QNAME, CheckOutToFileSystemInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SequenceResult")
    public JAXBElement<SequenceResult> createSequenceResult(SequenceResult value) {
        return new JAXBElement<SequenceResult>(_SequenceResult_QNAME, SequenceResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "BatchUpdateIndexFieldsResult")
    public JAXBElement<BatchUpdateIndexFieldsResult> createBatchUpdateIndexFieldsResult(BatchUpdateIndexFieldsResult value) {
        return new JAXBElement<BatchUpdateIndexFieldsResult>(_BatchUpdateIndexFieldsResult_QNAME, BatchUpdateIndexFieldsResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CountExpression")
    public JAXBElement<CountExpression> createCountExpression(CountExpression value) {
        return new JAXBElement<CountExpression>(_CountExpression_QNAME, CountExpression.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CFSStatistic")
    public JAXBElement<CFSStatisticGeneral> createCFSStatistic(CFSStatisticGeneral value) {
        return new JAXBElement<CFSStatisticGeneral>(_CFSStatistic_QNAME, CFSStatisticGeneral.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UserDefinedSearchInfo")
    public JAXBElement<UserDefinedSearchInfo> createUserDefinedSearchInfo(UserDefinedSearchInfo value) {
        return new JAXBElement<UserDefinedSearchInfo>(_UserDefinedSearchInfo_QNAME, UserDefinedSearchInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "UpdateIndexFieldsInfo")
    public JAXBElement<UpdateIndexFieldsInfo> createUpdateIndexFieldsInfo(UpdateIndexFieldsInfo value) {
        return new JAXBElement<UpdateIndexFieldsInfo>(_UpdateIndexFieldsInfo_QNAME, UpdateIndexFieldsInfo.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "StampFormFields")
    public JAXBElement<FormFieldValues> createStampFormFields(FormFieldValues value) {
        return new JAXBElement<FormFieldValues>(_StampFormFields_QNAME, FormFieldValues.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "CopyTemplateResult")
    public JAXBElement<CopyTemplateResult> createCopyTemplateResult(CopyTemplateResult value) {
        return new JAXBElement<CopyTemplateResult>(_CopyTemplateResult_QNAME, CopyTemplateResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "DeleteTemplatesResult")
    public JAXBElement<DeleteTemplatesResult> createDeleteTemplatesResult(DeleteTemplatesResult value) {
        return new JAXBElement<DeleteTemplatesResult>(_DeleteTemplatesResult_QNAME, DeleteTemplatesResult.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Dialogs")
    public JAXBElement<DialogInfos> createDialogs(DialogInfos value) {
        return new JAXBElement<DialogInfos>(_Dialogs_QNAME, DialogInfos.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "SuggestionFields")
    public JAXBElement<SuggestionFields> createSuggestionFields(SuggestionFields value) {
        return new JAXBElement<SuggestionFields>(_SuggestionFields_QNAME, SuggestionFields.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/platform", name = "Groups")
    public JAXBElement<Groups> createGroups(Groups value) {
        return new JAXBElement<Groups>(_Groups_QNAME, Groups.class, null, value);
    }



}
