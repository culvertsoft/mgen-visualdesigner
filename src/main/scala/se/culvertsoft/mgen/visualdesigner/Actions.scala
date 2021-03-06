package se.culvertsoft.mgen.visualdesigner

import java.awt.event.KeyEvent

import javax.swing.Action
import se.culvertsoft.mgen.visualdesigner.HotKey.toStroke
import se.culvertsoft.mgen.visualdesigner.control.Controller
import se.culvertsoft.mgen.visualdesigner.control.ControllerListener
import se.culvertsoft.mgen.visualdesigner.view.MkAction
import se.culvertsoft.mgen.visualdesigner.window.GeneratorWindow

object Actions {

  object TreeView {

    def MOVE_UP(implicit c: Controller) = MkAction("Move Up", Icons.TreeView.Top.MOVE_UP, HotKey.ctrl(KeyEvent.VK_UP)) {
      c.moveUp()
    }
    def MOVE_DOWN(implicit c: Controller) = MkAction("Move Down", Icons.TreeView.Top.MOVE_DOWN, HotKey.ctrl(KeyEvent.VK_DOWN)) {
      c.moveDown()
    }
    def RENAME(implicit c: Controller) = MkAction("Rename", Icons.TreeView.Top.RENAME, "Rename selected item") {
      c.renameSelection()
    }
    def FIND_SELECTED(implicit c: Controller) = MkAction("Find Selected", Icons.TreeView.Top.FIND, "Find selected item") {
      c.viewMgr.findSelected()
    }

  }

  object DashBoard {

    object Top {

      def ALIGN_X_RIGHT_BTN(implicit c: Controller) = MkAction("Align to Right", Icons.DashBoard.Top.ALIGN_X_RIGHT_ICON) {
        c.alignmentMgr.alignSelectionXRight()
      }
      def ALIGN_X_CENTER_BTN(implicit c: Controller) = MkAction("Align to Center Horizontally", Icons.DashBoard.Top.ALIGN_X_CENTER_ICON) {
        c.alignmentMgr.alignSelectionXCenter()
      }
      def ALIGN_X_LEFT_BTN(implicit c: Controller) = MkAction("Align to Left", Icons.DashBoard.Top.ALIGN_X_LEFT_ICON) {
        c.alignmentMgr.alignSelectionXLeft()
      }

      def ALIGN_Y_TOP_BTN(implicit c: Controller) = MkAction("Align to Top", Icons.DashBoard.Top.ALIGN_Y_TOP_ICON) {
        c.alignmentMgr.alignSelectionYTop()
      }
      def ALIGN_Y_CENTER_BTN(implicit c: Controller) = MkAction("Align to Center Vertically", Icons.DashBoard.Top.ALIGN_Y_CENTER_ICON) {
        c.alignmentMgr.alignSelectionYCenter()
      }
      def ALIGN_Y_BOTTOM_BTN(implicit c: Controller) = MkAction("Align to Bottom", Icons.DashBoard.Top.ALIGN_Y_BOTTOM_ICON) {
        c.alignmentMgr.alignSelectionYBottom()
      }

      def SPREAD_EQUAL_X(implicit c: Controller) = MkAction("Spread even Horizontally", Icons.DashBoard.Top.SPREAD_EQUAL_X) {
        c.boundsMgr.spreadEqualX()
      }
      def SPREAD_EQUAL_Y(implicit c: Controller) = MkAction("Spread even Vertically", Icons.DashBoard.Top.SPREAD_EQUAL_Y) {
        c.boundsMgr.spreadEqualY()
      }

      def RESIZE_EQUAL_X(implicit c: Controller) = MkAction("Resize to same Width", Icons.DashBoard.Top.RESIZE_EQUAL_X) {
        c.boundsMgr.resizeSameWidth()
      }
      def RESIZE_EQUAL_Y(implicit c: Controller) = MkAction("Resize to same Height", Icons.DashBoard.Top.RESIZE_EQUAL_Y) {
        c.boundsMgr.resizeSameHeight()
      }

