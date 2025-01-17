//
// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL version '4.0.0-beta.6'.
//
package com.valoy.events.type

import com.apollographql.apollo3.api.BuilderFactory
import com.apollographql.apollo3.api.BuilderScope
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.ObjectBuilder
import com.apollographql.apollo3.api.ObjectType
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Some type description
 */
public class UserDTO {
  public companion object : BuilderFactory<UserDTOBuilder> {
    public val type: ObjectType = ObjectType.Builder(name = "UserDTO").build()

    override fun newBuilder(customScalarAdapters: CustomScalarAdapters): UserDTOBuilder =
        UserDTOBuilder(customScalarAdapters)
  }
}

public class UserDTOBuilder(
  customScalarAdapters: CustomScalarAdapters,
) : ObjectBuilder<UserDTOMap>(customScalarAdapters) {
  public var email: String by __fields

  public var id: Int by __fields

  public var lastname: String by __fields

  public var name: String by __fields

  init {
    __typename = "UserDTO"}

  override fun build(): UserDTOMap = UserDTOMap(__fields)
}

public class UserDTOMap(
  __fields: Map<String, Any?>,
) : Map<String, Any?> by __fields

public fun BuilderScope.buildUserDTO(block: UserDTOBuilder.() -> Unit): UserDTOMap =
    UserDTOBuilder(customScalarAdapters).apply(block).build()
