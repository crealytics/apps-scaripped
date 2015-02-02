package com.google.appsscript.ui

/** UiInstance Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A representation of a user interface. You can use this to create a new user interface or manipulate an existing one. */
trait UiInstance {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(child: Widget): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def close: UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAbsolutePanel: AbsolutePanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAnchor(text: String, asHtml: Boolean, href: String): Anchor = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAnchor(text: String, href: String): Anchor = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton: Button = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton(html: String): Button = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton(html: String, clickHandler: Handler): Button = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel: CaptionPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel(caption: String): CaptionPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel(caption: String, asHtml: Boolean): CaptionPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox: CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox(label: String): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox(label: String, asHtml: Boolean): CheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createClientHandler: ClientHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDateBox: DateBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDatePicker: DatePicker = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedStackPanel: DecoratedStackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedTabBar: DecoratedTabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedTabPanel: DecoratedTabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratorPanel: DecoratorPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox: DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox(autoHide: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox(autoHide: Boolean, modal: Boolean): DialogBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDocsListDialog: DocsListDialog = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFileUpload: FileUpload = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFlexTable: FlexTable = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFlowPanel: FlowPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFocusPanel: FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFocusPanel(child: Widget): FocusPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFormPanel: FormPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createGrid: Grid = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createGrid(rows: Int, columns: Int): Grid = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML: HTML = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML(html: String): HTML = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML(html: String, wordWrap: Boolean): HTML = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden: Hidden = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden(name: String): Hidden = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden(name: String, value: String): Hidden = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHorizontalPanel: HorizontalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage: Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage(url: String): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage(url: String, left: Int, top: Int, width: Int, height: Int): Image = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createInlineLabel: InlineLabel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createInlineLabel(text: String): InlineLabel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel: Label = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel(text: String): Label = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel(text: String, wordWrap: Boolean): Label = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createListBox: ListBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createListBox(isMultipleSelect: Boolean): ListBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuBar: MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuBar(vertical: Boolean): MenuBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItem(text: String, asHtml: Boolean, command: Handler): MenuItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItem(text: String, command: Handler): MenuItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItemSeparator: MenuItemSeparator = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPasswordTextBox: PasswordTextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel: PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel(autoHide: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel(autoHide: Boolean, modal: Boolean): PopupPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton: PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, clickHandler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, downText: String): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, downText: String, clickHandler: Handler): PushButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String): RadioButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String, label: String): RadioButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String, label: String, asHtml: Boolean): RadioButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton: ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton(html: String): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton(html: String, clickHandler: Handler): ResetButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createScrollPanel: ScrollPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createScrollPanel(child: Widget): ScrollPanel = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerBlurHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerBlurHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerChangeHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerChangeHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerClickHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerClickHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCloseHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCloseHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCommand: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCommand(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerErrorHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerErrorHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerFocusHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerFocusHandler(functionName: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createServerHandler: ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createServerHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerInitializeHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerInitializeHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerKeyHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerKeyHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerLoadHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerLoadHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerMouseHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerMouseHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerScrollHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerScrollHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSelectionHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSelectionHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSubmitHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSubmitHandler(functionName: String): ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerValueChangeHandler: ServerHandler = ???
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerValueChangeHandler(functionName: String): ServerHandler = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimpleCheckBox: SimpleCheckBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimplePanel: SimplePanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimpleRadioButton(name: String): SimpleRadioButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSplitLayoutPanel: SplitLayoutPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createStackPanel: StackPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSubmitButton: SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSubmitButton(html: String): SubmitButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSuggestBox: SuggestBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTabBar: TabBar = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTabPanel: TabPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTextArea: TextArea = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTextBox: TextBox = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton: ToggleButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String): ToggleButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String, clickHandler: Handler): ToggleButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String, downText: String): ToggleButton = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTree: Tree = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem: TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem(text: String): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem(child: Widget): TreeItem = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createVerticalPanel: VerticalPanel = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getElementById(id: String): Component = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def isStandardsMode: Boolean = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def loadComponent(componentName: String): Component = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def loadComponent(componentName: String, optAdvancedArgs: AnyRef): Component = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: Int): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStandardsMode(standardsMode: Boolean): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): UiInstance = ???
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: Int): UiInstance = ???
}