      def SPACE_OUT_X(implicit c: Controller) = MkAction("Space out Horizontally", Icons.DashBoard.Top.SPACE_OUT_X) {
        c.boundsMgr.spaceOutX()
      }
      def SPACE_OUT_Y(implicit c: Controller) = MkAction("Space out Vertically", Icons.DashBoard.Top.SPACE_OUT_Y) {
        c.boundsMgr.spaceOutY()
      }

      def LAY_OUT(implicit c: Controller) = MkAction("Lay out Entities", Icons.DashBoard.Top.LAY_OUT) {
        c.boundsMgr.layOut(false)
      }
      /*
      def GENERATE(implicit c: Controller) = MkAction("Generate Code", Icons.DashBoard.Top.GENERATE) {
        c.generateMgr.generate()
      }*/
    }

    object Left {

      def GO_UP(implicit c: Controller) = MkAction("Go Up", Icons.DashBoard.Left.GO_UP, "Set the view root to one level above") {
        c.viewMgr.goUp()
      }
      def GO_BACK(implicit c: Controller) = MkAction("Go Back", Icons.DashBoard.Left.GO_BACK, "Go back to the previous view root") {
        c.viewMgr.goBack()
      }
      def GO_FORWARD(implicit c: Controller) = MkAction("Go Forward", Icons.DashBoard.Left.GO_FORWARD, "Go forward to the next view root") {
        c.viewMgr.goForward()
      }
      def SET_VIEW_ROOT(implicit c: Controller) = MkAction("Set as View Root", Icons.DashBoard.Left.VIEW_SELECTED, "Set View Root: Sets the selected entity as the view root") {
        c.viewMgr.setSelectedAsRootView()
      }
      def TOGGLE_FULL_SCREEN(implicit c: Controller) = MkAction("Maximize", Icons.DashBoard.Left.TOGGLE_FULL_SCREEN, "Maximize: Removes toolbars and package explorer (left side column)") {
        c.viewMgr.maximize()
      }
      def RESET_VIEW_ROOT(implicit c: Controller) = MkAction("Reset View Root", Icons.DashBoard.Left.RESET_VIEW, "Reset the view root back to the top level project") {
        c.viewMgr.resetViewRoot()
      }
      def NEW_MODULE(implicit c: Controller) = MkAction("New Module", Icons.DashBoard.Left.NEW_MODULE) {
        c.entityAddMgr.addModule()
      }
      def NEW_TYPE(implicit c: Controller) = MkAction("New Class/Type", Icons.DashBoard.Left.NEW_CLASS) {
        c.entityAddMgr.addType()
      }
      def NEW_ENUM(implicit c: Controller) = MkAction("New Enumeration", Icons.DashBoard.Left.NEW_ENUM) {
        c.entityAddMgr.addEnum()
      }
      def NEW_FIELD(implicit c: Controller) = MkAction("Add Field/Entry", Icons.DashBoard.Left.NEW_FIELD, "Add field/entry to selected class/enum") {
        c.entityAddMgr.addFieldOrEntry()
      }

    }

  }

  object MainMenu {

    object File {
      def NEW(implicit c: Controller) = MkAction("New Project", HotKey.ctrl('N')) {
        c.saveMgr.startNewProject()
      }
      def LOAD(implicit c: Controller) = MkAction("Open Project", HotKey.ctrl('O')) {
        c.saveMgr.loadFromFile()
      }
      def SAVE(implicit c: Controller) = MkAction("Save Project", HotKey.ctrl('S')) {
        c.saveMgr.save()
      }
      def SAVE_AS(implicit c: Controller) = MkAction("Save Project As", HotKey.ctrl().shift('S')) {
        c.saveMgr.saveAs()
      }
      def EXIT(implicit c: Controller) = MkAction("Exit", HotKey.alt(KeyEvent.VK_F4)) {
        c.saveMgr.closeApplication()
      }
    }

    object Edit {

      def UNDO(implicit c: Controller) = MkAction("Undo", HotKey.ctrl('Z')) {
        c.undoMgr.undo()
      }
      def REDO(implicit c: Controller) = MkAction("Redo", HotKey.ctrl('Y')) {
        c.undoMgr.redo()
      }

