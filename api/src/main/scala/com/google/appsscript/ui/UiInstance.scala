package com.google.appsscript.ui

import scala.scalajs.js

/** UiInstance Deprecated. The UI service was deprecated on December 11, 2014. To create user interfaces, use the HTML service instead. A representation of a user interface. You can use this to create a new user interface or manipulate an existing one. */
trait UiInstance extends js.Object {
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def add(child: Widget): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def close: UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAbsolutePanel: AbsolutePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAnchor(text: String, asHtml: Boolean, href: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createAnchor(text: String, href: String): Anchor = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton: Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton(html: String): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createButton(html: String, clickHandler: Handler): Button = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel: CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel(caption: String): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCaptionPanel(caption: String, asHtml: Boolean): CaptionPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox: CheckBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox(label: String): CheckBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createCheckBox(label: String, asHtml: Boolean): CheckBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createClientHandler: ClientHandler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDateBox: DateBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDatePicker: DatePicker = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedStackPanel: DecoratedStackPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedTabBar: DecoratedTabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratedTabPanel: DecoratedTabPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDecoratorPanel: DecoratorPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox: DialogBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox(autoHide: Boolean): DialogBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDialogBox(autoHide: Boolean, modal: Boolean): DialogBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createDocsListDialog: DocsListDialog = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFileUpload: FileUpload = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFlexTable: FlexTable = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFlowPanel: FlowPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFocusPanel: FocusPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFocusPanel(child: Widget): FocusPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createFormPanel: FormPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createGrid: Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createGrid(rows: Int, columns: Int): Grid = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML: HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML(html: String): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHTML(html: String, wordWrap: Boolean): HTML = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden: Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden(name: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHidden(name: String, value: String): Hidden = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createHorizontalPanel: HorizontalPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage: Image = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage(url: String): Image = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createImage(url: String, left: Int, top: Int, width: Int, height: Int): Image = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createInlineLabel: InlineLabel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createInlineLabel(text: String): InlineLabel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel: Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel(text: String): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createLabel(text: String, wordWrap: Boolean): Label = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createListBox: ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createListBox(isMultipleSelect: Boolean): ListBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuBar: MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuBar(vertical: Boolean): MenuBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItem(text: String, asHtml: Boolean, command: Handler): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItem(text: String, command: Handler): MenuItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createMenuItemSeparator: MenuItemSeparator = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPasswordTextBox: PasswordTextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel: PopupPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel(autoHide: Boolean): PopupPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPopupPanel(autoHide: Boolean, modal: Boolean): PopupPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton: PushButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String): PushButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, clickHandler: Handler): PushButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, downText: String): PushButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createPushButton(upText: String, downText: String, clickHandler: Handler): PushButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String, label: String): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createRadioButton(name: String, label: String, asHtml: Boolean): RadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton: ResetButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton(html: String): ResetButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createResetButton(html: String, clickHandler: Handler): ResetButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createScrollPanel: ScrollPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createScrollPanel(child: Widget): ScrollPanel = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerBlurHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerBlurHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerChangeHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerChangeHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerClickHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerClickHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCloseHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCloseHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCommand: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerCommand(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerErrorHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerErrorHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerFocusHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerFocusHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createServerHandler: ServerHandler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createServerHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerInitializeHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerInitializeHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerKeyHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerKeyHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerLoadHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerLoadHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerMouseHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerMouseHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerScrollHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerScrollHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSelectionHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSelectionHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSubmitHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerSubmitHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerValueChangeHandler: ServerHandler = js.native
  /** Deprecated. use a ServerHandler anywhere you would have used this. */
  def createServerValueChangeHandler(functionName: String): ServerHandler = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimpleCheckBox: SimpleCheckBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimplePanel: SimplePanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSimpleRadioButton(name: String): SimpleRadioButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSplitLayoutPanel: SplitLayoutPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createStackPanel: StackPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSubmitButton: SubmitButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSubmitButton(html: String): SubmitButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createSuggestBox: SuggestBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTabBar: TabBar = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTabPanel: TabPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTextArea: TextArea = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTextBox: TextBox = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton: ToggleButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String): ToggleButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String, clickHandler: Handler): ToggleButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createToggleButton(upText: String, downText: String): ToggleButton = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTree: Tree = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem: TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem(text: String): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createTreeItem(child: Widget): TreeItem = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def createVerticalPanel: VerticalPanel = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getElementById(id: String): Component = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def getId: String = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def isStandardsMode: Boolean = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def loadComponent(componentName: String): Component = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def loadComponent(componentName: String, optAdvancedArgs: AnyRef): Component = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(index: Int): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def remove(widget: Widget): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setHeight(height: Int): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStandardsMode(standardsMode: Boolean): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setStyleAttribute(attribute: String, value: String): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setTitle(title: String): UiInstance = js.native
  /** Deprecated. This function is deprecated and should not be used in new scripts. */
  def setWidth(width: Int): UiInstance = js.native
}