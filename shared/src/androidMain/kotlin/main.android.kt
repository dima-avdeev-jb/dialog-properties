import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = App()

@Composable
fun Todo() {
    DialogProperties(decorFitsSystemWindows = true, usePlatformDefaultWidth = true)
}