      def CUT(implicit c: Controller) = MkAction("Cut", HotKey.ctrl('X')) {
        c.copyPasteMgr.cutSelectionToClipBoard()
      }
      def COPY(implicit c: Controller) = MkAction("Copy", HotKey.ctrl('C')) {
        c.copyPasteMgr.copySelectionToClipBoard()
      }
      def PASTE(implicit c: Controller) = MkAction("Paste", HotKey.ctrl('V')) {
        c.copyPasteMgr.pasteFromClipBoard()
      }

      def FIND_BY_NAME(implicit c: Controller) = MkAction("Find", HotKey.ctrl('F'), "Find item by name") {
        c.viewMgr.findByName()
      }

      def FIND_SELECTED(implicit c: Controller) = MkAction("Find Selected", HotKey.ctrl().shift('F'), "Find selected item") {
        c.viewMgr.findSelected()
      }

      def SELECT_ALL(implicit c: Controller) = MkAction("Select All", HotKey.ctrl('A')) {
        c.selectAll()
      }
      def DESELECT_ALL(implicit c: Controller) = MkAction("Clear Selection", HotKey.ctrl('Q')) {
        c.deselectAll(null)
      }
      def RENAME(implicit c: Controller) = MkAction("Rename", HotKey.alt('M'), "Rename selected item") {
        c.renameSelection()
      }
      def DELETE(implicit c: Controller) = MkAction("Delete", HotKey(KeyEvent.VK_DELETE), "Delete selected items") {
        c.entityAddMgr.deleteSelection()
      }
    }

    object View {

      def GO_UP(implicit c: Controller) = MkAction("Go Up", HotKey.alt(KeyEvent.VK_UP), "Set the view root to one level above") {
        c.viewMgr.goUp()
      }
      def GO_BACK(implicit c: Controller) = MkAction("Go Back", HotKey.alt(KeyEvent.VK_LEFT), "Go back to the previous view root") {
        c.viewMgr.goBack()
      }
      def GO_FORWARD(implicit c: Controller) = MkAction("Go Forward", HotKey.alt(KeyEvent.VK_RIGHT), "Go forward to the next view root") {
        c.viewMgr.goForward()
      }

      def SET_VIEW_ROOT(implicit c: Controller) = MkAction("Set as View Root", HotKey.ctrl(KeyEvent.VK_ENTER), "Set View Root: Sets the selected entity as the view root") {
        c.viewMgr.setSelectedAsRootView()
      }
      def TOGGLE_FULL_SCREEN(implicit c: Controller) = MkAction("Maximize", HotKey.alt(KeyEvent.VK_ENTER), "Maximize: Removes toolbars and package explorer (left side column)") {
        c.viewMgr.maximize()
      }

      def RESET_VIEW_ROOT(implicit c: Controller) = MkAction("Reset View Root", HotKey.alt(KeyEvent.VK_BACK_SPACE), "Reset the view root to the top level project") {
        c.viewMgr.resetViewRoot()
      }

      def ICONS_ONLY_VIEW(implicit c: Controller) = {

        val uncheckedName = "Simple view "
        val checkedName = "Simple view <on> "

        val out = MkAction(uncheckedName, HotKey.ctrl(KeyEvent.VK_I), "Force all dashboard items show minimal details") {
          c.viewMgr.toggleIconOverride()
        }
        c.addObserver(new ControllerListener() {
          override def onIconOverrideChanged() {
            out.putValue(Action.NAME, if (c.viewMgr.isIconOverrideActive) checkedName else uncheckedName)
          }
        })
        out
      }

      def REBUILD_VIEW(implicit c: Controller) = MkAction("Rebuild View", HotKey.ctrl('R'), "Rebuild the view (Useful if it loses synchronizeation with the model due to a bug)") {
        c.rebuildView(false, false)
      }

    }

    object Tools {

      def NEW_MODULE(implicit c: Controller) = MkAction("New Module", HotKey.ctrl('M')) {
        c.entityAddMgr.addModule()
      }
      def NEW_TYPE(implicit c: Controller) = MkAction("New Class/Type", HotKey.ctrl('T')) {
        c.entityAddMgr.addType()
      }
      def NEW_ENUM(implicit c: Controller) = MkAction("New Enumeration", HotKey.ctrl('E')) {
        c.entityAddMgr.addEnum()
      }
      def NEW_FIELD(implicit c: Controller) = MkAction("Add Field/Entry", HotKey.ctrl(KeyEvent.VK_ADD), "Add field/entry to selected class/enum") {
        c.entityAddMgr.addFieldOrEntry()
      }

