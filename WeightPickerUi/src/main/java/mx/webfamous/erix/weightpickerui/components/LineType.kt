package mx.webfamous.erix.weightpickerui.components

sealed class LineType {
    object Normal : LineType()
    object FiveStep : LineType()
    object TenStep : LineType()
}
