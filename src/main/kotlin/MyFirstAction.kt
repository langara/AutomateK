import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class MyFirstAction: AnAction("My first action") {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project!!
        Messages.showMessageDialog(project, "Hey folks!", "Say hi", Messages.getInformationIcon())
    }
}