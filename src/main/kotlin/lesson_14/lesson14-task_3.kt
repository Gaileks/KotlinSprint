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
        println("Имя: ${authorsName ?:"пусто"} Пост: ${messageText ?:"пусто"}")
    }
}

class Comment(
    private var forumTopic: ForumTopic,
    override var authorsName: String? = null,
    override var messageText: String? = null,
) : ForumTopic() {

    fun addComment() {
        println("Укажите имя атора комментария:")
        authorsName = readln()
        println("Напишите текст:")
        messageText = readln()
    }

    fun getCommentInfo() {
        forumTopic.getPostInfo()
        println("Имя: ${authorsName ?:"пусто"} Комментарий: ${messageText ?:"пусто"}")
    }
}