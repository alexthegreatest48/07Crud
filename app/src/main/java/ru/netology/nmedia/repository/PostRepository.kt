package ru.netology.nmedia.repository

import ru.netology.nmedia.dto.Post
import java.lang.Exception

interface PostRepository {
    fun getAll(callback: PostCallback<List<Post>>)
    fun likeById(post: Long, callback: PostCallback<Post>)
    fun save(post: Post, callback: PostCallback<Unit>)
    fun removeById(id: Long, callback: PostCallback<Unit>)
    fun unlikeById(post: Long, callback: PostCallback<Post>)

    interface PostCallback<T>{
        fun onSuccess(data: T)
        fun onError(e: Exception)
    }
}

