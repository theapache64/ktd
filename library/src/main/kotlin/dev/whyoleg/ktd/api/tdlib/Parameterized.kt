@file:Suppress(
    "unused"
)
@file:UseExperimental(
    BotsOnly::class,
    TestingOnly::class
)

package dev.whyoleg.ktd.api.tdlib

import dev.whyoleg.ktd.*
import dev.whyoleg.ktd.api.*
import dev.whyoleg.ktd.api.TdApi.*

/**
 * Sets the parameters for TDLib initialization
 * Works only when the current authorization state is authorizationStateWaitTdlibParameters
 *
 * @parameters - Parameters
 */
suspend fun TelegramClient.setTdlibParameters(
    parameters: TdlibParameters
): Ok = tdlib(
    SetTdlibParameters(
        parameters
    )
)