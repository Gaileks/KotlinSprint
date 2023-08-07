package lesson_14

fun main() {
    val forumTopic = ForumTopic()
    val comment = Comment(forumTopic)

    forumTopic.addPost()
    comment.addComment()
    comment.getCommentInfo()

}

open class ForumTopic(
    open var authorsName: String? = null,
    open var messageText: String? = null,
    ) {

    fun addPost() {
        println("Укажите имя атора поста:")
        authorsName = readln()
        println("Напишите текст:")
        messageText = readln()
    }

    fun getPostInfo() {
        println("Имя: ${authorsName ?: "пусто"} Пост: ${messageText ?: "пусто"}")
    }
}

class Comment(
    private var forumTopic: ForumTopic,
    override var authorsName: String? = null,
    override var messageText: String? = null,
    private var comments: MutableList<String> = mutableListOf()
) : ForumTopic() {

    fun addComment() {

        do {
            println("Укажите имя атора комментария:")
            authorsName = readln()
            println("Напишите текст:")
            messageText = readln()
            comments.add("Имя: ${authorsName ?:"пусто"} Комментарий: ${messageText ?:"пусто"}")
            println("Для дополнительного коментария введите \"да\":")
        } while (readln().equals("да", ignoreCase = true))
    }

    fun getCommentInfo() {
        forumTopic.getPostInfo()
        if (comments.isNotEmpty()) {
            comments.forEach() {
                println(it)
            }
        } else{
            println("коментариев нет")
        }
    }
}