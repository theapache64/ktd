@file:Suppress(
    "unused"
)
@file:UseExperimental(
    BotsOnly::class,
    TestingOnly::class
)

package dev.whyoleg.ktd.api.ton

import dev.whyoleg.ktd.*
import dev.whyoleg.ktd.api.*
import dev.whyoleg.ktd.api.TdApi.*

/**
 * Returns a salt to be used with locally stored password to access a local TON-based wallet
 */
suspend fun TelegramClient.getTonWalletPasswordSalt(): TonWalletPasswordSalt = ton(
    GetTonWalletPasswordSalt()
)

/**
 * Returns a salt to be used with locally stored password to access a local TON-based wallet
 */
suspend fun TelegramClient.ton(
    f: GetTonWalletPasswordSalt
): TonWalletPasswordSalt = exec(f) as TonWalletPasswordSalt
