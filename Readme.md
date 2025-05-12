**Пример паттерна плагин**
- модуль TextFormatter [TextFormatterPlugin.java](TextFormatter/src/main/java/com/example/TextFormatterPlugin.java)
хранит в себе только интерфейс, который должен быть доступен в других модулях
- модуль markdown-plugin содержит [MarkdownFormatter.java](markdown-plugin/src/main/java/com/example/MarkdownFormatter.java) 
плагин - форматтер текста. 
В качестве зависимости он подключается к проекту 
TextEditor - основному проекту, в котором используется этот плагин
- файл [com.example.TextFormatterPlugin](markdown-plugin/src/main/resources/META-INF/services/com.example.TextFormatterPlugin) нужен, чтобы ServiceLoader увидел имплементацию 
интерфейса [com.example.TextFormatterPlugin](markdown-plugin/src/main/resources/META-INF/services/com.example.TextFormatterPlugin)


**Проверка себя**
Сделать еще один плагин по типу markdown-plugin, только с другой реализацией. Тогда 
в TextEditor в plugins должно быть уже два плагина, которые по очереди применятся к String text