      def ALIGN_X_RIGHT_BTN(implicit c: Controller) = MkAction("Align to Right", HotKey.ctrl(KeyEvent.VK_RIGHT)) {
        c.alignmentMgr.alignSelectionXRight()
      }
      def ALIGN_X_CENTER_BTN(implicit c: Controller) = MkAction("Align to Center Horizontally", HotKey.ctrl().shift(KeyEvent.VK_LEFT)) {
        c.alignmentMgr.alignSelectionXCenter()
      }
      def ALIGN_X_LEFT_BTN(implicit c: Controller) = MkAction("Align to Left", HotKey.ctrl(KeyEvent.VK_LEFT)) {
        c.alignmentMgr.alignSelectionXLeft()
      }

      def ALIGN_Y_TOP_BTN(implicit c: Controller) = MkAction("Align to Top", HotKey.ctrl(KeyEvent.VK_UP)) {
        c.alignmentMgr.alignSelectionYTop()
      }
      def ALIGN_Y_CENTER_BTN(implicit c: Controller) = MkAction("Align to Center Vertically", HotKey.ctrl().shift(KeyEvent.VK_UP)) {
        c.alignmentMgr.alignSelectionYCenter()
      }
      def ALIGN_Y_BOTTOM_BTN(implicit c: Controller) = MkAction("Align to Bottom", HotKey.ctrl(KeyEvent.VK_DOWN)) {
        c.alignmentMgr.alignSelectionYBottom()
      }

      def SPREAD_EQUAL_X(implicit c: Controller) = MkAction("Spread even Horizontally", HotKey.ctrl().shift(KeyEvent.VK_RIGHT)) {
        c.boundsMgr.spreadEqualX()
      }
      def SPREAD_EQUAL_Y(implicit c: Controller) = MkAction("Spread even Vertically", HotKey.ctrl().shift(KeyEvent.VK_DOWN)) {
        c.boundsMgr.spreadEqualY()
      }

      def RESIZE_EQUAL_X(implicit c: Controller) = MkAction("Resize to same Width", HotKey.ctrl('W')) {
        c.boundsMgr.resizeSameWidth()
      }
      def RESIZE_EQUAL_Y(implicit c: Controller) = MkAction("Resize to same Height", HotKey.ctrl('H')) {
        c.boundsMgr.resizeSameHeight()
      }

      def SPACE_OUT_X(implicit c: Controller) = MkAction("Space out Horizontally", HotKey.ctrl().alt(KeyEvent.VK_RIGHT)) {
        c.boundsMgr.spaceOutX()
      }
      def SPACE_OUT_Y(implicit c: Controller) = MkAction("Space out Vertically", HotKey.ctrl().alt(KeyEvent.VK_DOWN)) {
        c.boundsMgr.spaceOutY()
      }

      def LAY_OUT(implicit c: Controller) = MkAction("Lay out Entities", HotKey.ctrl(KeyEvent.VK_D)) {
        c.boundsMgr.layOut(false)
      }

      def LAY_OUT_AND_RESIZE(implicit c: Controller) = MkAction("Lay out and resize Entities", HotKey.ctrl().shift(KeyEvent.VK_D)) {
        c.boundsMgr.layOut(true)
      }

      def GENERATE(implicit c: Controller) = MkAction("Generate Code", HotKey.ctrl('G')) {
        c.generateMgr.generate()
      }

    }

    object Settings {
      def GENERATION(implicit c: Controller) = MkAction("Generator Settings", HotKey.ctrl('G')) {
        new GeneratorWindow(c)
      }
    }

    object About {
      def HELP(implicit c: Controller) = MkAction("Help", HotKey(KeyEvent.VK_F1)) {
      }
      def ABOUT(implicit c: Controller) = MkAction("About", HotKey(KeyEvent.VK_F2)) {
      }
    }

  }

  object Impl {

  }

}
